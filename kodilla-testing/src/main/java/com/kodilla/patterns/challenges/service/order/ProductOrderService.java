package com.kodilla.patterns.challenges.service.order;

public class ProductOrderService implements OrderService {

    public boolean makeOrder(final User user, final OrderInfo orderInfo) {
        System.out.println("Make order for: " + user.getName() + user.getLastName() +
                           "\nOrder Informations:\n" +
                            "Product title: " + orderInfo.getOrderTitle() +
                            "Product number: " + orderInfo.getOrderNumber());
        return true;
    }
}
