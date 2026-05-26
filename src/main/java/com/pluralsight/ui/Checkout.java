package com.pluralsight.ui;

import com.pluralsight.model.Taco;

import java.util.ArrayList;

public class Checkout implements Screen{
    @Override
    public void display(){
        System.out.println("CHECK OUT");
        ArrayList<Taco> checkoutTaco = new ArrayList<>();
        checkoutTaco.add(new AddTaco().buildTaco());

        for(Taco t: checkoutTaco){
            t.description();
            System.out.println("price " + t.getPrice());
        }
    }

}
