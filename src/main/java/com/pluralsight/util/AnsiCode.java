package com.pluralsight.util;

import com.pluralsight.Main;
import com.pluralsight.model.Taco;

public class AnsiCode {
    // ANSI COLORS
    public static final String RESET = "\u001B[0m";

    public static final String CYAN = "\u001B[96m";
    public static final String GREEN = "\u001B[92m";
    public static final String MAGENTA = "\u001B[95m";
    public static final String WHITE = "\u001B[97m";
    public static final String GRAY = "\u001B[37m";
    public static final String RED = "\u001B[91m";
    public static final String YELLOW = "\u001B[93m";
    public static final String ICE = "\u001B[38;5;123m";
    public static final String SILVER = "\u001B[38;5;250m";

    public static final String BOLD = "\u001B[1m";


    public static void printBanner(){
        printTop();

        System.out.println(CYAN + BOLD +
                "║" + YELLOW + "              T A C O H O L I C S          " + CYAN + "         ║");
        System.out.println(CYAN +
                "║" + GRAY +   "           Personalized Tacos. Great Price.    " + CYAN + "     ║");

        printMiddle();
    }

    public static void printHeader(){
        System.out.printf(CYAN + BOLD + "║ %-36s %-7s %-4s ║%n" + RESET, "ITEM", "QTY", "PRICE");

        System.out.println(CYAN + "╟────────────────────────────────────────────────────╢" + RESET);
    }

    public static void printHomeMenu(){
        System.out.printf(CYAN + BOLD + "║ "  + SILVER + "[" + YELLOW + "1" + SILVER + "] " + WHITE + "%-47s"  + CYAN + "║%n" + RESET, " New Order");

        System.out.printf(CYAN + BOLD + "║ "  + SILVER + "[" + RED + "0" + SILVER + "] " + WHITE + "%-46s " + CYAN + "║%n" + RESET, " Exit");

        System.out.println(CYAN + BOLD + "╚════════════════════════════════════════════════════╝" + RESET);
    }

    public static void printOrderMenu() {

        System.out.printf(CYAN + BOLD + "║ " + GRAY + "%-51s" + CYAN + "║%n" + RESET, "  ORDER");

        System.out.println(CYAN + BOLD + "║" + GRAY + BOLD + "  ──────────────────────────────────────            " + CYAN + BOLD + "║"+ RESET);

        System.out.printf(CYAN + BOLD + "║ " + SILVER + "[" + YELLOW + "1" + SILVER + "] "  + WHITE + "%-47s" + CYAN + "║%n" + RESET, " Add Taco");

        System.out.printf(CYAN + BOLD + "║ " + SILVER + "[" + YELLOW + "2" + SILVER + "] "  + WHITE + "%-47s" + CYAN + "║%n" + RESET, " Add Signature Taco");

        System.out.printf(CYAN + BOLD + "║ " + SILVER + "[" + YELLOW + "3" + SILVER + "] " + WHITE + "%-47s" + CYAN + "║%n" + RESET, " Add Burrito");

        System.out.printf(CYAN + BOLD + "║ " + SILVER + "[" + YELLOW + "4" + SILVER + "] " + WHITE + "%-47s" + CYAN + "║%n" + RESET, " Add Drink");

        System.out.printf(CYAN + BOLD + "║ " + SILVER + "[" + YELLOW + "5" + SILVER + "] " + WHITE + "%-47s" + CYAN + "║%n" + RESET, " Add Chips & Salsa");

        System.out.printf(CYAN + BOLD + "║ " + SILVER + "[" + YELLOW + "6" + SILVER + "] " + WHITE + "%-47s" + CYAN + "║%n" + RESET, " Add-Ons");

        printMiddle();

        System.out.printf(CYAN + BOLD + "║ " + GRAY + "%-51s" + CYAN + "║%n" + RESET, "  ACTIONS");

        System.out.println(CYAN + BOLD + "║" + GRAY + BOLD + "  ──────────────────────────────────────            " + CYAN + BOLD + "║"+ RESET);

        System.out.printf(CYAN + BOLD + "║ " + SILVER + "[" + GREEN + "7" + SILVER + "] " + WHITE + "%-47s" + CYAN + "║%n" + RESET, " Checkout");

        System.out.printf(CYAN + BOLD + "║ " + SILVER + "[" + RED + "0" + SILVER + "] " + WHITE + "%-47s" + CYAN + "║%n" + RESET, " Cancel Order");

        printBottom();
    }

