package com.kodilla.patterns.challenges.service.food;

import java.util.List;

public class ProducentRequest {
    private List<ProductInfo> productInfo;

    public ProducentRequest(List<ProductInfo> productInfo) {
        this.productInfo = productInfo;
    }

    public List<ProductInfo> getProductInfo() {
        return productInfo;
    }
}
