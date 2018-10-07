package com.kodilla.patterns.challenges.service.food;

import java.util.List;
import java.util.Map;

public class DistributorDTO {
    private Map<Producent, List<ProductInfo>> producentProductList;

    public DistributorDTO(Map<Producent, List<ProductInfo>> producentProductList) {
        this.producentProductList = producentProductList;
    }

    public Map<Producent, List<ProductInfo>> getProducentProductList() {
        return producentProductList;
    }
}
