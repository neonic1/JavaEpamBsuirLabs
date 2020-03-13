package com.bsuir.lab2.application;

import com.bsuir.lab2.object.Food;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import java.util.Scanner;
import com.bsuir.lab2.application.language.Russian;

public class View {
    private Russian language = new Russian();

    //main scene
    private final static int titleLayoutY = 20;
    private final static int programmerColumnLayoutX = 30;
    private final static int cookColumnLayoutX = 240;
    private final static int nameLevelLayoutY = 48;
    private final static int programmerNameLayoutX = 60;
    private final static int cookNameLayoutX = 270;
    private final static int firstLevelButtonLayoutY = 80;
    private final static int secondLevelButtonLayoutY = 110;
    private final static int thirdLevelButtonLayoutY = 140;
    private final static int mainSceneButtonsWidth = 120;

    private Label programmerBasicNameLabel = new Label(language.programmerBasicNameString);
    private Label cookBasicNameLabel = new Label(language.cookBasicNameString);
    private Label nameBasicFirstLabel = new Label(language.nameBasicString);
    private Label nameBasicSecondLabel = new Label(language.nameBasicString);
    private Label programmerNameLabel = new Label();
    private Label cookNameLabel = new Label();
    private Button programmerChangeNameButton = new Button(language.changeNameString);
    private Button cookChangeNameButton = new Button(language.changeNameString);
    private Button programmerEatButton = new Button(language.eatString);
    private Button cookEatButton = new Button(language.eatString);
    private Button programmerWriteCodeButton = new Button(language.writeCodeString);
    private Button cookMakeFoodButton = new Button(language.makeFoodString);

    //change name scene
    private Label newNameLabel = new Label(language.newNameString);
    private Button backToMainSceneButton = new Button(language.backString);
    private Label warningLabelNameScene = new Label();
    //programmer
    private TextField newProgrammerNameTextField = new TextField();
    private Button saveNewProgrammerNameButton = new Button(language.saveString);
    //cook
    private TextField newCookNameTextField = new TextField();
    private Button saveNewCookNameButton = new Button(language.saveString);

    private final static int warningLabelNameSceneLayoutX = 140;
    private final static int warningLabelNameSceneLayoutY = 165;
    private final static int newNameLayoutX = 100;
    private final static int newNameLayoutY = 90;
    private final static int newNameTextFieldLayoutX = 170;
    private final static int backButtonChangeNameLayoutX = 100;
    private final static int buttonsChangeNameLayoutY = 130;
    private final static int saveButtonChangeNameLayoutX = 298;
    private final static int newNameTextFieldWidth = 200;

    //eat scene
    private Label selectDishLabel = new Label(language.selectDishString);
    private Label warningLabelNoDishSelected = new Label();
    private Button backToMainSceneFormEatButton = new Button(language.backString);
    private ComboBox<Food> selectDishComboBox = new ComboBox<>();
    //programmer
    private Button programmerEatFoodButton = new Button(language.eatButtonString);
    //cook
    private Button cookEatFoodButton = new Button(language.eatButtonString);

    private final static int selectDishLabelLayoutX = 100;
    private final static int selectDishLabelLayoutY = 90;
    private final static int selectDishComboBoxLayoutX = 205;
    private final static int selectDishComboBoxWidth = 150;
    private final static int backButtonEatSceneLayoutX = 100;
    private final static int buttonsEatSceneLayoutY = 130;
    private final static int eatFoodButtonLayoutX = 304;
    private final static int warningLabelNoDishSelectedLayoutX = 175;
    private final static int warningLabelNoDishSelectedLayoutY = 135;

    //programmer write code scene
    private TextArea writeCodeArea = new TextArea();
    private Button writeCodeToTextAreaButton = new Button(language.writeCodeString);
    private Button backToMainSceneFormWritingCodeButton = new Button(language.backString);

    private final static int writeCodeAreaLayoutX = 20;
    private final static int writeCodeAreaLayoutY = 20;
    private final static int writeCodeAreaHeight = 180;
    private final static int writeCodeAreaWidth = 440;
    private final static int backButtonWriteCodeLayoutX = 140;
    private final static int writeCodeToTextAreaLayoutX = 260;
    private final static int buttonsLayoutY = 215;

