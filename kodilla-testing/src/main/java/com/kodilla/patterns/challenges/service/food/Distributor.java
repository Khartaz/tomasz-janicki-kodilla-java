package com.kodilla.patterns.challenges.service.food;

import java.util.ArrayList;
import java.util.List;

public class Distributor implements ProcessService {
    List<Product> productList = new ArrayList<>();
    private String distributorTitle;

    public Distributor(String distributorTitle) {
        this.distributorTitle = distributorTitle;
    }

    public List<Product> process() {
        System.out.println("Processing...done.");
        return new ArrayList<>(productList);
    }
    public void addProduct(Product product) {
        productList.add(product);
    }
    public void removeProduct(Product product) {
        productList.remove(product);
    }

    @Override
    public String toString() {
        return "Distributor{" +
                "distributorTitle='" + distributorTitle + '\'' +
                '}';
    }
}
