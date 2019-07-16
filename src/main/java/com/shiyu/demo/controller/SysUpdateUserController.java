package com.shiyu.demo.controller;

import com.shiyu.demo.entity.AuthCode;
import com.shiyu.demo.entity.UserLog;
import com.shiyu.demo.service.SysShopService;
import com.shiyu.demo.service.SysUpdateUserService;
import com.shiyu.demo.utils.AccountUtil;
import com.shiyu.demo.utils.R;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author shkstart
 * @create 2019-04-20 11:09
 */
@CrossOrigin
@RestController
public class SysUpdateUserController {

    @Resource
    private SysUpdateUserService sysUpdateUserService;

    @Resource
    private SysShopService sysShopService;

    @RequestMapping("code2")
    public Map<String,Object> code(@RequestBody UserLog userLog){//手机发送验证码
        System.out.println(userLog.getUserphone());
        Map<String, Object> result = new HashMap<>();
        if(!AccountUtil.isMobile(userLog.getUserphone())){
            result.put("message","请输入手机号");
            return result;
        }
        //判断是否发送过验证码
        if(sysUpdateUserService.getCodeByMobile(userLog.getUserphone())!=null){
            result.put("message","已发送过验证码");
            return result;
        }
       /* //注册时判断手机号是否被占用
        if(sysUpdateUserService.getUserCountByMobile(userLog.getUserphone())>0){
            result.put("message","手机号已被占用");
            return result;
        }*/
        String conde = AccountUtil.getRandomConde(6);//6位验证码
        try {
            sysUpdateUserService.doSendCode(userLog.getUserphone(),conde);
            result.put("status",true);
        } catch (Exception e) {
            result.put("message",e.getMessage());
        }
        return result;
    }

    private static final long FIVE_MINUTES =1000*60*5;
    @RequestMapping("changepwd")
    public R addUserList(@RequestBody UserLog userLog){
        System.out.println("1111111111111111");
        System.out.println(userLog.getUserphone());
        System.out.println(userLog.getCode());
        try {
            if(!AccountUtil.isMobile(userLog.getUserphone())){
                throw new Exception("请输入正确手机号");
            }
            if(StringUtils.isEmpty(userLog.getCode())){
                throw new Exception("请输入验证码");
            }
           /* if(sysUpdateUserService.getUserCountByMobile(userphone)>0){
                throw new Exception("账号已存在");
            }*/
            AuthCode mobileCode = sysUpdateUserService.getCodeByMobile(userLog.getUserphone());
            Date date = new Date();
            if(mobileCode==null || !userLog.getCode().equals(mobileCode.getCode())){
                throw new Exception("验证码无效");
            }
            sysUpdateUserService.deleteCode(userLog.getUserphone());//删除验证码
            if(date.getTime()-mobileCode.getCreatedTime().getTime()>FIVE_MINUTES){
                throw new Exception("验证码已过期");
            }
        } catch (Exception e) {
            return R.error().put("message",e.getMessage());
        }
        Integer userCountById=null;
        try {
            userCountById   = sysUpdateUserService.getUserCountById(userLog.getUserphone());//查询用户的id
            System.out.println(userCountById);
            if(userCountById==null){
                throw new Exception("用户不存在");
            }
        } catch (Exception e) {
            return R.error().put("message",e.getMessage());
        }
        return R.ok().put("userCountById",userCountById);
    }
    @RequestMapping("updateUserPwd")
    public R updateUserPwd(@RequestBody UserLog userLog){
        System.out.println(userLog.getUserpwd());
        System.out.println(userLog.getUserid());
       /* UserLog userLog = new UserLog();
        userLog.setUserid(userLog.getUserid());
        userLog.setUserpwd(userLog.getUserpwd());*/
        try {
            if(userLog.getUserpwd()==null || userLog.getUserpwd().trim().length()<0){
                throw new Exception("密码不能为空");
            }
            int i = sysUpdateUserService.updateUserpwd(userLog);
            if(i<=0){
                throw new Exception("修改失败");
            }
        } catch (Exception e) {
            return R.error().put("message",e.getMessage());
        }
        return R.ok();
    }
}