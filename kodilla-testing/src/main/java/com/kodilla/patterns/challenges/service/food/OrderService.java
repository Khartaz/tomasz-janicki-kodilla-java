package com.kodilla.patterns.challenges.service.food;

public interface OrderService {
    boolean makeOrder(Customer customer, ProductInfo productInfo, Distributor distributor);
}
