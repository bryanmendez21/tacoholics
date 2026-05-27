package com.pluralsight.model;

import com.pluralsight.Main;

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
            System.out.println("Select Meat");
            System.out.println("1) Carne Asada/Beef");
            System.out.println("2) Al Pastor/Pork");
            System.out.println("3) Carnitas/Pork");
            System.out.println("4) Pollo/Chicken");
            System.out.println("5) Chorizo/");
            System.out.println("6) Pescado/Fish");
            System.out.print("Enter a Value: ");

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

            System.out.print("Extra Meat .50 More (yes/no): ");
            extraMeat = Main.scanner.nextLine().equalsIgnoreCase("yes");

        } while (extraMeat);

        return selectedMeat;

    }

    public ArrayList<String> cheese(){
        ArrayList<String> selectedCheese = new ArrayList<>();

        do {
            System.out.println("Add Cheese For .75 More");
            System.out.println("1) Queso Fresco");
            System.out.println("2) Oaxaca");
            System.out.println("3) Cotija");
            System.out.println("4) Cheddar");
            System.out.println("0) No Cheese");

            System.out.print("Enter a Value: ");

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
                System.out.print("Extra Cheese .50 More (yes/no): ");
                extraCheese = Main.scanner.nextLine().equalsIgnoreCase("yes");
            }
        } while (extraCheese);

        return selectedCheese;
    }

    public ArrayList<String> toppings() {
        ArrayList<String> toppingList = new ArrayList<>();
        String moreTopping;

        do {
            System.out.println("Select toppings");
            System.out.println("1) Lettuce");
            System.out.println("2) Cilantro");
            System.out.println("3) Onion");
            System.out.println("4) Tomatoes");
            System.out.println("5) Jalapenos");
            System.out.println("6) Radishes");
            System.out.println("7) Pico de Gallo");
            System.out.println("8) Corn");
            System.out.println("9) Guacamole");
            System.out.print("Enter a Value: ");

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

            System.out.print("More Topping (yes/no): ");
            moreTopping = Main.scanner.nextLine();

        } while(moreTopping.equalsIgnoreCase("yes"));

        return toppingList;
    }
}
