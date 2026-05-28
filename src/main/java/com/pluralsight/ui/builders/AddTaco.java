package com.pluralsight.ui.builders;

import com.pluralsight.Main;
import com.pluralsight.model.Ingredients;
import com.pluralsight.model.SingleTaco;
import com.pluralsight.model.Taco;
import com.pluralsight.model.ThreeTacoPlate;

import java.util.List;

public class AddTaco {
    Ingredients custom = new Ingredients();

    public Taco buildTaco(){
        int type = tacoType();
        String shell = shell();
        List<String> meat =  custom.meat();
        List<String> cheese = custom.cheese();
        List<String> toppings = custom.toppings();


        if (type == 1){
            return new SingleTaco(shell,meat,cheese,toppings,custom.isExtraMeat(), custom.isExtraCheese());
        } else {
            return new ThreeTacoPlate(shell,meat,cheese,toppings, custom.isExtraMeat(), custom.isExtraCheese());
        }
    }

    public int tacoType(){
        System.out.println("1) single taco \n2) 3 taco plate (3 tacos with same ingredients: ");
        int tacoTypeChoice = Main.scanner.nextInt();

        return tacoTypeChoice;
    }

    public String shell(){
        System.out.println("Select Shell");
        System.out.println("1) Corn");
        System.out.println("2) Flour");
        System.out.println("3) Hard Shell");
        System.out.println("4) Bowl");
        System.out.print("Enter a Value: ");

        int choice = Main.scanner.nextInt();

        String selectedShell = "";

        switch (choice) {
            case 1 -> selectedShell = "corn";
            case 2 -> selectedShell = "flour";
            case 3 -> selectedShell = "hard shell";
            case 4 -> selectedShell = "bowl";
            default -> System.out.println("Invalid Input");

        }
        return selectedShell;
    }


}
