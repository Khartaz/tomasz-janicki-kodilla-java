package com.kodilla.patterns.challenges.service.food;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    public List<ProductInfo> getProductsByProducent(Producent producent) {
        ProductInfo product1 = new ProductInfo("Cherry", 100);
        ProductInfo product2 = new ProductInfo("Choco", 50);
        ProductInfo product3 = new ProductInfo("Cake", 120);
        ProductInfo product4 = new ProductInfo("Cola", 30);

        List<ProductInfo> productInfoList = new ArrayList<>();
        productInfoList.add(product1);
        productInfoList.add(product2);
        productInfoList.add(product3);
        productInfoList.add(product4);

        return new ArrayList<>(productInfoList);
    }
}
