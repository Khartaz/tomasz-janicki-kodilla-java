package com.kodilla.patterns.challenges.service.order;

import java.util.LinkedHashMap;
import java.util.Map;

public class OrderRepositoryService implements OrderRepository {
   public Map<User, OrderInfo> addOrder(User user, OrderInfo orderInfo) {
       Map<User, OrderInfo> cart = new LinkedHashMap<>();
       cart.put(user, orderInfo);

       System.out.println("Products added to cart: " + cart.size());

       return cart;
   }
}
