package com.pluralsight.model;

import java.util.List;

public class Burrito implements MenuItem{

    private String tortilla, beans, rice;
    private List<String> meat;
    private List<String> cheese;
    private List<String> topping;
    private boolean extraMeat;
    private boolean extraCheese;

    public Burrito(String tortilla, String beans, String rice, List<String> meat, List<String> cheese, List<String> topping, boolean extraMeat, boolean extraCheese) {
        this.tortilla = tortilla;
        this.beans = beans;
        this.rice = rice;
        this.meat = meat;
        this.cheese = cheese;
        this.topping = topping;
        this.extraMeat = extraMeat;
        this.extraCheese = extraCheese;
    }

    @Override
    public double getPrice(){
        double price = 8.50;

        if(extraMeat){
            price += 1.50;
        }
        if(!cheese.isEmpty()){
            price += 2.25;
        }
        if(extraCheese){
            price += .90;
        }

        return price;
    }

    @Override
    public void description() {
        System.out.println("Burrito description" );
    }

    public String getTortilla() {
        return tortilla;
    }

    public void setTortilla(String tortilla) {
        this.tortilla = tortilla;
    }

    public String getBeans() {
        return beans;
    }

    public void setBeans(String beans) {
        this.beans = beans;
    }

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public List<String> getMeat() {
        return meat;
    }

    public void setMeat(List<String> meat) {
        this.meat = meat;
    }

    public List<String> getCheese() {
        return cheese;
    }

    public void setCheese(List<String> cheese) {
        this.cheese = cheese;
    }

    public List<String> getTopping() {
        return topping;
    }

    public void setTopping(List<String> topping) {
        this.topping = topping;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }
}
