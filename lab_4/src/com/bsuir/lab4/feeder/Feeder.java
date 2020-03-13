package com.bsuir.lab4.feeder;

import java.util.List;
import javafx.animation.KeyFrame;
import javafx.util.Duration;
import com.bsuir.lab4.animal.Animal;
import com.bsuir.lab4.application.View;
import javafx.application.Platform;
import javafx.animation.Timeline;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class Feeder {
    private List<Animal> animalQueue;
    private List<Thread> threadQueue;
    private View view;
    private boolean[] freeFeederPlaces = new boolean[3];
    private Semaphore semaphore;
    private ReentrantLock locker = new ReentrantLock();

    public Feeder(List<Animal> animalQueue, List<Thread> threadQueue, View view, Semaphore semaphore) {
        this.animalQueue = animalQueue;
        this.threadQueue = threadQueue;
        this.view = view;
        this.semaphore = semaphore;
        for(int i = 0; i < freeFeederPlaces.length; i++) { freeFeederPlaces[i] = true; }
    }

    public void startQueue() {
        for(int i = 0; i < threadQueue.size(); i++) {
            threadQueue.get(i).start();
        }
    }
    public void setNewAnimalToFeeder(String animalName, int timeOnEating) {
        locker.lock();

        for (int i = 0; i < freeFeederPlaces.length; i++) {
            if(freeFeederPlaces[i]) {
                freeFeederPlaces[i] = false;
                locker.unlock();
                final int finI = i;
                final int finTimeOnEating = timeOnEating;
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        view.setAnimalName(animalName, finI);
                        view.setLeftTime(finTimeOnEating, finI);
                        view.decreaseAnimalsInQueueLeft();

                        Timeline timeline = new Timeline(
                                new KeyFrame(
                                        Duration.millis(1000),
                                        event -> {
                                            view.decreaseAnimalEatingTimeLeft(finI);
                                        })
                        );
                        timeline.setCycleCount(finTimeOnEating);
                        timeline.play();

                        timeline.setOnFinished(event -> {
                            view.clearAnimal(finI);
                            synchronized (animalQueue) {
                                for(int j = 0; j < animalQueue.size(); j++) {
                                    if(animalQueue.get(j).getAnimalName().equals(animalName)) {
                                        animalQueue.remove(j);
                                        break;
                                    }
                                }
                            }
                            if(animalQueue.size() == 0) {
                                view.setAllAnimalsFedLabel();
                            }
                            freeFeederPlaces[finI] = true;
                            semaphore.release();
                        });
                    }
                });
                break;
            }
        }
    }
}
