package com.pluralsight.ui.screens;

import com.pluralsight.Main;
import com.pluralsight.model.Cart;
import com.pluralsight.ui.Screen;
import com.pluralsight.util.AnsiCode;


public class AddOns implements Screen {
    private Cart cart;

    public AddOns(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void display() {
        AnsiCode.printAddOnMenu();

        AnsiCode.printSelection();
        int addOnChoice = Main.scanner.nextInt();

        switch (addOnChoice){

            case 1 -> cart.addLimes(limeAmount());
            case 2 -> cart.addCrema(cremaAmount());
        }
    }

    public int limeAmount(){
        AnsiCode.printLimePrompt();
        return Main.scanner.nextInt();
    }

    public int cremaAmount(){
        AnsiCode.printCremaPrompt();
        return Main.scanner.nextInt();
    }

}
