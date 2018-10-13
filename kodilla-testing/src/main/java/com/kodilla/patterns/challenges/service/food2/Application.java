package com.kodilla.patterns.challenges.service.food2;

import java.util.Arrays;

public class Application {

    public static void main(String args[]) {
        CustomerDto customer = new CustomerDto("Tomasz", "Krakowska 31, Warszawa");
        OrderItemDto item1 = new OrderItemDto("Masło 2000", 4L);
        OrderItemDto item2 = new OrderItemDto("Mleko 0%", 10L);
        OrderItemDto item3 = new OrderItemDto("Chleb fit", 1L);

        OrderRequest orderRequest = new OrderRequest(customer, Arrays.asList(item1, item2, item3));

        OrderService service = new OrderService();
        boolean isExecuted = service.process(orderRequest);
        if(isExecuted) {
            System.out.print("Zamówienie zostało przetworzone");
        } else {
            System.out.print("Coś poszło nie tak");
        }
    }
}
