package com.kodilla.patterns.challenges.service.order;

public class OrderRequest {
    private User user;
    private OrderInfo orderInfo;

    public OrderRequest(User user, OrderInfo orderInfo) {
        this.user = user;
        this.orderInfo = orderInfo;
    }

    public User getUser() {
        return user;
    }

    public OrderInfo getOrderInfo() {
        return orderInfo;
    }
}
