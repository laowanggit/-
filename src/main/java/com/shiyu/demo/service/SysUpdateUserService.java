package com.shiyu.demo.service;

import com.shiyu.demo.entity.AuthCode;
import com.shiyu.demo.entity.UserLog;

/**
 * @author shkstart
 * @create 2019-04-20 10:58
 */
public interface SysUpdateUserService {

    void doSendCode(String userphone,String code)throws Exception;//验证码注册

    AuthCode getCodeByMobile(String userphone);//根据手机号查询验证码

    int getUserCountByMobile(String userphone);//查询是否注册过

    void deleteCode(String userphone);//根据手机号删除验证码

    Integer getUserCountById(String userphone);

    int updateUserpwd(UserLog userLog);
}