    public static void printCheckoutMenu(){
        System.out.printf(CYAN + BOLD + "║ " + SILVER + "[" + GREEN + "1" + SILVER + "] " + WHITE + "%-47s" + CYAN + "║%n" + RESET, " Proceed with Payment");
        System.out.printf(CYAN + BOLD + "║ " + SILVER + "[" + YELLOW + "2" + SILVER + "] " + WHITE + "%-47s" + CYAN + "║%n" + RESET, " Return to Menu");
        System.out.printf(CYAN + BOLD + "║ " + SILVER + "[" + RED + "0" + SILVER + "] " + WHITE + "%-47s" + CYAN + "║%n" + RESET, " Cancel");
        AnsiCode.printBottom();
    }

    public static void printInvalid(){
        System.out.printf(RED + "✖ "  + "%-44s%n" + RESET,"Invalid Input");
    }

    public static void printInvalidCard(){
        System.out.println(RED + "Invalid card info, please try again."+ RESET);
    }

    public static void printSelection(){
        System.out.print(GRAY + BOLD + "Enter Selection: " + RESET + WHITE);
    }

    public static void printTop() {
        System.out.println(CYAN + BOLD + "╔════════════════════════════════════════════════════╗"+ RESET);
    }

    public static void printMiddle(){
        System.out.println(CYAN + BOLD + "╟────────────────────────────────────────────────────╢" + RESET);
    }

    public static void printBottom(){
        System.out.println(CYAN + BOLD + "╚════════════════════════════════════════════════════╝" + RESET);
    }

