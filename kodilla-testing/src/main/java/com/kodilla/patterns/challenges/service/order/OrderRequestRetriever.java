package com.kodilla.patterns.challenges.service.order;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Tommy ", "Bewa ");
        OrderInfo orderInfo = new OrderInfo("Toy ", 56);

        return new OrderRequest(user, orderInfo);
    }
}
