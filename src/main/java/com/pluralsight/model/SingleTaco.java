package com.pluralsight.model;

import java.util.List;

public class SingleTaco extends Taco {

    public SingleTaco(String shell, List<String> cheese, List<String> meat, List<String> topping, boolean extraMeat, boolean extraCheese) {
        super(shell, cheese, meat, topping, extraMeat, extraCheese);
    }

    @Override
    public double getPrice(){
        double price = 3.50;

        if(extraMeat){
            price += .50;
        }
        if(!cheese.isEmpty()){
            price += .75;
        }
        if(extraCheese){
            price += .30;
        }
        return price;
    }

    @Override
    public void description() {
        System.out.printf("Meat: %s %n Extra Meat: %b %n Cheese: %s %n Extra Cheese: %b %n Toppings: %s",meat,extraMeat,cheese,extraCheese,topping);
    }
}
