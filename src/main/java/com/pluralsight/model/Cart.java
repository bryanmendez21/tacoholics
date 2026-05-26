package com.pluralsight.model;

import java.util.ArrayList;

public class Cart {

    ArrayList<Taco> itemTaco = new ArrayList<>();
    ArrayList<Drink> itemDrink = new ArrayList<>();

        public void addTaco(Taco taco){
            itemTaco.add(taco);
        }

        public void addDrink(Drink drink){
            itemDrink.add(drink);
        }

        public ArrayList<Taco> getTacos(){
            return itemTaco;
        }

        public ArrayList<Drink> getDrinks(){
            return itemDrink;
        }

        public double getTotal(){
            double total = 0;

            for(Taco t: itemTaco){
                total += t.getPrice();
            }
            for(Drink d: itemDrink){
                total += d.getPrice();
            }
            return total;
        }

}
