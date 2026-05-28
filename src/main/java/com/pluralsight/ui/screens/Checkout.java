package com.pluralsight.ui.screens;

import com.pluralsight.Main;
import com.pluralsight.model.*;
import com.pluralsight.ui.Screen;
import com.pluralsight.util.AnsiCode;

import static com.pluralsight.util.AnsiCode.*;


public class Checkout  {
    private Cart cart;

    public Checkout(Cart cart) {
        this.cart = cart;
    }

    public boolean display(){
        boolean running = true;
        boolean paid = false;

        while (running) {

            AnsiCode.printBanner();
            AnsiCode.printHeader();

            // Taco
            for (Taco taco : cart.getTacos()) {
                String label = taco instanceof ThreeTacoPlate ? "3 Taco Plate" : "Single Taco";
                String tacoLine = String.format("%-37s x%-6d $%-4.2f", label, taco.getQuantity(), taco.getPrice());
                String tacoDesc = String.format("  - %-46.46s", taco.description());
                System.out.println(CYAN + BOLD + "║ " + WHITE + String.format("%-50.50s", tacoLine) + CYAN + BOLD + " ║" + RESET);
                System.out.println(CYAN + BOLD + "║ " + GRAY  + String.format("%-50.50s", tacoDesc) + CYAN + BOLD + " ║" + RESET);
                AnsiCode.printMiddle();
            }

            // Drink
            for (Drink drink : cart.getDrinks()) {
                String drinkLine = String.format("%-37s %-6s $%-4.2f", "Drink", "-", drink.getPrice());
                String drinkDesc = String.format("  - %-46.46s", drink.description());
                System.out.println(CYAN + BOLD + "║ " + WHITE + String.format("%-50.50s", drinkLine) + CYAN + BOLD + " ║" + RESET);
                System.out.println(CYAN + BOLD + "║ " + GRAY  + String.format("%-50.50s", drinkDesc) + CYAN + BOLD + " ║" + RESET);
                AnsiCode.printMiddle();
            }

            // Burrito
            for (Burrito burrito : cart.getBurrito()) {
                String burritoLine = String.format("%-37s %-6s $%-4.2f", "Burrito", "-", burrito.getPrice());
                String burritoDesc = String.format("  - %-46.46s", burrito.description());
                System.out.println(CYAN + BOLD + "║ " + WHITE + String.format("%-50.50s", burritoLine) + CYAN + BOLD + " ║" + RESET);
                System.out.println(CYAN + BOLD + "║ " + GRAY  + String.format("%-50.50s", burritoDesc) + CYAN + BOLD + " ║" + RESET);
                AnsiCode.printMiddle();
            }

            // Chips and Salsa
            for (ChipsAndSalsa chipSalsa : cart.getChipSalsa()) {
                String chipsLine = String.format("%-37s %-6s $%-4.2f", "Chips & Salsa", "-", chipSalsa.getPrice());
                String chipsDesc = String.format("  - %-46.46s", chipSalsa.description());
                System.out.println(CYAN + BOLD + "║ " + WHITE + String.format("%-50.50s", chipsLine) + CYAN + BOLD + " ║" + RESET);
                System.out.println(CYAN + BOLD + "║ " + GRAY  + String.format("%-50.50s", chipsDesc) + CYAN + BOLD + " ║" + RESET);
                AnsiCode.printMiddle();
            }


            // Lime
            if (cart.getLimeCount() > 0)
                System.out.printf(CYAN + "║ " + RESET + WHITE + "%-37s x%-3d  %-4s" + CYAN + BOLD + " ║%n","Lime Wedges ", cart.getLimeCount(), " -Free");

            // Cream
            if (cart.getCremaCount() > 0)
                System.out.printf(CYAN + "║ " + RESET + WHITE + "%-37s x%-3d  %-4s" + CYAN + BOLD + " ║%n","Crema on the side ", cart.getCremaCount(), " -Free");


            double subtotal = cart.getTotal();
            double tax = subtotal * 0.08;

            AnsiCode.printMiddle();

            AnsiCode.printTotal(subtotal, tax, subtotal + tax);

            AnsiCode.printCheckoutMenu();

            int checkoutChoice = Main.scanner.nextInt();
            Main.scanner.nextLine();

            switch (checkoutChoice) {
                case 1 -> {
                    paid = new Payment(cart).display();
                    if(paid) running = false;
                }
                case 2 -> running = false;
                case 0 -> {
                    cart.clearCart();
                    return false;
                }
            }
        }
        return paid;
    }


}
