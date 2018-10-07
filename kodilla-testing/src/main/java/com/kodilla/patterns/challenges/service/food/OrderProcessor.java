package com.kodilla.patterns.challenges.service.food;

public class OrderProcessor { /*
    private CustomerResponseDTO customerResponseDTO;
    private OrderService orderService;
    private InformationService informationService;

    public OrderProcessor(final CustomerResponseDTO customerResponseDTO,
                          final OrderService orderService,
                          final InformationService informationService) {
        this.customerResponseDTO = customerResponseDTO;
        this.orderService = orderService;
        this.informationService = informationService;
    }

    public CustomerResponseDTO process(final CustomerRequest customerRequest) {
        boolean isOrdered = orderService.makeOrder(customerRequest.getCustomer(),
                customerRequest.getProductInfo(),
                customerRequest.getDistributor());

        if(isOrdered) {
            informationService.inform(customerRequest.getCustomer());
            orderService.makeOrder(customerRequest.getCustomer(), customerRequest.getProductInfo(), customerRequest.getDistributor());
        } return new CustomerResponseDTO(customerResponseDTO.getDistributorList(), customerResponseDTO.getProductInfoList());
    } */
}
