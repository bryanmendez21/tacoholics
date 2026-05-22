package com.pluralsight.ui;

import com.pluralsight.Main;

import java.util.Scanner;

public class HomeScreen implements Screen{

    @Override
    public void display(){
        boolean running = true;

        while (running) {
            System.out.println("== Welcome to Tacoholics ==");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.print("Enter a Value: ");

            int choice = Main.scanner.nextInt();

            switch(choice){
                case 1 -> new OrderScreen().display();
                case 0 -> running = false;
                default -> System.out.println("Invalid Input");
            }
        }
    }


}

