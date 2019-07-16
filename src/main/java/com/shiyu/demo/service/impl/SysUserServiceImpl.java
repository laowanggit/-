package com.shiyu.demo.service.impl;

import com.shiyu.demo.entity.AuthCode;
import com.shiyu.demo.entity.UserLog;
import com.shiyu.demo.mapper.AuthCodeMapper;
import com.shiyu.demo.mapper.UserLogMapper;
import com.shiyu.demo.service.SysUserService;
import com.shiyu.demo.utils.HttpUtil;
import com.shiyu.demo.utils.JsonUtil;
import com.shiyu.demo.utils.R;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author shkstart
 * @create 2019-04-11 20:45
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private UserLogMapper userLogMapper;

    @Resource
    private AuthCodeMapper authCodeMapper;


    @Override
    public void doSendCode(String userphone, String code) throws Exception{//注册
        //userLogMapper.deleteCode(userphone);//删除原来的验证码
        authCodeMapper.deleteCode(userphone);
        //UserLog userLog = new UserLog();
        AuthCode authCode = new AuthCode();
        authCode.setCode(code);
        authCode.setUserphone(userphone);
        authCodeMapper.addCode(authCode);
        //短信发送
        String url="http://v.juhe.cn/sms/send?mobile="
                + userphone + "&tpl_id=151723&tpl_value=%23code%23%3D"
                + code + "&key=ed3c1fc13f93f92817c6d95096b64a4a";
        String result = HttpUtil.doPost(url, null);
        Map<String,Object> map = (HashMap) JsonUtil.getObj(result, HashMap.class);
        if((int)map.get("error_code")!=0){
            throw new Exception((String) map.get("reason"));
        }
    }

    @Override
    public AuthCode getCodeByMobile(String userphone) {//根据手机号查询验证码是否注册过
        //return userLogMapper.getCodeByMobile(userphone);
        return authCodeMapper.getCodeByMobile(userphone);
    }

    @Override
    public int getUserCountByMobile(String userphone) {
        return userLogMapper.getUserCountByMobile(userphone);
    }

    @Override
    public void deleteCode(String userphone) {
        authCodeMapper.deleteCode(userphone);
    }

    @Override
    public void addUser(UserLog userLog) {
        userLogMapper.addUser(userLog);
    }
}