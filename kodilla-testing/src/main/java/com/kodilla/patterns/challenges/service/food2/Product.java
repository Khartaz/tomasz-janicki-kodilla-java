package com.kodilla.patterns.challenges.service.food2;

public class Product {

    private String productName;
    private String producent;

    public Product(String productName, String producent) {
        this.productName = productName;
        this.producent = producent;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }
}
