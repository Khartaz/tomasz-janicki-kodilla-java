package com.kodilla.patterns.challenges.service.food;

public class ProductRequest {
    private Producent producent;
    private ProductInfo productInfo;

    public ProductRequest(Producent producent, ProductInfo productInfo) {
        this.producent = producent;
        this.productInfo = productInfo;
    }

    public Producent getProducent() {
        return producent;
    }

    public ProductInfo getProductInfo() {
        return productInfo;
    }
}
