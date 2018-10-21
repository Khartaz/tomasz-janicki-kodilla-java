package com.kodilla.patterns.challenges.service.food;

import java.util.List;

public class DistributorDTO {
    private List<ProductInfo> producentProductList;
    private boolean isOrdered;

    public DistributorDTO(List<ProductInfo> producentProductList, boolean isOrdered) {
        this.producentProductList = producentProductList;
        this.isOrdered = isOrdered;
    }
}

