package com.bsuir.lab4.animal;

import com.bsuir.lab4.feeder.Feeder;
import java.util.concurrent.Semaphore;

public class Animal implements Runnable {
    private Feeder feeder;
    private Semaphore semaphore;
    private String animalName;
    private int timeOnEating;

    public Animal(String animalName, Feeder feeder, Semaphore semaphore) {
        this.animalName = animalName;
        timeOnEating = 5 + (int)(Math.random() * 15);
        this.feeder = feeder;
        this.semaphore = semaphore;
    }

    public String getAnimalName() { return animalName; }

    public void run() {
        try {
            semaphore.acquire();
            feeder.setNewAnimalToFeeder(animalName, timeOnEating);
        }
        catch(InterruptedException e) { System.out.println(e.getMessage()); }
    }
}
