package com.kodilla.patterns.challenges.service.food;

public class Application {
    public static void main(String[] args) {
        ProductRequestRetriever productRequestRetriever = new ProductRequestRetriever();

        ProductRequest productRequest = productRequestRetriever.retrieve();


    }
}
