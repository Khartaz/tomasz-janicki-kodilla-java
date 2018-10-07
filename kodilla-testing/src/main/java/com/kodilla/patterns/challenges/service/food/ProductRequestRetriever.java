package com.kodilla.patterns.challenges.service.food;


public class ProductRequestRetriever {

    public ProductRequest retrieve() {
        Producent producent = new Producent("Extra Food Shop");
        ProductInfo productInfo = new ProductInfo("Cherry", 100);
        ProductInfo productInfo2 = new ProductInfo("Cherry", 100);
        ProductInfo productInfo3 = new ProductInfo("Cherry", 100);
        ProductInfo productInfo4 = new ProductInfo("Cherry", 100);


        return new ProductRequest(producent, productInfo);
    }
}
