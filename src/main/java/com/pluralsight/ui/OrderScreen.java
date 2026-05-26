package com.pluralsight.ui;

import com.pluralsight.Main;
import com.pluralsight.model.Cart;


public class OrderScreen implements Screen{
    private Cart cart =  new Cart();

    @Override
    public void display() {
        boolean running = true;


        while (running) {

            System.out.println("1) Add Taco");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips & Salsa");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            System.out.print("Enter a Value: ");

            int choice = Main.scanner.nextInt();

            switch (choice) {
                case 1 -> cart.addTaco(new AddTaco().buildTaco());
                case 2 -> System.out.println("add drink");
                case 3 -> System.out.println("add chips and salsa");
                case 4 -> new Checkout(cart).display();
                case 0 -> running = false;
                default -> System.out.println("Invalid Input");
            }
        }
    }
}
