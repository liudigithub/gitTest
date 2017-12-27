package com.taotao.domain.dao;

import com.taotao.domain.model.TbOrder;
import com.taotao.domain.model.TbOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbggenerated Fri Dec 16 15:04:51 CST 2016
     */
    int countByExample(TbOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbggenerated Fri Dec 16 15:04:51 CST 2016
     */
    int deleteByExample(TbOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbggenerated Fri Dec 16 15:04:51 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbggenerated Fri Dec 16 15:04:51 CST 2016
     */
    int insert(TbOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbggenerated Fri Dec 16 15:04:51 CST 2016
     */
    int insertSelective(TbOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbggenerated Fri Dec 16 15:04:51 CST 2016
     */
    int insertBatch(@Param("list") List<TbOrder> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbggenerated Fri Dec 16 15:04:51 CST 2016
     */
    List<TbOrder> selectByExampleWithBLOBs(TbOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbggenerated Fri Dec 16 15:04:51 CST 2016
     */
    List<TbOrder> selectByExample(TbOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbggenerated Fri Dec 16 15:04:51 CST 2016
     */
    TbOrder selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbggenerated Fri Dec 16 15:04:51 CST 2016
     */
    int updateByExampleSelective(@Param("record") TbOrder record, @Param("example") TbOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbggenerated Fri Dec 16 15:04:51 CST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") TbOrder record, @Param("example") TbOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbggenerated Fri Dec 16 15:04:51 CST 2016
     */
    int updateByExample(@Param("record") TbOrder record, @Param("example") TbOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbggenerated Fri Dec 16 15:04:51 CST 2016
     */
    int updateByPrimaryKeySelective(TbOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbggenerated Fri Dec 16 15:04:51 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(TbOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbggenerated Fri Dec 16 15:04:51 CST 2016
     */
    int updateByPrimaryKey(TbOrder record);
}