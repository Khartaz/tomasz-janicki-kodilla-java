package com.kodilla.patterns.challenges.service.order;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final OrderService orderService) {
        this.orderService = orderService;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.makeOrder(orderRequest.getUser(), orderRequest.getOrderInfo());

        if(isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.makeOrder(orderRequest.getUser(), orderRequest.getOrderInfo());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
