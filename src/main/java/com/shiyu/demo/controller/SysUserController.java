package com.shiyu.demo.controller;

import com.shiyu.demo.entity.AuthCode;
import com.shiyu.demo.entity.UserLog;
import com.shiyu.demo.service.SysUserService;
import com.shiyu.demo.utils.AccountUtil;
import com.shiyu.demo.utils.R;
import org.apache.ibatis.annotations.Param;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author shkstart
 * @create 2019-04-11 21:05
 */

@RestController
@CrossOrigin   //解决前后端跨域的注解
public class SysUserController {
    @Resource
    private SysUserService sysUserService;


    @RequestMapping("/code")

    public Map<String,Object> code(@RequestBody UserLog userLog){//手机发送验证码
        System.out.println(userLog.getUserphone());
        Map<String, Object> result = new HashMap<>();
        if(!AccountUtil.isMobile(userLog.getUserphone())){
            result.put("message","请输入手机号");
            return result;
        }
        //判断是否发送过验证码
        if(sysUserService.getCodeByMobile(userLog.getUserphone())!=null){
            result.put("message","已发送过验证码");
            return result;
        }
        //注册时判断手机号是否被占用
        if(sysUserService.getUserCountByMobile(userLog.getUserphone())>0){
            result.put("message","手机号已被占用");
            return result;
        }
        String conde = AccountUtil.getRandomConde(6);//6位验证码
        try {
            sysUserService.doSendCode(userLog.getUserphone(),conde);
            result.put("status",true);
        } catch (Exception e) {
            result.put("message",e.getMessage());
        }
        return result;
    }

    private static final long FIVE_MINUTES =1000*60*5;//验证码过期时间
    @RequestMapping("userRegist")
    public R addUserList(@RequestBody UserLog userLog){
        System.out.println(userLog.getUserphone());
        System.out.println(userLog.getCode());
        try {
            if(!AccountUtil.isMobile(userLog.getUserphone())){
                throw new Exception("请输入正确手机号");
            }
            if(StringUtils.isEmpty(userLog.getCode())){
                throw new Exception("请输入验证码");
            }
            if(sysUserService.getUserCountByMobile(userLog.getUserphone())>0){
                throw new Exception("账号已存在");
            }
            AuthCode mobileCode = sysUserService.getCodeByMobile(userLog.getUserphone());
            System.out.println(mobileCode.getCode());
            System.out.println(mobileCode.getUserphone());
            Date date = new Date();
            if(mobileCode==null || !userLog.getCode().equals(mobileCode.getCode())){
                throw new Exception("验证码无效");
            }
            sysUserService.deleteCode(userLog.getUserphone());//删除验证码
            if(date.getTime()-mobileCode.getCreatedTime().getTime()>FIVE_MINUTES){
                throw new Exception("验证码已过期");
            }
           /* UserLog userLog = new UserLog();
            userLog.setUserphone(userLog.getUserphone());
            userLog.setUserpwd(userpwd);*/
            sysUserService.addUser(userLog);
        } catch (Exception e) {
            return R.error().put("message",e.getMessage());
        }
        return R.ok();
    }
}