    //cook make dish scene
    private Label dishNameLabel = new Label(language.dishNameString);
    private Label portionNumberLabel = new Label(language.portionNumberString);
    private Label flavourLabel = new Label(language.flavourString);
    private TextField dishNameTextField = new TextField();
    private TextField portionNumberTextField = new TextField();
    private TextField flavourTextField = new TextField();
    private Button backToMainSceneFormCookingButton = new Button(language.backString);
    private Button makeDishButton = new Button(language.makeDishString);
    private Label warningLabelCookScene = new Label();
    private Label warningLabelWrongInput = new Label();

    private final static int cookSceneLabelsLayoutX = 55;
    private final static int cookSceneTextFieldsLayoutX = 175;
    private final static int dishNameLabelLayoutY = 60;
    private final static int portionNumberLabelLayoutY = 95;
    private final static int flavourLabelLayoutY = 125;
    private final static int buttonsCookSceneLayoutY = 160;
    private final static int cookButtonLayoutX = 326;
    private final static int cookingSceneTextFieldsColumnCount = 20;
    private final static int warningLabelCookSceneLayoutX = 160;
    private final static int warningLabelCookSceneLayoutY = 165;
    private final static int warningLabelWrongInputLayoutX = 160;
    private final static int warningLabelWrongInputLayoutY = 190;

