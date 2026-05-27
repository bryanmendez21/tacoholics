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
    public void description() {
        System.out.printf("===== 3 Taco Plate =====%nMeat: %s%nExtra Meat: %b%nCheese: %s%nExtra Cheese: %b%nToppings: %s%n========================%n", meat, extraMeat, cheese, extraCheese, topping);
    }
}
