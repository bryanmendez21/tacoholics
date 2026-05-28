package com.pluralsight.ui.builders;

import com.pluralsight.Main;
import com.pluralsight.model.Burrito;
import com.pluralsight.model.Ingredients;
import com.pluralsight.util.AnsiCode;

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
        AnsiCode.printTortillaMenu();

        AnsiCode.printSelection();

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
        AnsiCode.printBeansMenu();

        AnsiCode.printSelection();

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
        AnsiCode.printRiceMenu();

        AnsiCode.printSelection();

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
