package com.pluralsight.util;

public class AnsiCode {
    // ANSI COLORS
    public static final String RESET = "\u001B[0m";

    public static final String CYAN = "\u001B[96m";
    public static final String GREEN = "\u001B[92m";
    public static final String MAGENTA = "\u001B[95m";
    public static final String WHITE = "\u001B[97m";
    public static final String GRAY = "\u001B[37m";

    public static final String BOLD = "\u001B[1m";

    public static void main(String[] args) {
        System.out.println(CYAN + BOLD +
                "╔════════════════════════════════════════════════════╗");
        System.out.println(
                "║                   🌮  TACOHOLICS  🌮               ║");
        System.out.println(
                "║           Personalized Tacos. Great Price.         ║");
        System.out.println(
                "╠════════════════════════════════════════════════════╣"
        + RESET);

        // Headers
        System.out.printf(CYAN + BOLD +
                "║ %-24s %-6s %-10s %-11s ║%n",
                "ITEM", "QTY", "PRICE", "TOTAL" + RESET);

        System.out.println(CYAN +
                "╟────────────────────────────────────────────────────╢"
                + RESET);

        // Taco
        System.out.printf(CYAN + "║"  + RESET + WHITE +
                        " 🌮 %-21s %-6d $%-9.2f $%-9.2f ║%n",
                "Taco (Carne Asada)", 2, 3.99, 7.98);

        System.out.printf(GRAY +
                        "║    - %-46s ║%n",
                "Cheese, Lettuce, Salsa");

        System.out.println(CYAN +
                "╟────────────────────────────────────────────────────╢"
                + RESET);
        // Burrito
        System.out.printf(WHITE +
                        "║ 🌯 %-21s %-6d $%-9.2f $%-9.2f ║%n",
                "Taco (Carne Asada)", 2, 3.99, 7.98);

        System.out.printf(GRAY +
                        "║    - %-46s ║%n",
                "Cheese, Lettuce, Salsa");

        System.out.println(CYAN +
                "╟────────────────────────────────────────────────────╢"
                + RESET);

        // Drink
        System.out.printf(WHITE +
                        "║ 🥤 %-21s %-6d $%-9.2f $%-9.2f ║%n",
                "Drink (24oz)", 1, 2.50, 2.50);

        System.out.printf(GRAY +
                        "║    - %-46s ║%n",
                "Ice Cold Coke");

        System.out.println(CYAN +
                "╟────────────────────────────────────────────────────╢"
                + RESET);

        // chips and salsa
        System.out.printf(WHITE +
                        "║ \uD83E\uDED3\uD83C\uDF36\uFE0F %-21s %-6d $%-9.2f $%-9.2f ║%n",
                "Chips (Salsa: roja)", 2, 3.99, 7.98);

        System.out.printf(GRAY +
                        "║    - %-46s ║%n",
                "jalapenos, tomatoe, Onion");

        System.out.println(CYAN +
                "╟────────────────────────────────────────────────────╢"
                + RESET);

        //Total
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
