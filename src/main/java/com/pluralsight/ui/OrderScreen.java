package com.pluralsight.ui;

import com.pluralsight.Main;
import com.pluralsight.model.Burrito;
import com.pluralsight.model.Cart;
import com.pluralsight.model.ChipsAndSalsa;


public class OrderScreen implements Screen{
    private Cart cart =  new Cart();

    @Override
    public void display() {
        boolean running = true;

        while (running) {

            System.out.println("1) Add Taco");
            System.out.println("2) Add Burrito");
            System.out.println("3) Add Drink");
            System.out.println("4) Add Chips & Salsa");
            System.out.println("5) Add-Ons");
            System.out.println("6) Checkout");
            System.out.println("0) Cancel Order");
            System.out.print("Enter a Value: ");

            int choice = Main.scanner.nextInt();

            switch (choice) {
                case 1 -> cart.addTaco(new AddTaco().buildTaco());
                case 2 -> cart.addBurrito(new AddBurrito().buildBurrito());
                case 3 -> cart.addDrink(new AddDrink().buildDrink());
                case 4 -> cart.addChipSalsa(new AddOns(cart).buildChipAndSalsa());
                case 5 -> new AddOns(cart).display();
                case 6 -> new Checkout(cart).display();
                case 0 -> running = false;
                default -> System.out.println("Invalid Input");
            }
        }
    }
}
