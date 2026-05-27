package com.pluralsight.model;

import java.util.ArrayList;

public class Cart {

    private int limeCount;
    private int cremaCount;

    ArrayList<Taco> itemTaco = new ArrayList<>();
    ArrayList<Drink> itemDrink = new ArrayList<>();
    ArrayList<Burrito> itemBurrito = new ArrayList<>();
    ArrayList<ChipsAndSalsa> itemChipSalsa = new ArrayList<>();

        public void addTaco(Taco taco){
            itemTaco.add(taco);
        }

        public void addBurrito(Burrito burrito){
            itemBurrito.add(burrito);
        }

        public void addDrink(Drink drink){
            itemDrink.add(drink);
        }

        public void addChipSalsa(ChipsAndSalsa chipSalsa){
            itemChipSalsa.add(chipSalsa);
        }

        public void addLimes(int count){
            limeCount += count;
        }

        public void addCrema(int count){
            limeCount += count;
        }

        public ArrayList<Taco> getTacos(){
            return itemTaco;
        }

        public ArrayList<Burrito> getBurrito(){
            return itemBurrito;
        }

        public ArrayList<Drink> getDrinks(){
            return itemDrink;
        }

        public ArrayList<ChipsAndSalsa> getChipSalsa(){
            return itemChipSalsa;
        }

        public int getLimeCount(){
            return limeCount;
        }

        public  int getCremaCount(){
            return cremaCount;
        }

        public double getTotal(){
            double total = 0;

            for(Taco t: itemTaco){
                total += t.getPrice();
            }
            for(Drink d: itemDrink){
                total += d.getPrice();
            }
            for(Burrito b: itemBurrito){
                total += b.getPrice();
            }
            for(ChipsAndSalsa cs: itemChipSalsa){
                total += cs.getPrice();
            }

            return total;
        }

}
