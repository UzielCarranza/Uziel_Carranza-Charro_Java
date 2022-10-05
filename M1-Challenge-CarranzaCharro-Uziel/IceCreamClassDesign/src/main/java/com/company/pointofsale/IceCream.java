package com.company.pointofsale;

public class IceCream {

    //    FIELDS
    private int iceCreamPrice;
    private String iceCreamFlavor;
    private String size;
    private boolean isMelting = false;

    //    CONSTRUCTOR
    public IceCream(int iceCreamPrice, String iceCreamFlavor, String size) {
        this.iceCreamPrice = iceCreamPrice;
        this.iceCreamFlavor = iceCreamFlavor;
        this.size = size;
    }

    public IceCream() {
    }

//    Getters and setters

    public int getIceCreamPrice() {
        return iceCreamPrice;
    }

    public void setIceCreamPrice(int iceCreamPrice) {
        this.iceCreamPrice = iceCreamPrice;
    }

    public String getIceCreamFlavor() {
        return iceCreamFlavor;
    }

    public void setIceCreamFlavor(String iceCreamFlavor) {
        this.iceCreamFlavor = iceCreamFlavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void iceCreamIsMelting() {
        this.isMelting = true;
    }

//    METHODS

    public void givePricingOfIceCreamBasedOnSizeToCustomer(String size) {
        switch (size) {
            case "small":
                setIceCreamPrice(5);
                break;
            case "medium":
                setIceCreamPrice(7);
                break;
            case "large":
                setIceCreamPrice(10);
                break;
        }
    }

    public void giveIceCreamDiscount(String iceCreamFlavor) {
        if (iceCreamFlavor.equals("chocolate")) {
            System.out.println("Sorry, no discounts available for this flavor");
        } else if (iceCreamFlavor.equals("vanilla")) {
            System.out.println("Congrats, you get a $2.00 discount");
            setIceCreamPrice(getIceCreamPrice() - 2);
            System.out.println("Your new total is: $" + getIceCreamPrice() + ".00");
        }
    }

    public void buyAnIceCreamAtTheStore(String size, String flavor) {
        setIceCreamFlavor(flavor);
        givePricingOfIceCreamBasedOnSizeToCustomer(size);
        System.out.println("Ok, your ice cream costs $" + getIceCreamPrice() + ".00");
        giveIceCreamDiscount(flavor);
        System.out.println("Enjoy");
        System.out.println("Oh no, your " + getIceCreamFlavor() + " ice cream " + (isMelting ? " is melting" : " is frozen " + "!!!"));
    }
}
