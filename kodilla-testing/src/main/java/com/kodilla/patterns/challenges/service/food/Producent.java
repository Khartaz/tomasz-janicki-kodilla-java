package com.kodilla.patterns.challenges.service.food;

import java.util.*;

public class Manufacturer implements ProcessService {

    public Map<String, List<Product>> createManufacturer(String manufacturerTitle, Product product) {
        List<Product> productList = new LinkedList<>();
        productList.add(new Product(product.getProductName(), product.getQuantity()));

        Map<String, List<Product>> manufacturersList = new HashMap<>();
        manufacturersList.put(manufacturerTitle, productList);

        return manufacturersList;
    }

    public void process() {

    }



    public static void main(String[] args) {

    }
}

/*
private List<Product> productList = new LinkedList<>();

public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }
 */
