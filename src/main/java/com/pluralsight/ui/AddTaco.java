package com.pluralsight.ui;

import com.pluralsight.Main;

import java.util.ArrayList;
import java.util.List;

public class AddTaco implements Screen{

    boolean extra = true;

    @Override
    public void display() {
        boolean running = true;

        while (running) {

            System.out.println("Select Shell");
            System.out.println("1) Corn");
            System.out.println("2) Flour");
            System.out.println("3) Hard Shell");
            System.out.println("4) Bowl");
            System.out.println("0) Go Back");
            System.out.print("Enter a Value: ");

            int choice = Main.scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.println("corn");
                case 2 -> System.out.println("flour");
                case 3 -> System.out.println("hard shell");
                case 4 -> System.out.println("bowl");
                case 0 -> running = false;
                default -> System.out.println("Invalid Input");

            }
            meat();
            cheese();
        }
    }
    public void meat(){
        while (extra) {
            System.out.println("Select Meats");
            System.out.println("1) Carne Asada/Beef");
            System.out.println("2) Al Pastor/Pork");
            System.out.println("3) Carnitas/Pork");
            System.out.println("4) Pollo/Chicken");
            System.out.println("5) Chorizo/");
            System.out.println("6) Pescado/Fish");
            System.out.println("0) Go Back");
            System.out.print("Enter a Value: ");

            int meatChoice = Main.scanner.nextInt();
            Main.scanner.nextLine();

            switch (meatChoice) {
                case 1 -> System.out.println("carne asada");
                case 2 -> System.out.println("al pastor");
                case 3 -> System.out.println("carnitas");
                case 4 -> System.out.println("pollo");
                case 5 -> System.out.println("chorizo");
                case 6 -> System.out.println("pescado");
                case 0 -> extra = false;
                default -> System.out.println("Invalid Input");
            }

            System.out.println("Extra Meat (yes/no): ");
            String extraMeat = Main.scanner.nextLine();

            if (extraMeat.equalsIgnoreCase("no")) {
                extra = false;
                break;
            }
        }
    }

    public void cheese(){
        while (extra) {
            System.out.println("Select Cheese");
            System.out.println("1) Queso Fresco");
            System.out.println("2) Oaxaca");
            System.out.println("3) Cotija");
            System.out.println("4) Cheddar");
            System.out.println("0) No Cheese");

            System.out.print("Enter a Value: ");

            int cheeseChoice = Main.scanner.nextInt();
            Main.scanner.nextLine();

            switch (cheeseChoice) {
                case 1 -> System.out.println("queso frsco");
                case 2 -> System.out.println("oaxaca");
                case 3 -> System.out.println("coija");
                case 4 -> System.out.println("cheddar");
                case 0 -> extra = false;
                default -> System.out.println("Invalid Input");
            }

            System.out.println("Extra Cheese (yes/no): ");
            String extraMeat = Main.scanner.nextLine();

            if (extraMeat.equalsIgnoreCase("no")) {
                extra = false;
                break;
            }
        }
    }
    public ArrayList<String> toppings (){
        ArrayList<String> toppingList = new ArrayList<>();

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
        System.out.println("0) Go Back");
        System.out.print("Enter a Value: ");

        int toppingChoice = Main.scanner.nextInt();

        return toppingList;
    }
}
