package com.example;

import java.util.List;
import java.util.Random;

public class Cavallo extends Thread {
    private String nome;
    private int metriPercorsi = 0;
    private int traguardo = 100;
    private boolean finito = false;
    private List<String> ordineArrivo; 

    public Cavallo(String nome, List<String>ordineArrivo) {
        this.nome = nome;
        this.ordineArrivo = ordineArrivo;
    }

    public void run() {
        Random random = new Random();

        while (!finito) {
            int passo = random.nextInt(10) + 1;
            metriPercorsi += passo;

            System.out.println(nome + " ha percorso " + metriPercorsi + " metri.");

            if (metriPercorsi >= traguardo) {
                ordineArrivo.add(nome); 
                System.out.println(nome + " ha finito");
                finito = true;
                break;
            }
            try {
                int tempoSleep = random.nextInt(400) + 400;
                Thread.sleep(tempoSleep);
            } catch (InterruptedException e) {
                System.out.println("Il thread è stato interrotto");
            }
        }

    }
}
