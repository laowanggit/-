package com.shiyu.demo.mapper;

import com.shiyu.demo.entity.UserComment;
import com.shiyu.demo.entity.UserCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int countByExample(UserCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int deleteByExample(UserCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int insert(UserComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int insertSelective(UserComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    List<UserComment> selectByExample(UserCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    UserComment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserComment record, @Param("example") UserCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int updateByExample(@Param("record") UserComment record, @Param("example") UserCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int updateByPrimaryKeySelective(UserComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int updateByPrimaryKey(UserComment record);
}