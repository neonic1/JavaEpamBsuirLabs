package com.bsuir.lab1.application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import com.bsuir.lab1.application.language.Russian;

public class View {
    private Russian language = new Russian();

    private Label widthLabel = new Label(language.widthString);
    private Label heightLabel = new Label(language.heightString);
    private Label lengthLabel = new Label(language.lengthString);
    private Label areaLabel = new Label();
    private Label perimeterLabel = new Label();
    private TextField widthTextField = new TextField();
    private TextField heightTextField = new TextField();
    private TextField lengthTextField = new TextField();
    private Button areaCalculationButton = new Button(language.areaCalculationString);
    private Button perimeterCalculationButton = new Button(language.perimeterCalculationString);
    private Label warningMessageEmptyFieldLabel = new Label();
    private Label warningMessageWrongInputLabel = new Label();

    private final static int inputLabelsLayoutX = 20;
    private final static int widthLayoutY = 25;
    private final static int heightLayoutY = 50;
    private final static int lengthLayoutY = 75;
    private final static int inputTextFieldsLayoutX = 75;
    private final static int inputTextFieldsSetPrefColumnCount = 25;
    private final static int resultLayoutY = 115;
    private final static int areaLabelLayoutX = 100;
    private final static int perimeterLabelLayoutX = 300;
    private final static int areaCalculationButtonLayoutX = 20;
    private final static int perimeterCalculationButtonLayoutX = 210;
    private final static int warningMessageEmptyFieldLayoutX = 130;
    private final static int warningMessageEmptyFieldLayoutY = 160;
    private final static int warningMessageWrongInputLayoutX = 128;
    private final static int warningMessageWrongInputLayoutY = 180;

    public View(){
        widthLabel.setLayoutX(inputLabelsLayoutX);
        widthLabel.setLayoutY(widthLayoutY);
        heightLabel.setLayoutX(inputLabelsLayoutX);
        heightLabel.setLayoutY(heightLayoutY);
        lengthLabel.setLayoutX(inputLabelsLayoutX);
        lengthLabel.setLayoutY(lengthLayoutY);
        widthTextField.setLayoutX(inputTextFieldsLayoutX);
        widthTextField.setLayoutY(widthLayoutY);
        widthTextField.setPrefColumnCount(inputTextFieldsSetPrefColumnCount);
        heightTextField.setLayoutX(inputTextFieldsLayoutX);
        heightTextField.setLayoutY(heightLayoutY);
        heightTextField.setPrefColumnCount(inputTextFieldsSetPrefColumnCount);
        lengthTextField.setLayoutX(inputTextFieldsLayoutX);
        lengthTextField.setLayoutY(lengthLayoutY);
        lengthTextField.setPrefColumnCount(inputTextFieldsSetPrefColumnCount);
        areaLabel.setLayoutX(areaLabelLayoutX);
        areaLabel.setLayoutY(resultLayoutY);
        perimeterLabel.setLayoutX(perimeterLabelLayoutX);
        perimeterLabel.setLayoutY(resultLayoutY);
        areaCalculationButton.setLayoutX(areaCalculationButtonLayoutX);
        areaCalculationButton.setLayoutY(resultLayoutY);
        perimeterCalculationButton.setLayoutX(perimeterCalculationButtonLayoutX);
        perimeterCalculationButton.setLayoutY(resultLayoutY);
        warningMessageEmptyFieldLabel.setLayoutX(warningMessageEmptyFieldLayoutX);
        warningMessageEmptyFieldLabel.setLayoutY(warningMessageEmptyFieldLayoutY);
        warningMessageEmptyFieldLabel.setStyle(language.warningMessageLabelColor);
        warningMessageWrongInputLabel.setLayoutX(warningMessageWrongInputLayoutX);
        warningMessageWrongInputLabel.setLayoutY(warningMessageWrongInputLayoutY);
        warningMessageWrongInputLabel.setStyle(language.warningMessageLabelColor);
    }

    public void setAreaCalculationButtonHandler(EventHandler<ActionEvent> handler){
        areaCalculationButton.setOnAction(handler);
    }
    public void setPerimeterCalculationButtonHandler(EventHandler<ActionEvent> handler){
        perimeterCalculationButton.setOnAction(handler);
    }

    public void setArea(int area) { areaLabel.setText(Integer.toString(area)); }
    public void setPerimeter(int perimeter) { perimeterLabel.setText(Integer.toString(perimeter)); }
    public void setWarningMessageEmptyField() {
        areaLabel.setText(null);
        perimeterLabel.setText(null);
        warningMessageEmptyFieldLabel.setText(language.warningMessageEmptyFieldString);
    }
    public void setWarningMessageWrongInput() {
        areaLabel.setText(null);
        perimeterLabel.setText(null);
        warningMessageWrongInputLabel.setText(language.warningMessageWrongInputString);
    }
    public void unsetWarningMessages() {
        warningMessageEmptyFieldLabel.setText(null);
        warningMessageWrongInputLabel.setText(null);
    }

    public String getWidth() { return widthTextField.getText(); }
    public String getHeight() { return heightTextField.getText(); }
    public String getLength() { return lengthTextField.getText(); }

    public void setPane(Pane pane){
        pane.getChildren().addAll(
                widthLabel, widthTextField,
                heightLabel, heightTextField,
                lengthLabel, lengthTextField,
                areaCalculationButton, areaLabel,
                perimeterCalculationButton, perimeterLabel,
                warningMessageEmptyFieldLabel, warningMessageWrongInputLabel
        );
    }
}
