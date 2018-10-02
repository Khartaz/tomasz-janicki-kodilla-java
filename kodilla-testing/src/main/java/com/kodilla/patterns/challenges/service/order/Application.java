package com.kodilla.patterns.challenges.service.order;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(
                new OrderServiceImpl(),
                new InformationUserService(),
                new OrderRepositoryService());
        orderProcessor.process(orderRequest);
    }
}
