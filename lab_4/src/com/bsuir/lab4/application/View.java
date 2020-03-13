package com.bsuir.lab4.application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import com.bsuir.lab4.application.language.Russian;

public class View {
    private Russian language = new Russian();

    //main scene
    private Button addNewAnimalsButton = new Button(language.addNewAnimalsString);
    private Button runToFeederButton = new Button(language.runToFeederString);
    private Label firstFeederPlaceLabel = new Label(language.firstFeederPlaceString);
    private Label secondFeederPlaceLabel = new Label(language.secondFeederPlaceString);
    private Label thirdFeederPlaceLabel = new Label(language.thirdFeederPlaceString);
    private Label titleAnimalNameLabel = new Label(language.titleAnimalNameString);
    private Label firstAnimalNameLabel = new Label(language.emptyFieldString);
    private Label secondAnimalNameLabel = new Label(language.emptyFieldString);
    private Label thirdAnimalNameLabel = new Label(language.emptyFieldString);
    private Label titleTimeLeftLabel = new Label(language.titleAnimalTimeLeftString);
    private Label firstAnimalTimeLeftLabel = new Label(language.emptyFieldString);
    private Label secondAnimalTimeLeftLabel = new Label(language.emptyFieldString);
    private Label thirdAnimalTimeLeftLabel = new Label(language.emptyFieldString);
    private Label animalsInQueueLeftLabel = new Label(language.animalsInQueueLeftString);
    private Label animalsInQueueLeftCounterLabel = new Label();
    private Label allAnimalsFedLabel = new Label();
    private Label warningMessageEndingWaitingLabel = new Label();
    private Label warningMessageEmptyQueueLabel = new Label();

    private final static int mainSceneButtonsPrefWidth = 150;
    private final static int buttonsMainSceneLayoutY = 50;
    private final static int titleFeederPlacesLayoutY = 100;
    private final static int animalNameLayoutY = 130;
    private final static int animalTimeLeftLayoutY = 160;
    private final static int addNewAnimalButtonLayoutX = 100;
    private final static int runToFeederButtonLayoutX = 250;
    private final static int titlesLayoutX = 40;
    private final static int firstFeederPlaceLayoutX = 100;
    private final static int secondFeederPlaceLayoutX = 230;
    private final static int thirdFeederPlaceLayoutX = 348;
    private final static int animalsInQueueLeftLayoutY = 200;
    private final static int animalsInQueueLeftLabelLayoutX = 185;
    private final static int animalsInQueueLeftCounterLabelLayoutX = 310;
    private final static int allAnimalsFedLabelLayoutX = 165;
    private final static int warningMessageEndingWaitingLayoutX = 150;
    private final static int warningMessageEndingWaitingLayoutY = 225;
    private final static int warningMessageEmptyQueueLayoutX = 153;
    private final static int warningMessageEmptyQueueLayoutY = 225;

    //add new animals in queue scene
    private Label newAnimalsInQueueLabel = new Label(language.animalsInQueueLeftString);
    private Label newAnimalsInQueueCounterLabel = new Label();
    private Button elephantButton = new Button(language.elephantString);
    private Button monkeyButton = new Button(language.monkeyString);
    private Button jaguarButton = new Button(language.jaguarString);
    private Button parrotButton = new Button(language.parrotString);
    private Button dogButton = new Button(language.dogString);
    private Button snakeButton = new Button(language.snakeString);
    private Button lizardButton = new Button(language.lizardString);
    private Button unicornButton = new Button(language.unicornString);
    private Button whaleButton = new Button(language.whaleString);
    private Button backButton = new Button(language.backString);

    private final static int newAnimalsInQueueLeftLabelLayoutX = 175;
    private final static int newAnimalsInQueueLeftLabelLayoutY = 50;
    private final static int newAnimalsInQueueLeftCounterLabelLayoutX = 300;
    private final static int firstButtonsRowLayoutY = 90;
    private final static int secondButtonsRowLayoutY = 125;
    private final static int thirdButtonsRowLayoutY = 160;
    private final static int fourthButtonsRowLayoutY = 195;
    private final static int firstButtonsColumnLayoutX = 80;
    private final static int secondButtonsColumnLayoutX = 190;
    private final static int thirdButtonsColumnLayoutX = 300;
    private final static int buttonsAddScenePrefWidth = 100;

