package com.bajins.admin.model.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单记录表
 */
public class OrderRecord implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 商品主键
     */
    private Long productId;

    /**
     * 数量
     */
    private Integer total;

    /**
     * 客户姓名
     */
    private String customerName;

    /**
     * 下单时间
     */
    private Date createTime;

    /**
     * 订单状态：0无效，1有效
     */
    private Boolean status;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", total=").append(total);
        sb.append(", customerName=").append(customerName);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}