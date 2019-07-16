package com.shiyu.demo.utils;

import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.util.StringUtils;

import java.io.File;
import java.util.Random;

public class AccountUtil {

    public static int getAccountType(String account) {
        if (isAccount(account)) {
            return ExamConstants.ACCOUNT_USERNAME;
        } else if (isMobile(account)) {
            return ExamConstants.ACCOUNT_MOBILE;
        }
        return ExamConstants.ACCOUNT_UNKNOWN;
    }

    /**
     * 6-12位的字母或数字，不能以数字开头
     *
     * @param account
     * @return
     */
    public static boolean isAccount(String account) {
        if (StringUtils.isEmpty(account)) {
            return false;
        }
        String reg = "^[a-zA-Z][a-zA-Z0-9]{5,11}$";
        return account.matches(reg);
    }
    public static boolean isEmail(String email) {
        if (StringUtils.isEmpty(email)) {
            return false;
        }
        String reg = "^^([A-Za-z0-9_\\-\\.])+\\@([A-Za-z0-9_\\-\\.])+\\.([A-Za-z]{2,4})$+$";
        return email.matches(reg);
    }

    public static boolean isMobile(String account) {
        if (StringUtils.isEmpty(account)) {
            return false;
        }
        String reg = "^1[3-9]\\d{9}$";
        return account.matches(reg);
    }

    public static String getRandomConde(int len) {//手机验证码的位数
        String str = "";
        for (int i = 0; i < len; i++) {
            str += new Random().nextInt(6);
        }
        return str;
    }

    public static void main(String[] args) throws Exception { //
        //MailUtil.sentAttachmentMail("codingmeng@foxmail.com ", "测试附件", "<a href=\"http://www.baidu.com\">百度一下，你就知道</a>", true, new File("d:/1811.txt"));
        System.out.println(AccountUtil.isMobile("17853345070"));
    }
}