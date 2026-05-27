package com.pluralsight.ui;

import com.pluralsight.Main;
import com.pluralsight.model.Cart;
import com.pluralsight.model.ChipsAndSalsa;

import java.util.LinkedHashMap;
import java.util.Map;

public class AddOns implements Screen{
    private Cart cart;

    public AddOns(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void display() {
        System.out.println("1) Add Chips and Salsa for $1.50");
        System.out.println("2) Add lime wedges");
        System.out.println("3) Add crema on the side");

        System.out.println("Enter a Value: ");
        int addOnChoice = Main.scanner.nextInt();

        switch (addOnChoice){
            case 1 -> buildChipAndSalsa();
            case 2 -> limeAmount();
            case 3 -> cremaAmount();
        }
    }

    public ChipsAndSalsa buildChipAndSalsa(){

        String flavor = salsaFlavor();

        return new ChipsAndSalsa(flavor);
    }

    public String salsaFlavor(){
        Map<Integer,String> salsa = new LinkedHashMap<>();

        System.out.println("===Available Salsa Flavors===");

        salsa.put(1, "Salsa Verde");
        salsa.put(2, "Salsa Roja");
        salsa.put(3, "Chipotle");
        salsa.put(4, "Habanero");
        salsa.put(5, "Mild");
        salsa.put(6, "Extra Hot");
        salsa.put(7, "Molcajete Salsa");
        salsa.put(8, "Chile de Arbol salsa");


        for(Map.Entry<Integer,String> entry : salsa.entrySet()){
            System.out.println(entry.getKey() + ") " + entry.getValue());
        }

        System.out.print("Choose a Salsa Flavor: ");
        int salsaChoice = Main.scanner.nextInt();

        return salsa.get(salsaChoice);
    }

    public int limeAmount(){
        System.out.println("How many limes would you like: ");
        return Main.scanner.nextInt();
    }

    public int cremaAmount(){
        System.out.println("How many crema sides would you like: ");
        return Main.scanner.nextInt();
    }

}
