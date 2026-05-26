package com.pluralsight.ui;

import com.pluralsight.model.Cart;
import com.pluralsight.model.Taco;


public class Checkout implements Screen{
    private Cart cart;

    public Checkout(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void display(){
        System.out.println("CHECK OUT");
        for (Taco taco : cart.getItems()){
            taco.description();
            System.out.println("Prices " + taco.getPrice());
        }
        System.out.println("Total: " + cart.getTotal());

    }

}
