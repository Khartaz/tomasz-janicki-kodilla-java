package com.kodilla.patterns.challenges.service.food2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProducentService {
    List<Product> productList = new ArrayList<>();

    public boolean order(String productName,  Long count) {

        String producent = productList.stream()
                .filter(p -> productName.equals(p.getProducent()))
                .findAny()
                .map(Product::getProducent)
                .orElse(null);

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
