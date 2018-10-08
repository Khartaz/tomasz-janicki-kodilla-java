package com.kodilla.patterns.challenges.service.food;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DistributorDTO {

    private Map<Producent, List<ProductInfo>> producentProductList;



    public Map<Producent, List<ProductInfo>> getProducentProductList() {
        return producentProductList;
    }


    public Map<Producent, List<ProductInfo>> requestRetrieve() {

           /* List<ProductInfo> result =
                   result1.entrySet().stream().flatMap(v -> v.getValue()).collect(Collectors.toList()); */
       return ;
    }
}
