package com.bsuir.lab4.application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import com.bsuir.lab4.application.language.Russian;

public class Controller {
    private static boolean wasStarted;
    private View view = new View();
    private Model model = new Model(view);
    private Pane pane = new Pane();
    private Russian language = new Russian();

    private EventHandler<ActionEvent> addNewAnimalsButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(wasStarted) {
                if(model.getAnimalsInQueueCounter() == 0) {
                    wasStarted = false;
                    model.clearThreadQueue();
                } else {
                    view.setWarningMessageEndingWaiting();
                }
            }
            if(!wasStarted) {
                view.setAddNewAnimalsPane(pane);
                view.setNewAnimalsInQueue(model.getAnimalsInQueueCounter());
            }
        }
    };
    private EventHandler<ActionEvent> runToFeederButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(model.getAnimalsInQueueCounter() > 0) {
                if(!wasStarted) {
                    wasStarted = true;
                    model.startFeeder();
                }
            } else {
                view.setWarningMessageEmptyQueue();
            }
        }
    };
    private EventHandler<ActionEvent> elephantButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.addNewAnimal(language.elephantString);
            view.increaseNewAnimalsInQueue();
        }
    };
    private EventHandler<ActionEvent> monkeyButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.addNewAnimal(language.monkeyString);
            view.increaseNewAnimalsInQueue();
        }
    };
    private EventHandler<ActionEvent> jaguarButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.addNewAnimal(language.jaguarString);
            view.increaseNewAnimalsInQueue();
        }
    };
    private EventHandler<ActionEvent> parrotButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.addNewAnimal(language.parrotString);
            view.increaseNewAnimalsInQueue();
        }
    };
    private EventHandler<ActionEvent> dogButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.addNewAnimal(language.dogString);
            view.increaseNewAnimalsInQueue();
        }
    };
    private EventHandler<ActionEvent> snakeButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.addNewAnimal(language.snakeString);
            view.increaseNewAnimalsInQueue();
        }
    };
    private EventHandler<ActionEvent> lizardButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.addNewAnimal(language.lizardString);
            view.increaseNewAnimalsInQueue();
        }
    };
    private EventHandler<ActionEvent> unicornButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.addNewAnimal(language.unicornString);
            view.increaseNewAnimalsInQueue();
        }
    };
    private EventHandler<ActionEvent> whaleButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.addNewAnimal(language.whaleString);
            view.increaseNewAnimalsInQueue();
        }
    };
    private EventHandler<ActionEvent> backButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setMainPane(pane);
            view.setAnimalsInQueueLeft(model.getAnimalsInQueueCounter());
        }
    };

    public Controller() {
        view.setAddNewAnimalsButtonHandler(addNewAnimalsButtonActionEvent);
        view.setRunToFeederButtonHandler(runToFeederButtonActionEvent);
        view.setElephantButtonHandler(elephantButtonActionEvent);
        view.setMonkeyButtonHandler(monkeyButtonActionEvent);
        view.setJaguarButtonHandler(jaguarButtonActionEvent);
        view.setParrotButtonHandler(parrotButtonActionEvent);
        view.setDogButtonHandler(dogButtonActionEvent);
        view.setSnakeButtonHandler(snakeButtonActionEvent);
        view.setLizardButtonHandler(lizardButtonActionEvent);
        view.setUnicornButtonHandler(unicornButtonActionEvent);
        view.setWhaleButtonHandler(whaleButtonActionEvent);
        view.setBackButtonHandler(backButtonActionEvent);

        view.setMainPane(pane);
        view.setAnimalsInQueueLeft(model.getAnimalsInQueueCounter());
        wasStarted = false;
    }

    public Pane getPane() { return pane; }
}
