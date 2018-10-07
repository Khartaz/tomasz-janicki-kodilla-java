package com.kodilla.patterns.challenges.service.food;

import java.util.List;
import java.util.Map;

public class CustomerResponseDTO {
    private Map<Distributor, List<ProductInfo>> distributorProductInfoList;

    public CustomerResponseDTO(Map<Distributor, List<ProductInfo>> distributorProductInfoList) {
        this.distributorProductInfoList = distributorProductInfoList;
    }

    public Map<Distributor, List<ProductInfo>> getDistributorProductInfoList() {
        return distributorProductInfoList;
    }
}
