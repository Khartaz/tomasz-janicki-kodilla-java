package com.kodilla.patterns.challenges.service.order;

import java.util.Map;

public interface OrderRepository {
    Map<User, OrderInfo> addOrder(User user, OrderInfo orderInfo);
}
