package com.shiyu.demo.utils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class HttpUtil {//短信验证的工具类
    public static void main(String[] args) {
        String json=doPost("http://v.juhe.cn/toutiao/index?type=top&key=2da8ec43f9efbe8712075ac92419b15f",null);
        System.out.println(json);
    }
    public static String doPost(String address, String param) {
        try {
            URL url = new URL(address);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setDoOutput(true); //获取返回数据需要设置为true 默认false
            con.setDoInput(true); //发送数据需要设置为true 默认false
            con.setReadTimeout(5000);
            con.setConnectTimeout(5000);
            con.setRequestMethod("POST");
            con.connect();
            DataOutputStream out = new DataOutputStream(con.getOutputStream());
            if (param != null) {
                param = URLEncoder.encode(param, "utf-8");//url编码防止中文乱码
                out.writeBytes(param);
            }
            out.flush();
            out.close();
            BufferedReader red = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
            StringBuffer sb = new StringBuffer();
            String line;
            while ((line = red.readLine()) != null) {
                sb.append(line);
            }
            red.close();
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}