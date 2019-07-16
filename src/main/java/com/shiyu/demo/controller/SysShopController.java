package com.shiyu.demo.controller;

import com.shiyu.demo.entity.AuthCode;
import com.shiyu.demo.entity.ShopLog;
import com.shiyu.demo.entity.UserLog;
import com.shiyu.demo.service.SysShopService;
import com.shiyu.demo.utils.AccountUtil;
import com.shiyu.demo.utils.R;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author shkstart
 * @create 2019-04-19 9:55
 */
@CrossOrigin
@RestController
public class SysShopController {
    @Resource
    private SysShopService sysShopService;

    @RequestMapping("code1")
    public Map<String,Object> code(@RequestBody ShopLog shopLog) {//手机发送验证码
        System.out.println(shopLog.getShopphone());
        Map<String, Object> result = new HashMap<>();
        if(!AccountUtil.isMobile(shopLog.getShopphone())){
            result.put("message","请输入手机号");
            return result;
        }
        //判断是否发送过验证码
        if(sysShopService.getCodeByMobile(shopLog.getShopphone())!=null){
            result.put("message","已发送过验证码");
            return result;
        }
        //注册时判断手机号是否被占用
        if(sysShopService.getShopCountByMobile(shopLog.getShopphone())>0){
            result.put("message","手机号已被占用");
            return result;
        }
        String conde = AccountUtil.getRandomConde(6);//6位验证码
        try {
            sysShopService.doSendCode(shopLog.getShopphone(),conde);
            result.put("status",true);
        } catch (Exception e) {
            result.put("message",e.getMessage());
        }
        return result;
    }

    private static final long FIVE_MINUTES =1000*60*5;

    @RequestMapping("shopRegist")
    public R addUserList(@RequestBody ShopLog shopLog){
        //String message=null;
        try {
            if(!AccountUtil.isMobile(shopLog.getShopphone())){
                throw new Exception("请输入正确手机号");
            }
            if(StringUtils.isEmpty(shopLog.getCode())){
                throw new Exception("请输入验证码");
            }
           if(sysShopService.getShopCountByMobile(shopLog.getShopphone())>0){
               throw new Exception("账号已存在");
           }
            AuthCode codeByMobile = sysShopService.getCodeByMobile(shopLog.getShopphone());
            Date date1 = new Date();
            if(codeByMobile==null || !shopLog.getCode().equals(codeByMobile.getCode())){
                throw new Exception("验证码无效");
            }
            sysShopService.deleteCode(shopLog.getShopphone());//删除验证码
            if(date1.getTime()-codeByMobile.getCreatedTime().getTime()>FIVE_MINUTES){
                throw new Exception("验证码已过期");
            }
            if(shopLog.getShoppwd()==null || shopLog.getShopphone().trim().length()<0){
                throw new Exception("密码不能为空");
            }
          /* ShopLog shopLog = new ShopLog();
           shopLog.setShopphone(shopLog.getShopphone());
           shopLog.setShoppwd(shopLog.getShopphone());*/
           sysShopService.addShop(shopLog);
        } catch (Exception e) {
            return R.error().put("message",e.getMessage());
        }
        Integer shopId = sysShopService.getShopId(shopLog.getShopphone());
        System.out.println(shopId);
        return R.ok().put("shopId",shopId);
    }

    @RequestMapping("shopaddress")
    public R updateShopname(@RequestBody ShopLog shopLog){
        System.out.println(shopLog.getShopphone());
        System.out.println(shopLog.getShopname());
        try {
            if(shopLog.getShopads()==null || shopLog.getShopads().trim().length()<0){
                throw new Exception("商铺注册地址不能为空");
            }
            if(shopLog.getShopname()==null || shopLog.getShopname().trim().length()<0){
                throw new Exception("店铺名不能为空");
            }
            /*ShopLog shopLog = new ShopLog();
            shopLog.setShopads(shopLog.getShopads());
            shopLog.setShopname(shopLog.getShopname());
            shopLog.setShopid(shopid);*/
            int i = sysShopService.updateShopname(shopLog);
            if(i<=0){
                throw new Exception("店铺认领失败");
            }
        } catch (Exception e) {
            return R.error().put("message",e.getMessage());
        }
        return R.ok();
    }
}