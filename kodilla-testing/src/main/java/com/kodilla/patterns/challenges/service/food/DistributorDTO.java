package com.kodilla.patterns.challenges.service.food;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DistributorDTO {
    ProducentRequestRetriever producentRequestRetriever;
    private Map<Producent, List<ProductInfo>> producentProductList;



    public Map<Producent, List<ProductInfo>> getProducentProductList() {
        return producentProductList;
    }


    public Map<Producent, List<ProductInfo>> requestRetrieve() {
            Map<Producent, List<ProductInfo>> result1 = producentRequestRetriever.retrieve().getProductInfo();
           /* List<ProductInfo> result =
                   result1.entrySet().stream().flatMap(v -> v.getValue()).collect(Collectors.toList()); */
       return result1;
    }
}
