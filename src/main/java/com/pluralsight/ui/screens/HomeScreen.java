package com.pluralsight.ui.screens;

import com.pluralsight.Main;
import com.pluralsight.ui.Screen;
import com.pluralsight.util.AnsiCode;

public class HomeScreen implements Screen {

    @Override
    public void display(){
        boolean running = true;

        while (running) {
            AnsiCode.printBanner();
            AnsiCode.printHomeMenu();
            AnsiCode.printSelection();

            int choice = Main.scanner.nextInt();

            switch(choice){
                case 1 -> new OrderScreen().display();
                case 0 -> running = false;
                default -> AnsiCode.printInvalid();
            }

        }
    }


}

