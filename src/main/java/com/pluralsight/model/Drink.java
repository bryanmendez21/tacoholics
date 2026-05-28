package com.pluralsight.model;

public class Drink implements MenuItem{
    private double drinkSize;
    private String flavor;

    public Drink(double drinkSize, String flavor) {
        this.drinkSize = drinkSize;
        this.flavor = flavor;
    }

    public double getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(double drinkSize) {
        this.drinkSize = drinkSize;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public double getPrice(){
        double price = 0;
        if(drinkSize == 24){
            price += 2.00;
        } else if (drinkSize == 36) {
            price += 2.50;
        } else if (drinkSize == 48) {
            price += 3.00;
        }
        return price;
    }

    @Override
    public String description() {
        return String.format("Size: %.1f Oz | Flavor: %s",drinkSize,flavor);
    }
}
