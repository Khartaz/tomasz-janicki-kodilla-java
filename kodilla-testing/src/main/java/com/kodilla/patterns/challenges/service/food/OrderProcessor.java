package com.kodilla.patterns.challenges.service.food;

public class OrderProcessor {
    private ProducentService producentService;
    private Customer customer;

    public OrderProcessor(final ProducentService producentService) {
        this.producentService = producentService;
    }

    public DistributorDTO process(ProducentRequest producentRequest)  {
        boolean isOrdered = producentService.order(producentRequest.getProductInfo());

        if(isOrdered){

            return new DistributorDTO(producentRequest.getProductInfo(), true);
        } else {
            return new DistributorDTO(producentRequest.getProductInfo(), false);
        }
    }
}
