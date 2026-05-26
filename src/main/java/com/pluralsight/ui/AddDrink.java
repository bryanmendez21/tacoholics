package com.pluralsight.ui;
import com.pluralsight.Main;
import com.pluralsight.model.Drink;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class AddDrink implements Screen{

    @Override
    public void display() {
        buildDrink();
    }

    public Drink buildDrink(){
        double size = drinkSize();
        String flavor = drinkFlavor();

        return new Drink(size,flavor);
    }

    public double drinkSize(){
        System.out.printf("%n====Choose Drink size====");
        System.out.printf("1) 24 oz %n2) 36oz %n3) 48oz%n");
        System.out.print("Enter Drink Size: ");

        int drinkChoice = Main.scanner.nextInt();
        double size = 0;

        switch(drinkChoice){
            case 1 -> size = 24;
            case 2 -> size = 36;
            case 3 -> size = 48;
        }
        return size;
    }

    public String drinkFlavor(){
        Map<Integer,String> drinks = new LinkedHashMap<>();

        System.out.println("===Available Drink Flavors===");

        drinks.put(1, "Coke");
        drinks.put(2, "Diet Coke");
        drinks.put(3, "Sprite");
        drinks.put(4, "Dr Pepper");
        drinks.put(5, "Root Beer");
        drinks.put(6, "Lemonade");
        drinks.put(7, "Sweet Tea");
        drinks.put(8, "Unsweet Tea");
        drinks.put(9, "Orange Fanta");
        drinks.put(10, "Mountain Dew");
        drinks.put(11, "Pepsi");
        drinks.put(12, "Cherry Coke");
        drinks.put(13, "Hi-C Fruit Punch");
        drinks.put(14, "Powerade");
        drinks.put(15, "Water");
        drinks.put(16, "Horchata");
        drinks.put(17, "Jarritos Lime");
        drinks.put(18, "Jarritos Mandarin");
        drinks.put(19, "Baja Blast");
        drinks.put(20, "Strawberry Lemonade");

        for(Map.Entry<Integer,String> entry : drinks.entrySet()){
            System.out.println(entry.getKey() + ") " + entry.getValue());
        }

        System.out.print("Choose a drink: ");
        int drinkChoice = Main.scanner.nextInt();

        return drinks.get(drinkChoice);
    }

}
