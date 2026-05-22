package com.pluralsight.model;

import java.util.List;

public abstract class Taco implements MenuItem{
    protected String shell;
    protected String cheese;
    protected List<String> meat;
    protected List<String> topping;
    protected int amountOfTaco;
    protected boolean extraMeat;
    protected boolean extraCheese;

    public Taco(String shell, String cheese, List<String> meat, List<String> topping, int amountOfTaco, boolean extraMeat, boolean extraCheese) {
        this.shell = shell;
        this.cheese = cheese;
        this.meat = meat;
        this.topping = topping;
        this.amountOfTaco = amountOfTaco;
        this.extraMeat = extraMeat;
        this.extraCheese = extraCheese;
    }

    @Override
    public abstract double getPrice();

    @Override
    public abstract void description();

}
