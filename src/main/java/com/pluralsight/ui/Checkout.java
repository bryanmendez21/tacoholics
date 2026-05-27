package com.pluralsight.ui;

import com.pluralsight.Main;
import com.pluralsight.model.*;


public class Checkout implements Screen{
    private Cart cart;

    public Checkout(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void display(){
        boolean running = true;

        while (running) {
            System.out.println("CHECK OUT");

            for (Taco taco : cart.getTacos()) {
                taco.description();
                System.out.println("Price: " + taco.getPrice());
            }
            for (Drink drink : cart.getDrinks()) {
                drink.description();
                System.out.println("Price: " + drink.getPrice());
            }
            for (Burrito burrito : cart.getBurrito()) {
                burrito.description();
                System.out.println("Price: " + burrito.getPrice());
            }
            for (ChipsAndSalsa chipSalsa : cart.getChipSalsa()) {
                chipSalsa.description();
                System.out.println("Price: " + chipSalsa.getPrice());
            }

            if (cart.getLimeCount() > 0)
                System.out.println("Lime Wedges X" + cart.getLimeCount() + " - Free");
            if (cart.getCremaCount() > 0)
                System.out.println("Crema on the side X" + cart.getCremaCount() + " - Free");

            System.out.printf("%n========================%nTotal: $%.2f%n", cart.getTotal());

            System.out.println("1) Proceed with Payment");
            System.out.println("2) Return to Menu");
            System.out.println("0) Cancel");

            int checkoutChoice = Main.scanner.nextInt();
            Main.scanner.nextLine();

            switch (checkoutChoice) {
                case 1 -> new Payment(cart).display();
                case 2 -> running = false;
                case 0 -> {
                    return;

                }
            }
        }
    }

}
