package com.shiyu.demo.mapper;

import com.shiyu.demo.entity.UserIndent;
import com.shiyu.demo.entity.UserIndentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserIndentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_indent
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int countByExample(UserIndentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_indent
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int deleteByExample(UserIndentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_indent
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int deleteByPrimaryKey(Integer indentid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_indent
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int insert(UserIndent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_indent
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int insertSelective(UserIndent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_indent
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    List<UserIndent> selectByExample(UserIndentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_indent
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    UserIndent selectByPrimaryKey(Integer indentid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_indent
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserIndent record, @Param("example") UserIndentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_indent
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int updateByExample(@Param("record") UserIndent record, @Param("example") UserIndentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_indent
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int updateByPrimaryKeySelective(UserIndent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_indent
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int updateByPrimaryKey(UserIndent record);
}