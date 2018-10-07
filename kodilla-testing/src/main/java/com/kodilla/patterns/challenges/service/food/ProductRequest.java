package com.kodilla.patterns.challenges.service.food;

import java.util.List;
import java.util.Map;

public class ProductRequest {
    private Map<Producent, List<ProductInfo>> productInfo;

    public ProductRequest(Map<Producent, List<ProductInfo>> productInfo) {
        this.productInfo = productInfo;
    }

    public Map<Producent, List<ProductInfo>> getProductInfo() {
        return productInfo;
    }
}
