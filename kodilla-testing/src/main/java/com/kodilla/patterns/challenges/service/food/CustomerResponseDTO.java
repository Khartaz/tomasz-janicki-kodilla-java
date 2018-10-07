package com.kodilla.patterns.challenges.service.food;

import java.util.List;
import java.util.Map;

public class CustomerResponseDTO {
    private Distributor distributor;
    private List<ProductInfo> productInfoList;
    private Map<Distributor, ProductInfo> distributorProductInfoList;

    public CustomerResponseDTO(Distributor distributor, List<ProductInfo> productInfoList) {
        this.distributor = distributor;
        this.productInfoList = productInfoList;
    }

    public Distributor getDistributor() {
        return distributor;
    }

    public List<ProductInfo> getProductInfoList() {
        return productInfoList;
    }
}
