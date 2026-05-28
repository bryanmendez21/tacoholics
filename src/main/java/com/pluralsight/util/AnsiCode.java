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


        // Taco
//        for (Taco taco : cart.getTacos()) {
//            System.out.printf(CYAN + "║"  + RESET + WHITE +
//                            " 🌮 %-21s %-6d $%-9.2f $%-9.2f ║%n",
//                    "Taco", taco.getPrice() + RESET);
//            System.out.printf(GRAY +
//                            "║    - %-46s ║%n"
//                    );
//        }
//


//        System.out.println(CYAN +
//                "╟────────────────────────────────────────────────────╢"
//                + RESET);
//        // Burrito
//        System.out.printf(WHITE +
//                        "║ 🌯 %-21s %-6d $%-9.2f $%-9.2f ║%n",
//                "Taco (Carne Asada)", 2, 3.99, 7.98);
//
//        System.out.printf(GRAY +
//                        "║    - %-46s ║%n",
//                "Cheese, Lettuce, Salsa");
//
//        System.out.println(CYAN +
//                "╟────────────────────────────────────────────────────╢"
//                + RESET);
//
//        // Drink
//        System.out.printf(WHITE +
//                        "║ 🥤 %-21s %-6d $%-9.2f $%-9.2f ║%n",
//                "Drink (24oz)", 1, 2.50, 2.50);
//
//        System.out.printf(GRAY +
//                        "║    - %-46s ║%n",
//                "Ice Cold Coke");
//
//        System.out.println(CYAN +
//                "╟────────────────────────────────────────────────────╢"
//                + RESET);
//
//        // chips and salsa
//        System.out.printf(WHITE +
//                        "║ \uD83E\uDED3\uD83C\uDF36\uFE0F %-21s %-6d $%-9.2f $%-9.2f ║%n",
//                "Chips (Salsa: roja)", 2, 3.99, 7.98);
//
//        System.out.printf(GRAY +
//                        "║    - %-46s ║%n",
//                "jalapenos, tomatoe, Onion");
//
//        System.out.println(CYAN +
//                "╟────────────────────────────────────────────────────╢"
//                + RESET);

    public static void printBanner(){
        printTop();

        System.out.println(CYAN + BOLD +
                "║" + YELLOW + "              T A C O H O L I C S          " + CYAN + "         ║");
        System.out.println(CYAN +
                "║" + GRAY +   "           Personalized Tacos. Great Price.    " + CYAN + "     ║");

        printMiddle();
    }

    public static void printHeader(){


        System.out.printf(CYAN + BOLD +
                        "║ %-24s %-6s %-10s %-11s ║%n",
                "ITEM", "QTY", "PRICE", "TOTAL" + RESET);

        System.out.println(CYAN +
                "╟────────────────────────────────────────────────────╢"
                + RESET);

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

        System.out.printf(CYAN + BOLD + "║ " + SILVER + "[" + YELLOW + "2" + SILVER + "] " + WHITE + "%-47s" + CYAN + "║%n" + RESET, " Add Burrito");

        System.out.printf(CYAN + BOLD + "║ " + SILVER + "[" + YELLOW + "3" + SILVER + "] " + WHITE + "%-47s" + CYAN + "║%n" + RESET, " Add Drink");

        System.out.printf(CYAN + BOLD + "║ " + SILVER + "[" + YELLOW + "4" + SILVER + "] " + WHITE + "%-47s" + CYAN + "║%n" + RESET, " Add Chips & Salsa");

        System.out.printf(CYAN + BOLD + "║ " + SILVER + "[" + YELLOW + "5" + SILVER + "] " + WHITE + "%-47s" + CYAN + "║%n" + RESET, " Add-Ons");

        printMiddle();

        System.out.printf(CYAN + BOLD + "║ " + GRAY + "%-51s" + CYAN + "║%n" + RESET, "  ACTIONS");

        System.out.println(CYAN + BOLD + "║" + GRAY + BOLD + "  ──────────────────────────────────────            " + CYAN + BOLD + "║"+ RESET);

        System.out.printf(CYAN + BOLD + "║ " + SILVER + "[" + GREEN + "6" + SILVER + "] " + WHITE + "%-47s" + CYAN + "║%n" + RESET, " Checkout");

        System.out.printf(CYAN + BOLD + "║ " + SILVER + "[" + RED + "0" + SILVER + "] " + WHITE + "%-47s" + CYAN + "║%n" + RESET, " Cancel Order");

        printBottom();
    }

    public static void printInvalid(){
        System.out.printf(CYAN + BOLD + "║ " + RED + "✖ "  + "%-44s" + CYAN + " ║%n" + RESET,"Invalid Input");
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

    public static void printTotal(){
                System.out.printf(GREEN + BOLD +
                        "║ %-35s $%-12.2f ║%n",
                "SUBTOTAL:", 13.73);

        System.out.printf(GREEN + BOLD +
                        "║ %-35s $%-12.2f ║%n",
                "TAX (8.00%):", 1.10);

        System.out.println(CYAN +
                "╟────────────────────────────────────────────────────╢"
                + RESET);

        System.out.printf(MAGENTA + BOLD +
                        "║ %-35s $%-12.2f ║%n",
                "TOTAL:", 14.83);

        System.out.println(CYAN + BOLD +
                "╚════════════════════════════════════════════════════╝"
                + RESET);

        System.out.println();

        //Footer
        System.out.println(MAGENTA + BOLD +
                "        Thank you! Come again!" + RESET);
    }

}