    public View() {
        addNewAnimalsButton.setLayoutX(addNewAnimalButtonLayoutX);
        addNewAnimalsButton.setLayoutY(buttonsMainSceneLayoutY);
        addNewAnimalsButton.setPrefWidth(mainSceneButtonsPrefWidth);
        runToFeederButton.setLayoutX(runToFeederButtonLayoutX);
        runToFeederButton.setLayoutY(buttonsMainSceneLayoutY);
        runToFeederButton.setPrefWidth(mainSceneButtonsPrefWidth);
        firstFeederPlaceLabel.setLayoutX(firstFeederPlaceLayoutX);
        firstFeederPlaceLabel.setLayoutY(titleFeederPlacesLayoutY);
        secondFeederPlaceLabel.setLayoutX(secondFeederPlaceLayoutX);
        secondFeederPlaceLabel.setLayoutY(titleFeederPlacesLayoutY);
        thirdFeederPlaceLabel.setLayoutX(thirdFeederPlaceLayoutX);
        thirdFeederPlaceLabel.setLayoutY(titleFeederPlacesLayoutY);
        titleAnimalNameLabel.setLayoutX(titlesLayoutX);
        titleAnimalNameLabel.setLayoutY(animalNameLayoutY);
        firstAnimalNameLabel.setLayoutX(firstFeederPlaceLayoutX);
        firstAnimalNameLabel.setLayoutY(animalNameLayoutY);
        secondAnimalNameLabel.setLayoutX(secondFeederPlaceLayoutX);
        secondAnimalNameLabel.setLayoutY(animalNameLayoutY);
        thirdAnimalNameLabel.setLayoutX(thirdFeederPlaceLayoutX);
        thirdAnimalNameLabel.setLayoutY(animalNameLayoutY);
        titleTimeLeftLabel.setLayoutX(titlesLayoutX);
        titleTimeLeftLabel.setLayoutY(animalTimeLeftLayoutY);
        firstAnimalTimeLeftLabel.setLayoutX(firstFeederPlaceLayoutX);
        firstAnimalTimeLeftLabel.setLayoutY(animalTimeLeftLayoutY);
        secondAnimalTimeLeftLabel.setLayoutX(secondFeederPlaceLayoutX);
        secondAnimalTimeLeftLabel.setLayoutY(animalTimeLeftLayoutY);
        thirdAnimalTimeLeftLabel.setLayoutX(thirdFeederPlaceLayoutX);
        thirdAnimalTimeLeftLabel.setLayoutY(animalTimeLeftLayoutY);
        animalsInQueueLeftLabel.setLayoutX(animalsInQueueLeftLabelLayoutX);
        animalsInQueueLeftLabel.setLayoutY(animalsInQueueLeftLayoutY);
        animalsInQueueLeftLabel.setStyle(language.animalsInQueueLeftColor);
        animalsInQueueLeftCounterLabel.setLayoutX(animalsInQueueLeftCounterLabelLayoutX);
        animalsInQueueLeftCounterLabel.setLayoutY(animalsInQueueLeftLayoutY);
        animalsInQueueLeftCounterLabel.setStyle(language.animalsInQueueLeftColor);
        allAnimalsFedLabel.setLayoutX(allAnimalsFedLabelLayoutX);
        allAnimalsFedLabel.setLayoutY(animalsInQueueLeftLayoutY);
        allAnimalsFedLabel.setStyle(language.allAnimalsFedLabelColor);
        warningMessageEndingWaitingLabel.setLayoutX(warningMessageEndingWaitingLayoutX);
        warningMessageEndingWaitingLabel.setLayoutY(warningMessageEndingWaitingLayoutY);
        warningMessageEndingWaitingLabel.setStyle(language.warningMessageLabelColor);
        warningMessageEmptyQueueLabel.setLayoutX(warningMessageEmptyQueueLayoutX);
        warningMessageEmptyQueueLabel.setLayoutY(warningMessageEmptyQueueLayoutY);
        warningMessageEmptyQueueLabel.setStyle(language.warningMessageLabelColor);

        newAnimalsInQueueLabel.setLayoutX(newAnimalsInQueueLeftLabelLayoutX);
        newAnimalsInQueueLabel.setLayoutY(newAnimalsInQueueLeftLabelLayoutY);
        newAnimalsInQueueLabel.setStyle(language.animalsInQueueLeftColor);
        newAnimalsInQueueCounterLabel.setLayoutX(newAnimalsInQueueLeftCounterLabelLayoutX);
        newAnimalsInQueueCounterLabel.setLayoutY(newAnimalsInQueueLeftLabelLayoutY);
        newAnimalsInQueueCounterLabel.setStyle(language.animalsInQueueLeftColor);
        elephantButton.setLayoutX(firstButtonsColumnLayoutX);
        elephantButton.setLayoutY(firstButtonsRowLayoutY);
        elephantButton.setPrefWidth(buttonsAddScenePrefWidth);
        monkeyButton.setLayoutX(firstButtonsColumnLayoutX);
        monkeyButton.setLayoutY(secondButtonsRowLayoutY);
        monkeyButton.setPrefWidth(buttonsAddScenePrefWidth);
        jaguarButton.setLayoutX(firstButtonsColumnLayoutX);
        jaguarButton.setLayoutY(thirdButtonsRowLayoutY);
        jaguarButton.setPrefWidth(buttonsAddScenePrefWidth);
        parrotButton.setLayoutX(secondButtonsColumnLayoutX);
        parrotButton.setLayoutY(firstButtonsRowLayoutY);
        parrotButton.setPrefWidth(buttonsAddScenePrefWidth);
        dogButton.setLayoutX(secondButtonsColumnLayoutX);
        dogButton.setLayoutY(secondButtonsRowLayoutY);
        dogButton.setPrefWidth(buttonsAddScenePrefWidth);
        snakeButton.setLayoutX(secondButtonsColumnLayoutX);
        snakeButton.setLayoutY(thirdButtonsRowLayoutY);
        snakeButton.setPrefWidth(buttonsAddScenePrefWidth);
        lizardButton.setLayoutX(thirdButtonsColumnLayoutX);
        lizardButton.setLayoutY(firstButtonsRowLayoutY);
        lizardButton.setPrefWidth(buttonsAddScenePrefWidth);
        unicornButton.setLayoutX(thirdButtonsColumnLayoutX);
        unicornButton.setLayoutY(secondButtonsRowLayoutY);
        unicornButton.setPrefWidth(buttonsAddScenePrefWidth);
        whaleButton.setLayoutX(thirdButtonsColumnLayoutX);
        whaleButton.setLayoutY(thirdButtonsRowLayoutY);
        whaleButton.setPrefWidth(buttonsAddScenePrefWidth);
        backButton.setLayoutX(secondButtonsColumnLayoutX);
        backButton.setLayoutY(fourthButtonsRowLayoutY);
        backButton.setPrefWidth(buttonsAddScenePrefWidth);
    }

