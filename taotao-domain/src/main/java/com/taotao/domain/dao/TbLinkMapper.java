package com.taotao.domain.dao;

import com.taotao.domain.model.TbLink;
import com.taotao.domain.model.TbLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbLinkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_link
     *
     * @mbggenerated Fri Dec 16 15:03:36 CST 2016
     */
    int countByExample(TbLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_link
     *
     * @mbggenerated Fri Dec 16 15:03:36 CST 2016
     */
    int deleteByExample(TbLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_link
     *
     * @mbggenerated Fri Dec 16 15:03:36 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_link
     *
     * @mbggenerated Fri Dec 16 15:03:36 CST 2016
     */
    int insert(TbLink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_link
     *
     * @mbggenerated Fri Dec 16 15:03:36 CST 2016
     */
    int insertSelective(TbLink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_link
     *
     * @mbggenerated Fri Dec 16 15:03:36 CST 2016
     */
    int insertBatch(@Param("list") List<TbLink> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_link
     *
     * @mbggenerated Fri Dec 16 15:03:36 CST 2016
     */
    List<TbLink> selectByExample(TbLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_link
     *
     * @mbggenerated Fri Dec 16 15:03:36 CST 2016
     */
    TbLink selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_link
     *
     * @mbggenerated Fri Dec 16 15:03:36 CST 2016
     */
    int updateByExampleSelective(@Param("record") TbLink record, @Param("example") TbLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_link
     *
     * @mbggenerated Fri Dec 16 15:03:36 CST 2016
     */
    int updateByExample(@Param("record") TbLink record, @Param("example") TbLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_link
     *
     * @mbggenerated Fri Dec 16 15:03:36 CST 2016
     */
    int updateByPrimaryKeySelective(TbLink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_link
     *
     * @mbggenerated Fri Dec 16 15:03:36 CST 2016
     */
    int updateByPrimaryKey(TbLink record);
}