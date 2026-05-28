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
