package com.kodilla.patterns.challenges.service.order;

public interface OrderRepository {
    boolean makeOrder(User user, OrderInfo orderInfo);
}
