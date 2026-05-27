package com.pluralsight.ui;

import com.pluralsight.model.*;


public class Checkout implements Screen{
    private Cart cart;

    public Checkout(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void display(){
        System.out.println("CHECK OUT");
        for (Taco taco : cart.getTacos()){
            taco.description();
            System.out.println("Price: " + taco.getPrice());
        }
        for (Drink drink : cart.getDrinks()){
            drink.description();
            System.out.println("Price: " + drink.getPrice());
        }
        for (Burrito burrito : cart.getBurrito()){
            burrito.description();
            System.out.println("Price: " + burrito.getPrice());
        }
        for (ChipsAndSalsa chipSalsa : cart.getChipSalsa()){
            chipSalsa.description();
            System.out.println("Price: " + chipSalsa.getPrice());
        }

        System.out.printf("%n========================%nTotal: $%.2f%n", cart.getTotal());

    }

}