    public void setAddNewAnimalsButtonHandler(EventHandler<ActionEvent> handler) {
        addNewAnimalsButton.setOnAction(handler);
    }
    public void setRunToFeederButtonHandler(EventHandler<ActionEvent> handler) {
        runToFeederButton.setOnAction(handler);
    }
    public void setElephantButtonHandler(EventHandler<ActionEvent> handler) {
        elephantButton.setOnAction(handler);
    }
    public void setMonkeyButtonHandler(EventHandler<ActionEvent> handler) {
        monkeyButton.setOnAction(handler);
    }
    public void setJaguarButtonHandler(EventHandler<ActionEvent> handler) {
        jaguarButton.setOnAction(handler);
    }
    public void setParrotButtonHandler(EventHandler<ActionEvent> handler) {
        parrotButton.setOnAction(handler);
    }
    public void setDogButtonHandler(EventHandler<ActionEvent> handler) {
        dogButton.setOnAction(handler);
    }
    public void setSnakeButtonHandler(EventHandler<ActionEvent> handler) {
        snakeButton.setOnAction(handler);
    }
    public void setLizardButtonHandler(EventHandler<ActionEvent> handler) {
        lizardButton.setOnAction(handler);
    }
    public void setUnicornButtonHandler(EventHandler<ActionEvent> handler) {
        unicornButton.setOnAction(handler);
    }
    public void setWhaleButtonHandler(EventHandler<ActionEvent> handler) {
        whaleButton.setOnAction(handler);
    }
    public void setBackButtonHandler(EventHandler<ActionEvent> handler) {
        backButton.setOnAction(handler);
    }
    public void setAnimalName(String name, int feederPlace) {
        switch(feederPlace) {
            case 0: {
                firstAnimalNameLabel.setText(name);
                break;
            }
            case 1: {
                secondAnimalNameLabel.setText(name);
                break;
            }
            case 2: {
                thirdAnimalNameLabel.setText(name);
                break;
            }
        }
    }
    public void setLeftTime(int time, int feederPlace) {
        switch(feederPlace) {
            case 0: {
                firstAnimalTimeLeftLabel.setText(Integer.toString(time));
                break;
            }
            case 1: {
                secondAnimalTimeLeftLabel.setText(Integer.toString(time));
                break;
            }
            case 2: {
                thirdAnimalTimeLeftLabel.setText(Integer.toString(time));
                break;
            }
        }
    }
    public void clearAnimal(int feederPlace) {
        switch(feederPlace) {
            case 0: {
                firstAnimalNameLabel.setText(language.emptyFieldString);
                firstAnimalTimeLeftLabel.setText(language.emptyFieldString);
                break;
            }
            case 1: {
                secondAnimalNameLabel.setText(language.emptyFieldString);
                secondAnimalTimeLeftLabel.setText(language.emptyFieldString);
                break;
            }
            case 2: {
                thirdAnimalNameLabel.setText(language.emptyFieldString);
                thirdAnimalTimeLeftLabel.setText(language.emptyFieldString);
                break;
            }
        }
    }
    public void decreaseAnimalEatingTimeLeft(int feederPlace) {
        switch(feederPlace) {
            case 0: {
                firstAnimalTimeLeftLabel.setText(Integer.toString(Integer.parseInt(firstAnimalTimeLeftLabel.getText()) - 1));
                break;
            }
            case 1: {
                secondAnimalTimeLeftLabel.setText(Integer.toString(Integer.parseInt(secondAnimalTimeLeftLabel.getText()) - 1));
                break;
            }
            case 2: {
                thirdAnimalTimeLeftLabel.setText(Integer.toString(Integer.parseInt(thirdAnimalTimeLeftLabel.getText()) - 1));
                break;
            }
        }
    }
    public void setAnimalsInQueueLeft(int number) {
        animalsInQueueLeftCounterLabel.setText(Integer.toString(number));
    }
    public void setNewAnimalsInQueue(int number) {
        newAnimalsInQueueCounterLabel.setText(Integer.toString(number));
    }
    public void decreaseAnimalsInQueueLeft() {
        animalsInQueueLeftCounterLabel.setText(Integer.toString(Integer.parseInt(animalsInQueueLeftCounterLabel.getText()) - 1));
    }
    public void setAllAnimalsFedLabel() {
        animalsInQueueLeftLabel.setText(null);
        animalsInQueueLeftCounterLabel.setText(null);
        warningMessageEndingWaitingLabel.setText(null);
        allAnimalsFedLabel.setText(language.allAnimalsFedString);
    }
    public void setWarningMessageEndingWaiting() {
        warningMessageEndingWaitingLabel.setText(language.warningMessageEndingWaitingString);
    }
    public void setWarningMessageEmptyQueue() {
        warningMessageEmptyQueueLabel.setText(language.warningMessageEmptyQueueString);
    }
    public void increaseNewAnimalsInQueue() {
        newAnimalsInQueueCounterLabel.setText(Integer.toString(Integer.parseInt(newAnimalsInQueueCounterLabel.getText()) + 1));
    }
    public void setMainPane(Pane pane) {
        pane.getChildren().clear();
        pane.getChildren().addAll(
                addNewAnimalsButton, runToFeederButton,
                firstFeederPlaceLabel, secondFeederPlaceLabel, thirdFeederPlaceLabel,
                titleAnimalNameLabel, firstAnimalNameLabel, secondAnimalNameLabel, thirdAnimalNameLabel,
                titleTimeLeftLabel, firstAnimalTimeLeftLabel, secondAnimalTimeLeftLabel, thirdAnimalTimeLeftLabel,
                animalsInQueueLeftLabel, animalsInQueueLeftCounterLabel,
                allAnimalsFedLabel,
                warningMessageEndingWaitingLabel, warningMessageEmptyQueueLabel
        );
        animalsInQueueLeftLabel.setText(language.animalsInQueueLeftString);
        animalsInQueueLeftCounterLabel.setText("0");
        allAnimalsFedLabel.setText(null);
        warningMessageEndingWaitingLabel.setText(null);
        warningMessageEmptyQueueLabel.setText(null);
    }
    public void setAddNewAnimalsPane(Pane pane) {
        pane.getChildren().clear();
        pane.getChildren().addAll(
                newAnimalsInQueueLabel, newAnimalsInQueueCounterLabel,
                elephantButton, parrotButton, lizardButton,
                monkeyButton, dogButton, unicornButton,
                jaguarButton, snakeButton, whaleButton,
                backButton
        );
        newAnimalsInQueueCounterLabel.setText("0");
    }
}
