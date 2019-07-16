package com.shiyu.demo.service;

import com.shiyu.demo.entity.AuthCode;
import com.shiyu.demo.entity.UserLog;
import com.shiyu.demo.utils.R;

/**
 * @author shkstart
 * @create 2019-04-11 20:23
 */
public interface SysUserService {
    void doSendCode(String userphone,String code)throws Exception;//验证码注册

    AuthCode getCodeByMobile(String userphone);//根据手机号查询验证码

    int getUserCountByMobile(String userphone);//查询是否注册过

    void deleteCode(String userphone);//根据手机号删除验证码

    void addUser(UserLog userLog);//注册



}