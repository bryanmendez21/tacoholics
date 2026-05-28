package com.pluralsight;

import com.pluralsight.ui.screens.HomeScreen;

import java.util.Scanner;

public class Main {
    public static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new HomeScreen().display();
        scanner.close();
    }
}
