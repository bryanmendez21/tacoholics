package com.pluralsight.model;

public class ChipsAndSalsa implements MenuItem{

    String flavor;

    public ChipsAndSalsa(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public double getPrice(){
        return 1.50;
    }

    @Override
    public void description() {
        System.out.printf("===== Chips & Salsa Details =====%nPrice: %.2f%nFlavor: %s%n========================%n",getPrice(),flavor);
    }
}
