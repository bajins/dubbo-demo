package com.bajins.shop.server.dto;

public class OrderRecordDto {

    // 商品id
    private Long productId;

    // 订单数量
    private Integer total;

    // 客户姓名
    private String customerName;

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
        this.customerName = customerName;
    }
}
