package com.shiyu.demo.entity;

import java.util.Date;

public class AuthCode {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_code.id
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_code.userphone
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    private String userphone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_code.userid
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_code.code
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_code.created_time
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    private Date createdTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_code.id
     *
     * @return the value of auth_code.id
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_code.id
     *
     * @param id the value for auth_code.id
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_code.userphone
     *
     * @return the value of auth_code.userphone
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public String getUserphone() {
        return userphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_code.userphone
     *
     * @param userphone the value for auth_code.userphone
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_code.userid
     *
     * @return the value of auth_code.userid
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_code.userid
     *
     * @param userid the value for auth_code.userid
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_code.code
     *
     * @return the value of auth_code.code
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_code.code
     *
     * @param code the value for auth_code.code
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_code.created_time
     *
     * @return the value of auth_code.created_time
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_code.created_time
     *
     * @param createdTime the value for auth_code.created_time
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}