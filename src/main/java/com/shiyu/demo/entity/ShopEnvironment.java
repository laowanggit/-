package com.shiyu.demo.entity;

public class ShopEnvironment {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_environment.id
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_environment.shopid
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    private Integer shopid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_environment.environment_img
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    private String environmentImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_environment.description
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_environment.id
     *
     * @return the value of shop_environment.id
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_environment.id
     *
     * @param id the value for shop_environment.id
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_environment.shopid
     *
     * @return the value of shop_environment.shopid
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public Integer getShopid() {
        return shopid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_environment.shopid
     *
     * @param shopid the value for shop_environment.shopid
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_environment.environment_img
     *
     * @return the value of shop_environment.environment_img
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public String getEnvironmentImg() {
        return environmentImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_environment.environment_img
     *
     * @param environmentImg the value for shop_environment.environment_img
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public void setEnvironmentImg(String environmentImg) {
        this.environmentImg = environmentImg == null ? null : environmentImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_environment.description
     *
     * @return the value of shop_environment.description
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_environment.description
     *
     * @param description the value for shop_environment.description
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}