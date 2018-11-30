package com.kodilla.patterns.challenges.service.food2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProducentService {
    List<Product> productList = new ArrayList<>();

    public boolean order(Product productName,  Long count) {


        Product producent = productList.stream()
                .filter(p -> p.getProductName().equals(productName))
                .findAny()
                .orElse(productName);

        if(producent != null) {
            System.out.println("Pobrano od producenta " + producent + "produkt: " + productName
                    + "w ilosci: " + count);
            return true;
        } else {
            System.out.print("Nie mamy producenta dla tego produktu");
            return false;
        }
    }
}