package com.shiyu.demo.entity;

public class MenuInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_info.menuid
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    private Integer menuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_info.shopid
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    private Integer shopid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_info.menuname
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    private String menuname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_info.type
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_info.menutext
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    private String menutext;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_info.price
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    private Long price;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_info.menuid
     *
     * @return the value of menu_info.menuid
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public Integer getMenuid() {
        return menuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_info.menuid
     *
     * @param menuid the value for menu_info.menuid
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_info.shopid
     *
     * @return the value of menu_info.shopid
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public Integer getShopid() {
        return shopid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_info.shopid
     *
     * @param shopid the value for menu_info.shopid
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_info.menuname
     *
     * @return the value of menu_info.menuname
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public String getMenuname() {
        return menuname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_info.menuname
     *
     * @param menuname the value for menu_info.menuname
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_info.type
     *
     * @return the value of menu_info.type
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_info.type
     *
     * @param type the value for menu_info.type
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_info.menutext
     *
     * @return the value of menu_info.menutext
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public String getMenutext() {
        return menutext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_info.menutext
     *
     * @param menutext the value for menu_info.menutext
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public void setMenutext(String menutext) {
        this.menutext = menutext == null ? null : menutext.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_info.price
     *
     * @return the value of menu_info.price
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public Long getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_info.price
     *
     * @param price the value for menu_info.price
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public void setPrice(Long price) {
        this.price = price;
    }
}