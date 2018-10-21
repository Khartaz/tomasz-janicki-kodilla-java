package com.kodilla.patterns.challenges.service.order;

public class OrderProcessor {
    private OrderService orderService;
    private InformationService informationService;
    private OrderRepository orderRepository;

    public OrderProcessor(final OrderService orderService,
                          final InformationService informationService,
                          final OrderRepository orderRepository) {
        this.orderService = orderService;
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.makeOrder(orderRequest.getUser(), orderRequest.getOrderInfo());

        if(isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.addOrder(orderRequest.getUser(), orderRequest.getOrderInfo());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
