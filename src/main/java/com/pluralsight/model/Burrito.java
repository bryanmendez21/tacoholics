package com.pluralsight.model;

public class Burrito implements MenuItem{

    @Override
    public double getPrice(){
        double price = 0;
        return price;
    }

    @Override
    public void description() {
        System.out.println("Burrito description" );
    }
}
