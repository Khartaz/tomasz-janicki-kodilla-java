package com.kodilla.patterns.challenges.service.order;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Tommy ", "Ahmed ");
        OrderInfo orderInfo = new OrderInfo("Small Bomb ", 666);

        return new OrderRequest(user, orderInfo);
    }
}
