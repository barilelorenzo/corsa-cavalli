package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
       
       ArrayList<Cavallo> Cavalli = new ArrayList<>();
        Cavalli.add(new Cavallo("Fulmine", null));
          Cavalli.add(new Cavallo("Freccia", null));
         Cavalli.add(new Cavallo("Pasticcino", null));
          Cavalli.add(new Cavallo("Buzzino", null));
          Cavalli.add(new Cavallo("Il67", null));

        for (Cavallo cavallo : Cavalli) {
            cavallo.start();  
        }


        for (Cavallo cavallo : Cavalli) {
            cavallo.join();  
        }

    }
}