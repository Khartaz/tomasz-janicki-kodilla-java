package com.kodilla.clockApp;


import java.util.LinkedList;

class Application  {
        public static void main(String[] args) {
            LinkedList<Clock> clockList = new LinkedList<Clock>();
            clockList.add(new Clock(23, 59));
            clockList.add(new Clock(14, 58));
            clockList.add(new Clock(13, 57));
            clockList.add(new Clock(12, 14));
            clockList.add(new Clock(11, 8));
            clockList.add(new Clock(9, 9));
            clockList.add(new Clock(8, 17));


            for(Clock clockList1 : clockList) {
                clockList1.addTime();
                System.out.println(clockList1.toString());
            }
        }
    }
