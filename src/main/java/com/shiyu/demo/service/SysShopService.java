package com.shiyu.demo.service;

import com.shiyu.demo.entity.AuthCode;
import com.shiyu.demo.entity.ShopLog;
import com.shiyu.demo.entity.UserLog;

/**
 * @author shkstart
 * @create 2019-04-19 9:37
 */
public interface SysShopService {
    void doSendCode(String shopphone,String code)throws Exception;//验证码注册

    AuthCode getCodeByMobile(String shopphone);//根据手机号查询验证码

    void deleteCode(String shopphone);//根据手机号删除验证码

    int getShopCountByMobile(String shopphone);//查询是否注册过

    void addShop(ShopLog shopLog);//注册

    int updateShopname(ShopLog shopLog);

    Integer getShopId(String shopphone);//根据手机号查询主键id

    Integer getShop(String shopphone);
}