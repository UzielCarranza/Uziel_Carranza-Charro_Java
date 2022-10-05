package com.company.factory;

import java.util.ArrayList;
import java.util.List;

public class IceCream {

    //    FIELDS
    private List<String> iceCreamMix = new ArrayList<>();
    private boolean isPasteurized;
    private String iceCreamFlavor;

    //    CONSTRUCTORS
    public IceCream() {
    }

    public IceCream(List<String> iceCreamMix, boolean isPasteurized, String iceCreamFlavor) {
        this.iceCreamMix = iceCreamMix;
        this.isPasteurized = isPasteurized;
        this.iceCreamFlavor = iceCreamFlavor;
    }

    //    GETTERS AND SETTERS

    public List<String> getIceCreamMix() {
        return iceCreamMix;
    }

    public void setIceCreamMix(List<String> iceCreamMix) {
        this.iceCreamMix = iceCreamMix;
    }

    public boolean isPasteurized() {
        return isPasteurized;
    }

    public void setPasteurized(boolean pasteurized) {
        isPasteurized = pasteurized;
    }

    public String getIceCreamFlavor() {
        return iceCreamFlavor;
    }

    public void setIceCreamFlavor(String iceCreamFlavor) {
        this.iceCreamFlavor = iceCreamFlavor;
    }
    public void pasteurizeMix() {
        this.isPasteurized = true;
    }

    //    METHODS

    public void makeMixIceCream() {
        this.iceCreamMix.add("Milk");
        this.iceCreamMix.add("Cream");
        this.iceCreamMix.add("Sugar");
    }


    public void addRemainingIngredients(String iceCreamFlavor) {
        setIceCreamFlavor(iceCreamFlavor);
    }

    public void makeIceCream(String iceCreamFlavor) {
        makeMixIceCream();
        pasteurizeMix();
        addRemainingIngredients(iceCreamFlavor);
    }
    public void deliverIceCreamToStore() {
        System.out.println("Delivering this shipping to the nearest store!!");
    }
}
