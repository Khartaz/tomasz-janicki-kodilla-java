package com.kodilla.patterns.challenges.service.order;

public class ProductOrderService implements OrderService {

    public boolean makeOrder(final User user, final OrderInfo orderInfo) {
        System.out.println("Make order for: " + user.getName() + user.getLastName() +
                           "Order Informations: " + orderInfo.getOrderTitle() + orderInfo.getOrderNumber());

        return true;
    }
}
