package com.kodilla.patterns.challenges.service.food;

import java.util.List;

public class DistributorDTO {
    private List<Producent> producent;
    private List<ProductInfo> productInfoList;

    public DistributorDTO(List<Producent> producent, List<ProductInfo> productInfoList) {
        this.producent = producent;
        this.productInfoList = productInfoList;
    }

    public List<Producent> getProducent() {
        return producent;
    }

    public List<ProductInfo> getProductInfoList() {
        return productInfoList;
    }
}
