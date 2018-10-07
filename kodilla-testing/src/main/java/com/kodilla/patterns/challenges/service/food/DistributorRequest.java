package com.kodilla.patterns.challenges.service.food;

import java.util.List;
import java.util.Map;

public class DistributorRequest {
    private Map<Producent, List<ProductInfo>> producentProductInfoList;

    public DistributorRequest(Map<Producent, List<ProductInfo>> producentProductInfoList) {
        this.producentProductInfoList = producentProductInfoList;
    }

    public Map<Producent, List<ProductInfo>> getProducentProductInfoList() {
        return producentProductInfoList;
    }
}
