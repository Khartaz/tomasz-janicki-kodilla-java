package com.kodilla.orderListApp;

import java.time.LocalDate;

class OrderInfo {
    int orderNumber;
    LocalDate dateOfOrder;

    public OrderInfo(int orderNumber, int year, int month, int day) {
        this.orderNumber = orderNumber;
        this.dateOfOrder = LocalDate.of(year, month, day);
    }

    public String toString() {
        return "Order number "  + orderNumber  + " Order created: " + dateOfOrder + " \n";
    }

    //getters
    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public boolean equals(Object o) {
        OrderInfo orderInfo = (OrderInfo) o;
        if(orderInfo.getOrderNumber() == orderNumber) {
            return true;
        } else  {
            return false;
        }
    }
}



        /*
        Random random = new Random();
        int r = random.nextInt(50);
        for(int i=0; i < 10; i++) {
            listOfOrders.add(new OrderInfo(i + r, 2018, 10, 01));

        }
        */

/*
Iterator<OrderInfo> orderInfoIterator = listOfOrders.iterator();
        while (orderInfoIterator.hasNext());
            OrderInfo examinedObject = orderInfoIterator.next();

            for(int k=0; k <listOfOrders.size(); k++) {
                if(listOfOrders.(k).hashCode() != examinedObject.hashCode()) {

                    if (listOfOrders.?().equals(examinedObject)) {
                        System.out.println("Duplicated: " + examinedObject.orderNumber);
                    }
                }
            }
 */