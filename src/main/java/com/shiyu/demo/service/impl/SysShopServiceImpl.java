package com.shiyu.demo.service.impl;

import com.shiyu.demo.entity.AuthCode;
import com.shiyu.demo.entity.ShopLog;
import com.shiyu.demo.mapper.AuthCodeMapper;
import com.shiyu.demo.mapper.ShopLogMapper;
import com.shiyu.demo.service.SysShopService;
import com.shiyu.demo.utils.HttpUtil;
import com.shiyu.demo.utils.JsonUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author shkstart
 * @create 2019-04-19 9:41
 */
@Service
public class SysShopServiceImpl implements SysShopService {

    @Resource
    private AuthCodeMapper authCodeMapper;

    @Resource
    private ShopLogMapper shopLogMapper;

    @Override
    public void doSendCode(String shopphone, String code) throws Exception {//短信发送
        authCodeMapper.deleteCode(shopphone);//删除原来的验证码
        AuthCode authCode = new AuthCode();
        authCode.setCode(code);
        authCode.setUserphone(shopphone);
        authCodeMapper.addCode(authCode);
        //短信发送
        String url="http://v.juhe.cn/sms/send?mobile="
                + shopphone + "&tpl_id=151723&tpl_value=%23code%23%3D"
                + code + "&key=ed3c1fc13f93f92817c6d95096b64a4a";
        String result = HttpUtil.doPost(url, null);
        Map<String,Object> map = (HashMap) JsonUtil.getObj(result, HashMap.class);
        if((int)map.get("error_code")!=0){
            throw new Exception((String) map.get("reason"));
        }
    }

    @Override
    public AuthCode getCodeByMobile(String shopphone) {//根据手机号判断是否发送过验证码
        return authCodeMapper.getCodeByMobile(shopphone);
    }

    @Override
    public void deleteCode(String shopphone) {//验证码过期删除验证码
        authCodeMapper.deleteCode(shopphone);
    }

    @Override
    public int getShopCountByMobile(String shopphone) {//判断手机号是否注册过
        return shopLogMapper.getShopCountByMobile(shopphone);
    }

    @Override
    public void addShop(ShopLog shopLog) {//手机号和密码的注册
        shopLogMapper.addShop(shopLog);
    }

    @Override
    public int updateShopname(ShopLog shopLog) {
        return shopLogMapper.updateShopname(shopLog);
    }


    @Override
    public Integer getShopId(String shopphone) {
        return shopLogMapper.getShopId(shopphone);
    }

    @Override
    public Integer getShop(String shopphone) {
        return shopLogMapper.getShop(shopphone);
    }
}