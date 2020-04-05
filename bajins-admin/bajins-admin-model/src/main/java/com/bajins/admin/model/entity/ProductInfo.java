package com.bajins.admin.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
    * 商品信息表
    */
public class ProductInfo implements Serializable {
    private Long id;

    /**
    * 商品编码
    */
    private String code;

    /**
    * 商品名称
    */
    private String name;

    /**
    * 销售价格
    */
    private BigDecimal price;

    /**
    * 状态：1=有效，0=无效
    */
    private Byte status;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}