package com.taotao.domain.model;

import java.io.Serializable;
import java.util.Date;

public class TbAffiche implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_affiche.id
     *
     * @mbggenerated Fri Dec 16 14:59:47 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_affiche.name
     *
     * @mbggenerated Fri Dec 16 14:59:47 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_affiche.issueTime
     *
     * @mbggenerated Fri Dec 16 14:59:47 CST 2016
     */
    private Date issueTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_affiche.content
     *
     * @mbggenerated Fri Dec 16 14:59:47 CST 2016
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_affiche
     *
     * @mbggenerated Fri Dec 16 14:59:47 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     * @return 
     *
     * @mbggenerated Fri Dec 16 14:59:47 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id 
     *
     * @mbggenerated Fri Dec 16 14:59:47 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return 
     *
     * @mbggenerated Fri Dec 16 14:59:47 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name 
     *
     * @mbggenerated Fri Dec 16 14:59:47 CST 2016
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return 
     *
     * @mbggenerated Fri Dec 16 14:59:47 CST 2016
     */
    public Date getIssueTime() {
        return issueTime;
    }

    /**
     *
     * @param issueTime 
     *
     * @mbggenerated Fri Dec 16 14:59:47 CST 2016
     */
    public void setIssueTime(Date issueTime) {
        this.issueTime = issueTime;
    }

    /**
     *
     * @return 
     *
     * @mbggenerated Fri Dec 16 14:59:47 CST 2016
     */
    public String getContent() {
        return content;
    }

    /**
     *
     * @param content 
     *
     * @mbggenerated Fri Dec 16 14:59:47 CST 2016
     */
    public void setContent(String content) {
        this.content = content;
    }
}