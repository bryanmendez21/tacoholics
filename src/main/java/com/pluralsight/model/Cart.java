package com.pluralsight.model;

import java.util.ArrayList;

public class Cart {

    ArrayList<Taco> itemTaco = new ArrayList<>();

        public void addTaco(Taco taco){
            itemTaco.add(taco);
        }

        public ArrayList<Taco> getItems(){
            return itemTaco;
        }

        public double getTotal(){
            double total = 0;

            for(Taco t: itemTaco){
                total += t.getPrice();
            }
            return total;
        }

}
