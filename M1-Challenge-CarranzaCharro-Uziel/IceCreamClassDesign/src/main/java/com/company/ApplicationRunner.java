package com.company;

import com.company.factory.IceCream;

public class ApplicationRunner {
    public static void main(String[] args) {

        com.company.factory.IceCream iceCreamAtTheFactory = new com.company.factory.IceCream();
//        create an ice cream mix of chocolate flavor
        iceCreamAtTheFactory.makeIceCream("Chocolate");
        System.out.println(iceCreamAtTheFactory.getIceCreamFlavor());
        System.out.println(iceCreamAtTheFactory.getIceCreamMix());

        com.company.pointofsale.IceCream iceCreamAtThePointOfSale = new com.company.pointofsale.IceCream();
//        buy an ice cream at the store
        iceCreamAtThePointOfSale.buyAnIceCreamAtTheStore("medium","vanilla");

    }
}
