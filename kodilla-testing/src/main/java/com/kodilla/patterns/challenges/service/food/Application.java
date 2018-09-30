package com.kodilla.patterns.challenges.service.food;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Orange", 100);
        Distributor distributor1 = new Distributor("ExtraFoodShop");
        Store store = new Store("New Store");
        store.addDistributor(distributor1);
        distributor1.addProduct(product);
    }
}
