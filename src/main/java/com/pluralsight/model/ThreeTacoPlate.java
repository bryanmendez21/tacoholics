package com.pluralsight.model;

import java.util.List;

public class ThreeTacoPlate extends Taco {

    public ThreeTacoPlate(String shell, List<String> cheese, List<String> meat, List<String> topping, boolean extraMeat, boolean extraCheese) {
        super(shell, cheese, meat, topping, extraMeat, extraCheese);
    }

    @Override
    public double getPrice(){
        return 9.00;
    }

    @Override
    public void description() {
        System.out.printf("Meat: %s %n Extra Meat: %b %n Cheese: %s %n Extra Cheese: %b %n Toppings: %s",meat,extraMeat,cheese,extraCheese,topping);
    }
}
