package com.pluralsight.model;

import java.util.List;

public class SingleTaco extends Taco {

    public SingleTaco(String shell, List<String> meat, List<String> cheese, List<String> topping, boolean extraMeat, boolean extraCheese) {
        super(shell, meat, cheese, topping, extraMeat, extraCheese);
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
    public String description() {
        return String.format("M: %s|C: %s|T: %s", meat, cheese, topping);
    }

    @Override
    public int getQuantity(){
        return 1;
    }
}
