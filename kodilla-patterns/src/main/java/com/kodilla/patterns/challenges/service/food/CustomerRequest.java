package com.kodilla.patterns.challenges.service.food;

import java.util.List;
import java.util.Map;

public class CustomerRequest {
    private Map<Distributor, List<ProductInfo>> distributorProductList;

    public CustomerRequest(Map<Distributor, List<ProductInfo>> distributorProductList) {
        this.distributorProductList = distributorProductList;
    }

    public Map<Distributor, List<ProductInfo>> getDistributorProductList() {
        return distributorProductList;
    }


}
