package com.kodilla.patterns.challenges.service.order;

import java.util.*;
import java.util.stream.Collectors;

public class OrderRepositoryService implements OrderRepository {
    Map<User, List<OrderInfo>> userOrders = new LinkedHashMap<>();

   public Map<User, List<OrderInfo>> addOrder(User user, OrderInfo orderInfo) {
       if(userOrders.get(user) != null) {
           userOrders.get(user).add(orderInfo);
       } else {
           userOrders.put(user, Collections.singletonList(orderInfo));
       }
       return userOrders;
   }
}
