package com.kodilla.patterns.challenges.service.food;

import java.util.List;

public class Producent {
    private String producentTitle;
    private List<ProductInfo> productInfoList;

    public Producent(String producentTitle) {
        this.producentTitle = producentTitle;
    }

    public String getProducentTitle() {
        return producentTitle;
    }

    public List<ProductInfo> getProductInfoList() {
        return productInfoList;
    }


}
