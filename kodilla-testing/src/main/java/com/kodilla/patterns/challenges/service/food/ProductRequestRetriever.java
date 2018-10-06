package com.kodilla.patterns.challenges.service.food;

public class ProductRequestRetriever {

    public ProductRequest retrieve() {
        Producent producent = new Producent("Extra Food Shop");
        ProductInfo productInfo = new ProductInfo("Cherry", 100);

        return new ProductRequest(producent, productInfo);
    }
}
