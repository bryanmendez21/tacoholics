package com.pluralsight.model;

public class Drink implements MenuItem{
    double drinkSize;
    String flavor;

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
    public void getPrice(){

    }

    @Override
    public void description() {

    }
}
