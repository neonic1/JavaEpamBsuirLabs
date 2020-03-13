package com.bsuir.lab4.application;

import java.util.List;
import java.util.ArrayList;
import com.bsuir.lab4.animal.Animal;
import com.bsuir.lab4.feeder.Feeder;
import java.util.concurrent.Semaphore;

public class Model {
    private List<Animal> animalQueue = new ArrayList<>();
    private List<Thread> threadQueue = new ArrayList<>();
    private int animalCounter;
    private Feeder feeder;
    private Semaphore sem = new Semaphore(3, true);

    public Model(View view) {
        animalCounter = 0;
        feeder = new Feeder(animalQueue, threadQueue, view, sem);
    }

    public void clearThreadQueue() { threadQueue.clear(); }
    public void addNewAnimal(String animalName) {
        Animal animal = new Animal(animalName, feeder, sem);
        animalQueue.add(animal);
        threadQueue.add(new Thread(animal, "Animal #" + animalCounter));
        animalCounter++;
    }
    public int getAnimalsInQueueCounter() { return animalQueue.size(); }
    public void startFeeder() { feeder.startQueue(); }
}