    public View() {
        programmerBasicNameLabel.setLayoutX(programmerColumnLayoutX);
        programmerBasicNameLabel.setLayoutY(titleLayoutY);
        cookBasicNameLabel.setLayoutX(cookColumnLayoutX);
        cookBasicNameLabel.setLayoutY(titleLayoutY);
        nameBasicFirstLabel.setLayoutX(programmerColumnLayoutX);
        nameBasicFirstLabel.setLayoutY(nameLevelLayoutY);
        nameBasicSecondLabel.setLayoutX(cookColumnLayoutX);
        nameBasicSecondLabel.setLayoutY(nameLevelLayoutY);
        programmerNameLabel.setLayoutX(programmerNameLayoutX);
        programmerNameLabel.setLayoutY(nameLevelLayoutY);
        cookNameLabel.setLayoutX(cookNameLayoutX);
        cookNameLabel.setLayoutY(nameLevelLayoutY);
        programmerChangeNameButton.setLayoutX(programmerColumnLayoutX);
        programmerChangeNameButton.setLayoutY(firstLevelButtonLayoutY);
        programmerChangeNameButton.setPrefWidth(mainSceneButtonsWidth);
        cookChangeNameButton.setLayoutX(cookColumnLayoutX);
        cookChangeNameButton.setLayoutY(firstLevelButtonLayoutY);
        cookChangeNameButton.setPrefWidth(mainSceneButtonsWidth);
        programmerEatButton.setLayoutX(programmerColumnLayoutX);
        programmerEatButton.setLayoutY(secondLevelButtonLayoutY);
        programmerEatButton.setPrefWidth(mainSceneButtonsWidth);
        cookEatButton.setLayoutX(cookColumnLayoutX);
        cookEatButton.setLayoutY(secondLevelButtonLayoutY);
        cookEatButton.setPrefWidth(mainSceneButtonsWidth);
        programmerWriteCodeButton.setLayoutX(programmerColumnLayoutX);
        programmerWriteCodeButton.setLayoutY(thirdLevelButtonLayoutY);
        programmerWriteCodeButton.setPrefWidth(mainSceneButtonsWidth);
        cookMakeFoodButton.setLayoutX(cookColumnLayoutX);
        cookMakeFoodButton.setLayoutY(thirdLevelButtonLayoutY);
        cookMakeFoodButton.setPrefWidth(mainSceneButtonsWidth);

        warningLabelNameScene.setStyle(language.warningLabelNameSceneColor);
        warningLabelNameScene.setLayoutX(warningLabelNameSceneLayoutX);
        warningLabelNameScene.setLayoutY(warningLabelNameSceneLayoutY);
        newNameLabel.setLayoutX(newNameLayoutX);
        newNameLabel.setLayoutY(newNameLayoutY);
        backToMainSceneButton.setLayoutX(backButtonChangeNameLayoutX);
        backToMainSceneButton.setLayoutY(buttonsChangeNameLayoutY);
        newProgrammerNameTextField.setLayoutX(newNameTextFieldLayoutX);
        newProgrammerNameTextField.setLayoutY(newNameLayoutY);
        newProgrammerNameTextField.setPrefWidth(newNameTextFieldWidth);
        saveNewProgrammerNameButton.setLayoutX(saveButtonChangeNameLayoutX);
        saveNewProgrammerNameButton.setLayoutY(buttonsChangeNameLayoutY);
        newCookNameTextField.setLayoutX(newNameTextFieldLayoutX);
        newCookNameTextField.setLayoutY(newNameLayoutY);
        newCookNameTextField.setPrefWidth(newNameTextFieldWidth);
        saveNewCookNameButton.setLayoutX(saveButtonChangeNameLayoutX);
        saveNewCookNameButton.setLayoutY(buttonsChangeNameLayoutY);

        selectDishLabel.setLayoutX(selectDishLabelLayoutX);
        selectDishLabel.setLayoutY(selectDishLabelLayoutY);
        selectDishComboBox.setLayoutX(selectDishComboBoxLayoutX);
        selectDishComboBox.setLayoutY(selectDishLabelLayoutY);
        selectDishComboBox.setPrefWidth(selectDishComboBoxWidth);
        programmerEatFoodButton.setLayoutX(eatFoodButtonLayoutX);
        programmerEatFoodButton.setLayoutY(buttonsEatSceneLayoutY);
        cookEatFoodButton.setLayoutX(eatFoodButtonLayoutX);
        cookEatFoodButton.setLayoutY(buttonsEatSceneLayoutY);
        backToMainSceneFormEatButton.setLayoutX(backButtonEatSceneLayoutX);
        backToMainSceneFormEatButton.setLayoutY(buttonsEatSceneLayoutY);
        warningLabelNoDishSelected.setLayoutX(warningLabelNoDishSelectedLayoutX);
        warningLabelNoDishSelected.setLayoutY(warningLabelNoDishSelectedLayoutY);
        warningLabelNoDishSelected.setStyle(language.warningLabelEatSceneColor);

        writeCodeArea.setLayoutX(writeCodeAreaLayoutX);
        writeCodeArea.setLayoutY(writeCodeAreaLayoutY);
        writeCodeArea.setPrefHeight(writeCodeAreaHeight);
        writeCodeArea.setPrefWidth(writeCodeAreaWidth);
        writeCodeArea.setEditable(false);
        backToMainSceneFormWritingCodeButton.setLayoutX(backButtonWriteCodeLayoutX);
        backToMainSceneFormWritingCodeButton.setLayoutY(buttonsLayoutY);
        writeCodeToTextAreaButton.setLayoutX(writeCodeToTextAreaLayoutX);
        writeCodeToTextAreaButton.setLayoutY(buttonsLayoutY);

        dishNameLabel.setLayoutX(cookSceneLabelsLayoutX);
        dishNameLabel.setLayoutY(dishNameLabelLayoutY);
        portionNumberLabel.setLayoutX(cookSceneLabelsLayoutX);
        portionNumberLabel.setLayoutY(portionNumberLabelLayoutY);
        flavourLabel.setLayoutX(cookSceneLabelsLayoutX);
        flavourLabel.setLayoutY(flavourLabelLayoutY);
        dishNameTextField.setLayoutX(cookSceneTextFieldsLayoutX);
        dishNameTextField.setLayoutY(dishNameLabelLayoutY);
        dishNameTextField.setPrefColumnCount(cookingSceneTextFieldsColumnCount);
        portionNumberTextField.setLayoutX(cookSceneTextFieldsLayoutX);
        portionNumberTextField.setLayoutY(portionNumberLabelLayoutY);
        portionNumberTextField.setPrefColumnCount(cookingSceneTextFieldsColumnCount);
        flavourTextField.setLayoutX(cookSceneTextFieldsLayoutX);
        flavourTextField.setLayoutY(flavourLabelLayoutY);
        flavourTextField.setPrefColumnCount(cookingSceneTextFieldsColumnCount);
        backToMainSceneFormCookingButton.setLayoutX(cookSceneLabelsLayoutX);
        backToMainSceneFormCookingButton.setLayoutY(buttonsCookSceneLayoutY);
        makeDishButton.setLayoutX(cookButtonLayoutX);
        makeDishButton.setLayoutY(buttonsCookSceneLayoutY);
        warningLabelCookScene.setLayoutX(warningLabelCookSceneLayoutX);
        warningLabelCookScene.setLayoutY(warningLabelCookSceneLayoutY);
        warningLabelCookScene.setStyle(language.warningLabelCookSceneColor);
        warningLabelWrongInput.setLayoutX(warningLabelWrongInputLayoutX);
        warningLabelWrongInput.setLayoutY(warningLabelWrongInputLayoutY);
        warningLabelWrongInput.setStyle(language.warningLabelCookSceneColor);
    }

