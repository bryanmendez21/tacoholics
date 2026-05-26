package com.pluralsight.model;

import java.util.List;

public abstract class Taco implements MenuItem{
    protected String shell;
    protected List<String> meat;
    protected List<String> cheese;
    protected List<String> topping;
    protected boolean extraMeat;
    protected boolean extraCheese;

    public Taco(String shell,List<String> meat, List<String> cheese, List<String> topping, boolean extraMeat, boolean extraCheese) {
        this.shell = shell;
        this.meat = meat;
        this.cheese = cheese;
        this.topping = topping;
        this.extraMeat = extraMeat;
        this.extraCheese = extraCheese;
    }

    @Override
    public abstract double getPrice();

    @Override
    public abstract void description();

}
