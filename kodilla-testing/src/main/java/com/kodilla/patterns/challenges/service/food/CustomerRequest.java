package com.kodilla.patterns.challenges.service.food;

public class CustomerRequest {
    private Customer customer;
    private Distributor distributor;
    private ProductInfo productInfo;


    public CustomerRequest(Customer customer, Distributor distributor, ProductInfo productInfo) {
        this.customer = customer;
        this.distributor = distributor;
        this.productInfo = productInfo;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Distributor getDistributor() {
        return distributor;
    }

    public ProductInfo getProductInfo() {
        return productInfo;
    }
}
