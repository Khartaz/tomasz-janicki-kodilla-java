package com.kodilla.patterns.challenges.service.food;

import java.util.List;
import java.util.Map;

public class Producent {
    private String producentTitle;
    private Map<String, List<ProductInfo>> producentProductList;


    public Producent(String producentTitle) {
        this.producentTitle = producentTitle;
    }

    public Map<String, List<ProductInfo>> getProducentProductList() {
        return producentProductList;
    }

    public String getProducentTitle() {
        return producentTitle;
    }
}
