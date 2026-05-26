package com.pluralsight.ui;

import com.pluralsight.Main;
import com.pluralsight.model.SingleTaco;
import com.pluralsight.model.Taco;
import com.pluralsight.model.ThreeTacoPlate;

import java.util.ArrayList;
import java.util.List;

public class AddTaco implements Screen{
    private boolean extraMeat;
    private boolean extraCheese;

    @Override
    public void display() {
        buildTaco();
    }

    public Taco buildTaco(){
        int type = tacoType();
        String shell = shell();
        List<String> meat =  meat();
        List<String> cheese = cheese();
        List<String> toppings = toppings();


        if (type == 1){
            return new SingleTaco(shell,meat,cheese,toppings,extraMeat,extraCheese);
        } else {
            return new ThreeTacoPlate(shell,meat,cheese,toppings,extraMeat,extraCheese);
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
                case 1 -> selectedCheese.add("queso frsco");
                case 2 -> selectedCheese.add("oaxaca");
                case 3 -> selectedCheese.add("coija");
                case 4 -> selectedCheese.add("cheddar");
                default -> selectedCheese.add("Invalid Input");
            }

            System.out.print("Extra Cheese .50 More (yes/no): ");
            extraCheese = Main.scanner.nextLine().equalsIgnoreCase("yes");

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
