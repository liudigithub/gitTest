package com.taotao.domain.model;

import java.io.Serializable;
import java.util.Date;

public class TbSmalltype implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_smalltype.id
     *
     * @mbggenerated Fri Dec 16 15:05:36 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_smalltype.bigId
     *
     * @mbggenerated Fri Dec 16 15:05:36 CST 2016
     */
    private Integer bigId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_smalltype.smallName
     *
     * @mbggenerated Fri Dec 16 15:05:36 CST 2016
     */
    private String smallName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_smalltype.createTime
     *
     * @mbggenerated Fri Dec 16 15:05:36 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_smalltype
     *
     * @mbggenerated Fri Dec 16 15:05:36 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     * @return 
     *
     * @mbggenerated Fri Dec 16 15:05:36 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id 
     *
     * @mbggenerated Fri Dec 16 15:05:36 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return 
     *
     * @mbggenerated Fri Dec 16 15:05:36 CST 2016
     */
    public Integer getBigId() {
        return bigId;
    }

    /**
     *
     * @param bigId 
     *
     * @mbggenerated Fri Dec 16 15:05:36 CST 2016
     */
    public void setBigId(Integer bigId) {
        this.bigId = bigId;
    }

    /**
     *
     * @return 
     *
     * @mbggenerated Fri Dec 16 15:05:36 CST 2016
     */
    public String getSmallName() {
        return smallName;
    }

    /**
     *
     * @param smallName 
     *
     * @mbggenerated Fri Dec 16 15:05:36 CST 2016
     */
    public void setSmallName(String smallName) {
        this.smallName = smallName;
    }

    /**
     *
     * @return 
     *
     * @mbggenerated Fri Dec 16 15:05:36 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *
     * @param createTime 
     *
     * @mbggenerated Fri Dec 16 15:05:36 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}