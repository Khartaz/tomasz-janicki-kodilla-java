package com.kodilla.patterns.challenges.service.food;

import java.util.List;

public class CustomerResponseDTO {
    private List<Distributor> distributorList;
    private List<ProductInfo> productInfoList;

    public CustomerResponseDTO(List<Distributor> distributorList, List<ProductInfo> productInfoList) {
        this.distributorList = distributorList;
        this.productInfoList = productInfoList;
    }

    public List<Distributor> getDistributorList() {
        return distributorList;
    }

    public List<ProductInfo> getProductInfoList() {
        return productInfoList;
    }
}
