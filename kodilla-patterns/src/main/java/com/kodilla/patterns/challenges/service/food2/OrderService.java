package com.kodilla.patterns.challenges.service.food2;


public class OrderService {
    private InformationService informationService;
    private ProducentService producentService;

    public boolean process(OrderRequest order) {
        boolean orderedAll = true;

        for (OrderItemDto orderItemDto : order.getOrders()) {
            if(!producentService.order(orderItemDto.getProductName(), orderItemDto.getCount())){
                orderedAll = false;
                break;
            }
        }
        return orderedAll;
    }
}
