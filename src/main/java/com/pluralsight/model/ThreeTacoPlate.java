package com.pluralsight.model;

import java.util.List;

public class ThreeTacoPlate extends Taco {
    private List<String> sharedTopping;

    public ThreeTacoPlate(String shell, String cheese, List<String> meat, List<String> topping, int amountOfTaco, boolean extraMeat, boolean extraCheese, List<String> sharedTopping) {
        super(shell, cheese, meat, topping, amountOfTaco, extraMeat, extraCheese);
        this.sharedTopping = sharedTopping;
    }

    @Override
    public double getPrice(){
        return 9.00;
    }

    @Override
    public void description() {
        System.out.println(sharedTopping);
    }
}
