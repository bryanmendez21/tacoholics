package com.pluralsight.model;

import com.pluralsight.Main;
import com.pluralsight.util.AnsiCode;

import java.util.ArrayList;

public class Ingredients {
    private boolean extraMeat;
    private boolean extraCheese;

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public ArrayList<String> meat(){
        ArrayList<String> selectedMeat = new ArrayList<>();

        do{
            AnsiCode.printMeatMenu();

            AnsiCode.printSelection();

            int meatChoice = Main.scanner.nextInt();
            Main.scanner.nextLine();

            switch (meatChoice) {
                case 1 -> selectedMeat.add("carne asada");
                case 2 -> selectedMeat.add("al pastor");
                case 3 -> selectedMeat.add("carnitas");
                case 4 -> selectedMeat.add("pollo");
                case 5 -> selectedMeat.add("chorizo");
                case 6 -> selectedMeat.add("pescado");
                default -> System.out.println("Invalid Input");
            }

            AnsiCode.printExtraMeat();
            extraMeat = Main.scanner.nextLine().equalsIgnoreCase("yes");

        } while (extraMeat);

        return selectedMeat;

    }

    public ArrayList<String> cheese(){
        ArrayList<String> selectedCheese = new ArrayList<>();

        do {
            AnsiCode.printCheeseMenu();

            AnsiCode.printSelection();

            int cheeseChoice = Main.scanner.nextInt();
            Main.scanner.nextLine();

            switch (cheeseChoice) {
                case 1 -> selectedCheese.add("queso fresco");
                case 2 -> selectedCheese.add("oaxaca");
                case 3 -> selectedCheese.add("coija");
                case 4 -> selectedCheese.add("cheddar");
                case 0 -> {}
                default -> System.out.println("Invalid Input");
            }
            if (cheeseChoice != 0) {
                AnsiCode.printExtraCheese();
                extraCheese = Main.scanner.nextLine().equalsIgnoreCase("yes");
            }
        } while (extraCheese);

        return selectedCheese;
    }

    public ArrayList<String> toppings() {
        ArrayList<String> toppingList = new ArrayList<>();
        String moreTopping;

        do {
            AnsiCode.printToppingsMenu();

            AnsiCode.printSelection();

            int toppingChoice = Main.scanner.nextInt();
            Main.scanner.nextLine();

            switch (toppingChoice) {
                case 1 -> toppingList.add("Lettuce");
                case 2 -> toppingList.add("Cilantro");
                case 3 -> toppingList.add("Onion");
                case 4 -> toppingList.add("Tomatoes");
                case 5 -> toppingList.add("Jalapeno");
                case 6 -> toppingList.add("Radish");
                case 7 -> toppingList.add("Pico De Gallo");
                case 8 -> toppingList.add("Corn");
                case 9 -> toppingList.add("Guacamole");
                default -> System.out.println("Invalid Input");

            }

            AnsiCode.printMoreToppings();
            moreTopping = Main.scanner.nextLine();

        } while(moreTopping.equalsIgnoreCase("yes"));

        return toppingList;
    }
}
