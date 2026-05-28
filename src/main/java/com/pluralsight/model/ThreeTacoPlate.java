package com.pluralsight.model;

import java.util.List;

public class ThreeTacoPlate extends Taco {

    public ThreeTacoPlate(String shell, List<String> meat, List<String> cheese, List<String> topping, boolean extraMeat, boolean extraCheese) {
        super(shell, meat, cheese, topping, extraMeat, extraCheese);
    }

    @Override
    public double getPrice(){
        double price = 9.00;

        if(extraMeat){
            price += 1.00;
        }
        if(!cheese.isEmpty()){
            price += 1.50;
        }
        if(extraCheese){
            price += .60;
        }

        return price;

    }

    @Override
    public String description() {
        return String.format("Meat: %s|Cheese: %s|Toppings: %s", meat, cheese, topping);
    }

    @Override
    public int getQuantity(){
        return 3;
    }
}
