package com.shiyu.demo.mapper;

import com.shiyu.demo.entity.MenuImg;
import com.shiyu.demo.entity.MenuImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuImgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_img
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int countByExample(MenuImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_img
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int deleteByExample(MenuImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_img
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int deleteByPrimaryKey(Integer imgid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_img
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int insert(MenuImg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_img
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int insertSelective(MenuImg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_img
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    List<MenuImg> selectByExample(MenuImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_img
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    MenuImg selectByPrimaryKey(Integer imgid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_img
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int updateByExampleSelective(@Param("record") MenuImg record, @Param("example") MenuImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_img
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int updateByExample(@Param("record") MenuImg record, @Param("example") MenuImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_img
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int updateByPrimaryKeySelective(MenuImg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_img
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int updateByPrimaryKey(MenuImg record);
}