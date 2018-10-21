package com.kodilla.patterns.challenges.service.food2;

import java.util.List;

public class OrderRequest {
    private CustomerDto customer;
    private List<OrderItemDto> orders;

    public OrderRequest(CustomerDto customer, List<OrderItemDto> orders) {
        this.customer = customer;
        this.orders = orders;
    }

    public CustomerDto getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDto customer) {
        this.customer = customer;
    }

    public List<OrderItemDto> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderItemDto> orders) {
        this.orders = orders;
    }
}
