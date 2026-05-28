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
            for(Taco taco : cart.getTacos()){
                writer.println("Taco Description: " + taco.description());
                writer.println("Taco Price: " + taco.getPrice());
            }
            for (Drink drink : cart.getDrinks()){
                writer.println("Drink Description: " + drink.description());
                writer.println("Drink Price: " + drink.getPrice());
            }
            for (Burrito burrito : cart.getBurrito()){
                writer.println("Burrito Description: " + burrito.description());
                writer.println("Burrito Price: " + burrito.getPrice());
            }
            for (ChipsAndSalsa chipSalsa : cart.getChipSalsa()){
                writer.println("Chips & Salsa Description: " + chipSalsa.description());
                writer.println("Chips & Salsa Price: " + chipSalsa.getPrice());
            }
            writer.printf("Total: $%.2f%n",  cart.getTotal());

            writer.close();

        } catch (Exception e) {
            System.out.println("Error saving receipt");
        }

    }
}
