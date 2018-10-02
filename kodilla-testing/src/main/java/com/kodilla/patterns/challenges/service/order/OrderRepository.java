package com.kodilla.patterns.challenges.service.order;

import java.util.List;
import java.util.Map;

public interface OrderRepository {
    Map<User, List<OrderInfo>> addOrder(User user, OrderInfo orderInfo);
}
