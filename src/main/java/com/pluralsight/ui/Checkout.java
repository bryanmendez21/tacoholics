package com.pluralsight.ui;

import com.pluralsight.model.Cart;
import com.pluralsight.model.Drink;
import com.pluralsight.model.Taco;


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

        System.out.printf("%n========================%nTotal: $%.2f%n", cart.getTotal());

    }

}