    public void setProgrammerChangeNameButtonHandler(EventHandler<ActionEvent> handler) {
        programmerChangeNameButton.setOnAction(handler);
    }
    public void setCookChangeNameButtonHandler(EventHandler<ActionEvent> handler) {
        cookChangeNameButton.setOnAction(handler);
    }
    public void setProgrammerEatButtonHandler(EventHandler<ActionEvent> handler) {
        programmerEatButton.setOnAction(handler);
    }
    public void setCookEatButtonHandler(EventHandler<ActionEvent> handler) {
        cookEatButton.setOnAction(handler);
    }
    public void setProgrammerWriteCodeButtonHandler(EventHandler<ActionEvent> handler) {
        programmerWriteCodeButton.setOnAction(handler);
    }
    public void setCookMakeFoodButtonHandler(EventHandler<ActionEvent> handler) {
        cookMakeFoodButton.setOnAction(handler);
    }
    public void setBackToMainSceneButtonHandler(EventHandler<ActionEvent> handler) {
        backToMainSceneButton.setOnAction(handler);
    }
    public void setSaveNewProgrammerNameButtonHandler(EventHandler<ActionEvent> handler) {
        saveNewProgrammerNameButton.setOnAction(handler);
    }
    public void setSaveNewCookNameButtonHandler(EventHandler<ActionEvent> handler) {
        saveNewCookNameButton.setOnAction(handler);
    }
    public void setBackToMainSceneFormEatButtonHandler(EventHandler<ActionEvent> handler) {
        backToMainSceneFormEatButton.setOnAction(handler);
    }
    public void setProgrammerEatFoodButtonHandler(EventHandler<ActionEvent> handler) {
        programmerEatFoodButton.setOnAction(handler);
    }
    public void setCookEatFoodButtonHandler(EventHandler<ActionEvent> handler) {
        cookEatFoodButton.setOnAction(handler);
    }
    public void setWriteCodeToTextAreaButtonHandler(EventHandler<ActionEvent> handler) {
        writeCodeToTextAreaButton.setOnAction(handler);
    }
    public void setBackToMainSceneFormWritingCodeButtonHandler(EventHandler<ActionEvent> handler) {
        backToMainSceneFormWritingCodeButton.setOnAction(handler);
    }
    public void setBackToMainSceneFormCookingButtonHandler(EventHandler<ActionEvent> handler) {
        backToMainSceneFormCookingButton.setOnAction(handler);
    }
    public void setMakeDishButtonHandler(EventHandler<ActionEvent> handler) {
        makeDishButton.setOnAction(handler);
    }

