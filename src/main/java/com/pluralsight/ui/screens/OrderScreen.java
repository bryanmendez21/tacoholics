package com.pluralsight.ui.screens;

import com.pluralsight.Main;
import com.pluralsight.model.Cart;
import com.pluralsight.ui.Screen;
import com.pluralsight.ui.builders.AddBurrito;
import com.pluralsight.ui.builders.AddChipsAndSalsa;
import com.pluralsight.ui.builders.AddDrink;
import com.pluralsight.ui.builders.AddTaco;
import com.pluralsight.util.AnsiCode;


public class OrderScreen implements Screen {
    private Cart cart =  new Cart();

    @Override
    public void display() {
        boolean running = true;

        while (running) {

            AnsiCode.printBanner();
            AnsiCode.printOrderMenu();
            AnsiCode.printSelection();
//
//            System.out.print("Enter Selection ");
//
            int choice = Main.scanner.nextInt();

            switch (choice) {
                case 1 -> cart.addTaco(new AddTaco().buildTaco());
                case 2 -> cart.addBurrito(new AddBurrito().buildBurrito());
                case 3 -> cart.addDrink(new AddDrink().buildDrink());
                case 4 -> cart.addChipSalsa(new AddChipsAndSalsa().buildChipAndSalsa());
                case 5 -> new AddOns(cart).display();
                case 6 -> {
                    boolean paid = new Checkout(cart).display();
                    if(paid || cart.isEmpty()) running = false;
                }
                case 0 -> running = false;
                default -> System.out.println("Invalid Input");
            }
        }
    }
}
