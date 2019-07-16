package com.shiyu.demo.service.impl;

import com.shiyu.demo.entity.AuthCode;
import com.shiyu.demo.entity.UserLog;
import com.shiyu.demo.mapper.AuthCodeMapper;
import com.shiyu.demo.mapper.UserLogMapper;
import com.shiyu.demo.service.SysUpdateUserService;
import com.shiyu.demo.utils.HttpUtil;
import com.shiyu.demo.utils.JsonUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author shkstart
 * @create 2019-04-20 11:00
 */
@Service
public class SysUpdateUserServiceImpl implements SysUpdateUserService {

    @Resource
    private UserLogMapper userLogMapper;

    @Resource
    private AuthCodeMapper authCodeMapper;

    @Override
    public void doSendCode(String userphone, String code) throws Exception {
        authCodeMapper.deleteCode(userphone);
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
    public AuthCode getCodeByMobile(String userphone) {
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
    public Integer getUserCountById(String userphone) {
        return userLogMapper.getUserCountById(userphone);
    }

    @Override
    public int updateUserpwd(UserLog userLog) {
        return userLogMapper.updateUserpwd(userLog);
    }


}