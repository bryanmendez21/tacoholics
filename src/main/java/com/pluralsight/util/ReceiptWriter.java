package com.pluralsight.util;

import com.pluralsight.model.*;

import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {
    public static void Write(Cart cart){


        String fileName = "src/main/resources/receipts" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss" )) + ".txt";

        try {
            PrintWriter writer = new PrintWriter(fileName);
            // Header
            writer.println("============================================");
            writer.println("              TACOHOLIC'S                  ");
            writer.println("============================================");
            writer.println("  Date: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMMM dd, yyyy  h:mm a")));
            writer.println("--------------------------------------------");

            // Tacos
            if (!cart.getTacos().isEmpty()) {
                writer.println("  TACOS");
                for (Taco taco : cart.getTacos()) {
                    writer.printf("  %-35s $%3.2f%n", taco.description(), taco.getPrice());
                }
                writer.println();
            }

            // Drinks
            if (!cart.getDrinks().isEmpty()) {
                writer.println("  DRINKS");
                for (Drink drink : cart.getDrinks()) {
                    writer.printf("  %-35s $%3.2f%n", drink.description(), drink.getPrice());
                }
                writer.println();
            }


            // Burritos
            if (!cart.getBurrito().isEmpty()) {
                writer.println("  BURRITOS");
                for (Burrito burrito : cart.getBurrito()) {
                    writer.printf("  %-35s $%3.2f%n", burrito.description(), burrito.getPrice());
                }
                writer.println();
            }

            // Chips & Salsa
            if (!cart.getChipSalsa().isEmpty()) {
                writer.println("  CHIPS & SALSA");
                for (ChipsAndSalsa chipSalsa : cart.getChipSalsa()) {
                    writer.printf("  %-35s $%3.2f%n", chipSalsa.description(), chipSalsa.getPrice());
                }
                writer.println();
            }

            // Footer
            writer.println("--------------------------------------------");
            writer.printf("  %-28s $%6.2f%n", "TOTAL:", cart.getTotal());
            writer.println("============================================");
            writer.println("       Thank you for visiting Tacoholic's!  ");
            writer.println("============================================");


            writer.close();

        } catch (Exception e) {
            System.out.println("Error saving receipt");
        }

    }
}