    // TACO
    public static void printTacoType(){
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.println(YELLOW + BOLD + "  SELECT TACO TYPE" + RESET);
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.printf(SILVER + "  [" + YELLOW + "1" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Single Taco");
        System.out.printf(SILVER + "  [" + YELLOW + "2" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " 3 Taco Plate (3 tacos same ingredients)");
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
    }

    public static void printShellMenu(){
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.println(YELLOW + BOLD + "  SELECT SHELL" + RESET);
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.printf(SILVER + "  [" + YELLOW + "1" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Corn");
        System.out.printf(SILVER + "  [" + YELLOW + "2" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Flour");
        System.out.printf(SILVER + "  [" + YELLOW + "3" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Hard Shell");
        System.out.printf(SILVER + "  [" + YELLOW + "4" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Bowl");
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
    }

    public static void printMeatMenu(){
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.println(YELLOW + BOLD + "  SELECT MEAT" + RESET);
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.printf(SILVER + "  [" + YELLOW + "1" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Carne Asada/Beef");
        System.out.printf(SILVER + "  [" + YELLOW + "2" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Al Pastor/Pork");
        System.out.printf(SILVER + "  [" + YELLOW + "3" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Carnitas/Pork");
        System.out.printf(SILVER + "  [" + YELLOW + "4" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Pollo/Chicken");
        System.out.printf(SILVER + "  [" + YELLOW + "5" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Chorizo");
        System.out.printf(SILVER + "  [" + YELLOW + "6" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Pescado/Fish");
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
    }

    public static void printCheeseMenu(){
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.println(YELLOW + BOLD + "  SELECT CHEESE (+$0.75)" + RESET);
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.printf(SILVER + "  [" + YELLOW + "1" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Queso Fresco");
        System.out.printf(SILVER + "  [" + YELLOW + "2" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Oaxaca");
        System.out.printf(SILVER + "  [" + YELLOW + "3" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Cotija");
        System.out.printf(SILVER + "  [" + YELLOW + "4" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Cheddar");
        System.out.printf(SILVER + "  [" + YELLOW + "0" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " No Cheese");
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
    }

    public static void printToppingsMenu(){
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.println(YELLOW + BOLD + "  SELECT TOPPINGS" + RESET);
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.printf(SILVER + "  [" + YELLOW + "1" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Lettuce");
        System.out.printf(SILVER + "  [" + YELLOW + "2" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Cilantro");
        System.out.printf(SILVER + "  [" + YELLOW + "3" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Onion");
        System.out.printf(SILVER + "  [" + YELLOW + "4" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Tomatoes");
        System.out.printf(SILVER + "  [" + YELLOW + "5" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Jalapenos");
        System.out.printf(SILVER + "  [" + YELLOW + "6" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Radishes");
        System.out.printf(SILVER + "  [" + YELLOW + "7" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Pico de Gallo");
        System.out.printf(SILVER + "  [" + YELLOW + "8" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Corn");
        System.out.printf(SILVER + "  [" + YELLOW + "9" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Guacamole");
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
    }

    public static void printTortillaMenu(){
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.println(YELLOW + BOLD + "  SELECT TORTILLA" + RESET);
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.printf(SILVER + "  [" + YELLOW + "1" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Flour");
        System.out.printf(SILVER + "  [" + YELLOW + "2" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Whole Wheat");
        System.out.printf(SILVER + "  [" + YELLOW + "3" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Spinach");
        System.out.printf(SILVER + "  [" + YELLOW + "4" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Bowl");
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
    }

    public static void printBeansMenu(){
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.println(YELLOW + BOLD + "  SELECT BEANS" + RESET);
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.printf(SILVER + "  [" + YELLOW + "1" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Black Beans");
        System.out.printf(SILVER + "  [" + YELLOW + "2" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Pinto Beans");
        System.out.printf(SILVER + "  [" + YELLOW + "3" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Refried Beans");
        System.out.printf(SILVER + "  [" + YELLOW + "4" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " No Beans");
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
    }

    public static void printRiceMenu(){
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.println(YELLOW + BOLD + "  SELECT RICE" + RESET);
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.printf(SILVER + "  [" + YELLOW + "1" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " White Rice");
        System.out.printf(SILVER + "  [" + YELLOW + "2" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Mexican Rice");
        System.out.printf(SILVER + "  [" + YELLOW + "3" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Cilantro Lime Rice");
        System.out.printf(SILVER + "  [" + YELLOW + "4" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " No Rice");
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
    }
    public static void printSalsaMenu(){
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.println(YELLOW + BOLD + "  SELECT SALSA FLAVOR" + RESET);
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.printf(SILVER + "  [" + YELLOW + "1" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Salsa Verde");
        System.out.printf(SILVER + "  [" + YELLOW + "2" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Salsa Roja");
        System.out.printf(SILVER + "  [" + YELLOW + "3" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Chipotle");
        System.out.printf(SILVER + "  [" + YELLOW + "4" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Habanero");
        System.out.printf(SILVER + "  [" + YELLOW + "5" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Mild");
        System.out.printf(SILVER + "  [" + YELLOW + "6" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Extra Hot");
        System.out.printf(SILVER + "  [" + YELLOW + "7" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Molcajete Salsa");
        System.out.printf(SILVER + "  [" + YELLOW + "8" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Chile de Arbol Salsa");
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
    }

    public static void printDrinkSizeMenu(){
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.println(YELLOW + BOLD + "  SELECT DRINK SIZE" + RESET);
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.printf(SILVER + "  [" + YELLOW + "1" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " 24 oz");
        System.out.printf(SILVER + "  [" + YELLOW + "2" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " 36 oz");
        System.out.printf(SILVER + "  [" + YELLOW + "3" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " 48 oz");
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
    }

    public static void printDrinkFlavorMenu(){
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.println(YELLOW + BOLD + "  SELECT DRINK FLAVOR" + RESET);
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.printf(SILVER + "  [" + YELLOW + "1" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Coke");
        System.out.printf(SILVER + "  [" + YELLOW + "2" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Diet Coke");
        System.out.printf(SILVER + "  [" + YELLOW + "3" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Sprite");
        System.out.printf(SILVER + "  [" + YELLOW + "4" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Dr Pepper");
        System.out.printf(SILVER + "  [" + YELLOW + "5" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Root Beer");
        System.out.printf(SILVER + "  [" + YELLOW + "6" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Lemonade");
        System.out.printf(SILVER + "  [" + YELLOW + "7" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Sweet Tea");
        System.out.printf(SILVER + "  [" + YELLOW + "8" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Unsweet Tea");
        System.out.printf(SILVER + "  [" + YELLOW + "9" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Orange Fanta");
        System.out.printf(SILVER + "  [" + YELLOW + "10" + SILVER + "] " + WHITE + "%-46s%n" + RESET, " Mountain Dew");
        System.out.printf(SILVER + "  [" + YELLOW + "11" + SILVER + "] " + WHITE + "%-46s%n" + RESET, " Pepsi");
        System.out.printf(SILVER + "  [" + YELLOW + "12" + SILVER + "] " + WHITE + "%-46s%n" + RESET, " Cherry Coke");
        System.out.printf(SILVER + "  [" + YELLOW + "13" + SILVER + "] " + WHITE + "%-46s%n" + RESET, " Hi-C Fruit Punch");
        System.out.printf(SILVER + "  [" + YELLOW + "14" + SILVER + "] " + WHITE + "%-46s%n" + RESET, " Powerade");
        System.out.printf(SILVER + "  [" + YELLOW + "15" + SILVER + "] " + WHITE + "%-46s%n" + RESET, " Water");
        System.out.printf(SILVER + "  [" + YELLOW + "16" + SILVER + "] " + WHITE + "%-46s%n" + RESET, " Horchata");
        System.out.printf(SILVER + "  [" + YELLOW + "17" + SILVER + "] " + WHITE + "%-46s%n" + RESET, " Jarritos Lime");
        System.out.printf(SILVER + "  [" + YELLOW + "18" + SILVER + "] " + WHITE + "%-46s%n" + RESET, " Jarritos Mandarin");
        System.out.printf(SILVER + "  [" + YELLOW + "19" + SILVER + "] " + WHITE + "%-46s%n" + RESET, " Baja Blast");
        System.out.printf(SILVER + "  [" + YELLOW + "20" + SILVER + "] " + WHITE + "%-46s%n" + RESET, " Strawberry Lemonade");
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
    }

    public static void printExtraMeat(){
        System.out.print(YELLOW + "  Extra Meat +$0.50 (yes/no): " + WHITE + RESET);
    }

    public static void printExtraCheese(){

        System.out.print(YELLOW + "  Extra Cheese +$0.50 (yes/no): " + WHITE + RESET);
    }

    public static void printMoreToppings(){
        System.out.print(YELLOW + "  More Toppings (yes/no): " + WHITE + RESET);
    }

    public static void printAddOnMenu(){
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.println(YELLOW + BOLD + "  ADD-ONS" + RESET);
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.printf(SILVER + "  [" + YELLOW + "1" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Add Lime Wedges");
        System.out.printf(SILVER + "  [" + YELLOW + "2" + SILVER + "] " + WHITE + "%-47s%n" + RESET, " Add Crema on the Side");
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
    }

    public static void printLimePrompt(){
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.print(YELLOW + "  How many lime wedges would you like: " + WHITE + RESET);
    }

    public static void printCremaPrompt(){
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.print(YELLOW + "  How many crema sides would you like: " + WHITE + RESET);
    }

    public static void printTotal(double subtotal, double tax, double total){
        String subLine   = String.format("%-37s $%-8.2f", "SUBTOTAL:", subtotal);
        String taxLine   = String.format("%-37s $%-8.2f", "TAX (8.00%):", tax);
        String totalLine = String.format("%-37s $%-8.2f", "TOTAL:", total);

        System.out.println(CYAN + BOLD + "║ " + GREEN   + BOLD + String.format("%-50.50s", subLine)   + CYAN + BOLD + " ║" + RESET);
        System.out.println(CYAN + BOLD + "║ " + GREEN   + BOLD + String.format("%-50.50s", taxLine)   + CYAN + BOLD + " ║" + RESET);
        AnsiCode.printMiddle();
        System.out.println(CYAN + BOLD + "║ " + MAGENTA + BOLD + String.format("%-50.50s", totalLine) + CYAN + BOLD + " ║" + RESET);
        AnsiCode.printMiddle();
    }

    public static void printFooter(){
        System.out.println(MAGENTA + BOLD + "               Thank you! Come again!" + RESET);
    }

    public static void printPaymentMenu(){
        printBanner();
        System.out.println(CYAN + BOLD + "║ " + GRAY  + String.format("%-50.50s", "  PAYMENT") + CYAN + BOLD + " ║" + RESET);
        System.out.println(CYAN + BOLD + "║" + GRAY + BOLD + "  ──────────────────────────────────────            " + CYAN + BOLD + "║" + RESET);
        System.out.printf(CYAN + BOLD + "║ " + WHITE + "%-50s" + CYAN + " ║%n" + RESET, " Card Number (16 digits):");
        System.out.printf(CYAN + BOLD + "║ " + WHITE + "%-50s" + CYAN + " ║%n" + RESET, " Expiration Date (MM/YY):");
        System.out.printf(CYAN + BOLD + "║ " + WHITE + "%-50s" + CYAN + " ║%n" + RESET, " CVV (3 digits):");
        printBottom();
    }

    public static void printPaymentPrompt(String prompt){
        System.out.println(GRAY + BOLD + "  ──────────────────────────────────────────────────" + RESET);
        System.out.print(YELLOW + "  " + String.format("%-50.50s", prompt) + RESET);
        System.out.print("\n" + GRAY + BOLD + "  ══> " + RESET + WHITE);
    }

    public static void printPaymentSuccess(){
        printTop();
        System.out.println(CYAN + BOLD + "║ " + GREEN + BOLD + String.format("%-50.50s", "             Payment Successful!") + CYAN + BOLD + " ║" + RESET);
        printBottom();
        printFooter();
    }
}
