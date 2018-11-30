package com.kodilla.patterns.challenges.service.food2;

public class OrderItemDto {
    private Product productName;
    private Long count;

    public OrderItemDto(Product productName, Long count) {
        this.productName = productName;
        this.count = count;
    }

    public Product getProductName() {
        return productName;
    }

    public void setProductName(Product productName) {
        this.productName = productName;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
