package com.kodilla.patterns.challenges.service.food2;

public class OrderItemDto {

    private String productName;
    private Long count;

    public OrderItemDto(String productName, Long count) {
        this.productName = productName;
        this.count = count;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
