package com.shiyu.demo.mapper;

import com.shiyu.demo.entity.ShopTicket;
import com.shiyu.demo.entity.ShopTicketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopTicketMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_ticket
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int countByExample(ShopTicketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_ticket
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int deleteByExample(ShopTicketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_ticket
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_ticket
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int insert(ShopTicket record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_ticket
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int insertSelective(ShopTicket record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_ticket
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    List<ShopTicket> selectByExample(ShopTicketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_ticket
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    ShopTicket selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_ticket
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int updateByExampleSelective(@Param("record") ShopTicket record, @Param("example") ShopTicketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_ticket
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int updateByExample(@Param("record") ShopTicket record, @Param("example") ShopTicketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_ticket
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int updateByPrimaryKeySelective(ShopTicket record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_ticket
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    int updateByPrimaryKey(ShopTicket record);
}