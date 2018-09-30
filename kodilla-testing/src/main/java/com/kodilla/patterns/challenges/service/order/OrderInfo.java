package com.kodilla.patterns.challenges.service.order;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderInfo orderInfo = (OrderInfo) o;
        return orderNumber == orderInfo.orderNumber &&
                Objects.equals(orderTitle, orderInfo.orderTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderTitle, orderNumber);
    }
}
