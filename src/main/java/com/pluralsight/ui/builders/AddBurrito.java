package com.pluralsight.ui.builders;

import com.pluralsight.Main;
import com.pluralsight.model.Burrito;
import com.pluralsight.model.Ingredients;

import java.util.List;

public class AddBurrito {
    Ingredients custom = new Ingredients();

    public Burrito buildBurrito(){

        String tortilla = tortilla();
        String rice = rice();
        String beans = beans();
        List<String> meat =  custom.meat();
        List<String> cheese = custom.cheese();
        List<String> topping = custom.toppings();

        return new Burrito(tortilla, beans, rice, meat, cheese, topping, custom.isExtraMeat(), custom.isExtraCheese());

    }

    public String tortilla(){
        System.out.println("Select Tortilla");
        System.out.println("1) Flour");
        System.out.println("2) Whole Wheat");
        System.out.println("3) Spinach");
        System.out.println("4) bowl");
        System.out.print("Enter a Value: ");

        int choice = Main.scanner.nextInt();

        String selectedTortilla = "";

        switch (choice) {
            case 1 -> selectedTortilla = "flour";
            case 2 -> selectedTortilla = "whole wheat";
            case 3 -> selectedTortilla = "spinach";
            case 4 -> selectedTortilla = "bowl";
            default -> System.out.println("Invalid Input");

        }
        return selectedTortilla;
    }


    public String beans(){
        System.out.println("Select Beans");
        System.out.println("1) Black Beans");
        System.out.println("2) Pinto Beans");
        System.out.println("3) Refried Beans");
        System.out.println("4) No Beans");
        System.out.print("Enter a Value: ");

        int choice = Main.scanner.nextInt();

        String selectedBean = "";

        switch (choice) {
            case 1 -> selectedBean = "black beans";
            case 2 -> selectedBean = "pinto beans";
            case 3 -> selectedBean = "refried beans";
            case 4 -> selectedBean = "";
            default -> System.out.println("Invalid Input");

        }
        return selectedBean;
    }


    public String rice(){
        System.out.println("Select Rice");
        System.out.println("1) White Rice");
        System.out.println("2) Mexican Rice");
        System.out.println("3) Cilantro Lime Rice");
        System.out.println("4) No Rice");
        System.out.print("Enter a Value: ");

        int choice = Main.scanner.nextInt();

        String selectedRice = "";

        switch (choice) {
            case 1 -> selectedRice = "white rice";
            case 2 -> selectedRice = "mexican rice";
            case 3 -> selectedRice = "cilantro lime rice";
            case 4 -> selectedRice = "";
            default -> System.out.println("Invalid Input");

        }
        return selectedRice;
    }
}