    public String getNewProgrammerName() { return newProgrammerNameTextField.getText(); }
    public String getNewCookName() { return newCookNameTextField.getText(); }
    public Food getChosenDish() {
        if(selectDishComboBox.getValue() == null) {
            warningLabelNoDishSelected.setText(language.warningStringNoDishSelected);
            return null;
        } else {
            warningLabelNoDishSelected.setText("");
            return selectDishComboBox.getValue();
        }
    }
    public String getNewDishName() { return dishNameTextField.getText(); }
    public int getPortionNumber() {
        Scanner scanner = new Scanner(portionNumberTextField.getText());
        if(scanner.hasNextInt()) {
            warningLabelWrongInput.setText("");
            return scanner.nextInt();
        }
        else {
            warningLabelWrongInput.setText(language.warningStringWrongInput);
            return 0;
        }
    }
    public String getNewDishFlavour() { return flavourTextField.getText(); }
    public void setProgrammerName(String name) { programmerNameLabel.setText(name); }
    public void setCookName(String name) { cookNameLabel.setText(name); }
    public void setNewCode(String code) {
        writeCodeArea.setText(writeCodeArea.getText() + code);
    }
    public boolean isNewProgrammerTextFieldEmpty() {
        if(newProgrammerNameTextField.getText().isEmpty()) return true;
        else return false;
    }
    public boolean isNewCookTextFieldEmpty() {
        if(newCookNameTextField.getText().isEmpty()) return true;
        else return false;
    }
    public void setWarningNewNameLabel(boolean bln) {
        if(bln) warningLabelNameScene.setText(language.warningStringNameScene);
        else warningLabelNameScene.setText("");
    }
    public boolean isMakeNewDishFieldsEmpty() {
        if(dishNameTextField.getText().isEmpty() ||
                portionNumberTextField.getText().isEmpty() ||
                flavourTextField.getText().isEmpty()) return true;
        else return false;
    }
    public void setCookingWarningLabel(boolean bln) {
        if(bln) warningLabelCookScene.setText(language.warningStringCookScene);
        else warningLabelCookScene.setText("");
    }

    public void setSelectDishComboBoxList(ObservableList<Food> dishMenu) {
        selectDishComboBox.getItems().addAll(dishMenu);
    }

    public void setMainPane(Pane pane) {
        pane.getChildren().clear();
        pane.getChildren().addAll(
                programmerBasicNameLabel, cookBasicNameLabel,
                nameBasicFirstLabel, nameBasicSecondLabel,
                programmerNameLabel, cookNameLabel,
                programmerChangeNameButton, cookChangeNameButton,
                programmerEatButton, cookEatButton,
                programmerWriteCodeButton, cookMakeFoodButton
        );
    }
    public void setProgrammerNewNamePane(Pane pane) {
        pane.getChildren().clear();
        pane.getChildren().addAll(
                newNameLabel, newProgrammerNameTextField,
                backToMainSceneButton, saveNewProgrammerNameButton,
                warningLabelNameScene
        );
        newProgrammerNameTextField.clear();
        warningLabelNameScene.setText("");
    }
    public void setCookNewNamePane(Pane pane) {
        pane.getChildren().clear();
        pane.getChildren().addAll(
                newNameLabel, newCookNameTextField,
                backToMainSceneButton, saveNewCookNameButton,
                warningLabelNameScene
        );
        newCookNameTextField.clear();
        warningLabelNameScene.setText("");
    }
    public void setProgrammerEatPane(Pane pane) {
        pane.getChildren().clear();
        pane.getChildren().addAll(
                selectDishLabel, selectDishComboBox,
                backToMainSceneFormEatButton, programmerEatFoodButton,
                warningLabelNoDishSelected
        );
        warningLabelNoDishSelected.setText("");
        selectDishComboBox.getItems().clear();
    }
    public void setCookEatPane(Pane pane) {
        pane.getChildren().clear();
        pane.getChildren().addAll(
                selectDishLabel, selectDishComboBox,
                backToMainSceneFormEatButton, cookEatFoodButton,
                warningLabelNoDishSelected
        );
        warningLabelNoDishSelected.setText("");
        selectDishComboBox.getItems().clear();
    }
    public void setWriteCodePane(Pane pane) {
        pane.getChildren().clear();
        pane.getChildren().addAll(
                writeCodeArea,
                backToMainSceneFormWritingCodeButton, writeCodeToTextAreaButton
        );
        writeCodeArea.clear();
    }
    public void setMakeDishPane(Pane pane) {
        pane.getChildren().clear();
        pane.getChildren().addAll(
                dishNameLabel, dishNameTextField,
                portionNumberLabel, portionNumberTextField,
                flavourLabel, flavourTextField,
                backToMainSceneFormCookingButton, makeDishButton,
                warningLabelCookScene, warningLabelWrongInput
        );
        dishNameTextField.clear();
        portionNumberTextField.clear();
        flavourTextField.clear();
        warningLabelCookScene.setText("");
        warningLabelWrongInput.setText("");
    }
}
