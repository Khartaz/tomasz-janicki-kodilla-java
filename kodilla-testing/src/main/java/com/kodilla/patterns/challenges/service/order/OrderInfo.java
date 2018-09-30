package com.kodilla.patterns.challenges.service.order;

public class OrderInfo {
    private String orderTitle;
    private int orderNumber;

    public OrderInfo(String orderTitle, int orderNumber) {
        this.orderTitle = orderTitle;
        this.orderNumber = orderNumber;
    }

    public String getOrderTitle() {
        return orderTitle;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "orderTitle='" + orderTitle + '\'' +
                ", orderNumber=" + orderNumber +
                '}';
    }
}
