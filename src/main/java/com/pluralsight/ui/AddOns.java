package com.pluralsight.ui;

import com.pluralsight.Main;
import com.pluralsight.model.Cart;


public class AddOns implements Screen{
    private Cart cart;

    public AddOns(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void display() {
        System.out.println("1) Add lime wedges");
        System.out.println("2) Add crema on the side");

        System.out.println("Enter a Value: ");
        int addOnChoice = Main.scanner.nextInt();

        switch (addOnChoice){

            case 1 -> cart.addLimes(limeAmount());
            case 2 -> cart.addCrema(cremaAmount());
        }
    }

    public int limeAmount(){
        System.out.print("How many limes would you like: ");
        return Main.scanner.nextInt();
    }

    public int cremaAmount(){
        System.out.print("How many crema sides would you like: ");
        return Main.scanner.nextInt();
    }

}
