package com.bsuir.lab3.application;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import com.bsuir.lab3.object.Food;
import com.bsuir.lab3.object.Vegetable;
import java.util.Scanner;
import com.bsuir.lab3.application.language.Russian;

public class View {
    private Russian language = new Russian();

    //main scene
    private Label programmerBasicNameLabel = new Label(language.programmerBasicNameString);
    private Label cookBasicNameLabel = new Label(language.cookBasicNameString);
    private Label farmerBasicNameLabel = new Label(language.farmerBasicNameString);
    private Label nameBasicFirstLabel = new Label(language.nameBasicString);
    private Label nameBasicSecondLabel = new Label(language.nameBasicString);
    private Label nameBasicThirdLabel = new Label(language.nameBasicString);
    private Label programmerNameLabel = new Label();
    private Label cookNameLabel = new Label();
    private Label farmerNameLabel = new Label();
    private Button programmerChangeNameButton = new Button(language.changeNameString);
    private Button cookChangeNameButton = new Button(language.changeNameString);
    private Button farmerChangeNameButton = new Button(language.changeNameString);
    private Button programmerEatButton = new Button(language.eatString);
    private Button cookEatButton = new Button(language.eatString);
    private Button farmerEatButton = new Button(language.eatString);
    private Button programmerWriteCodeButton = new Button(language.writeCodeString);
    private Button cookMakeFoodButton = new Button(language.makeFoodString);
    private Button cookToVegetableShopButton = new Button(language.vegetableShopString);
    private Button farmerToGardenButton = new Button(language.gardenString);

    private final static int titleLayoutY = 20;
    private final static int programmerColumnLayoutX = 30;
    private final static int cookColumnLayoutX = 180;
    private final static int farmerColumnLayoutX = 330;
    private final static int nameLevelLayoutY = 48;
    private final static int programmerNameLayoutX = 60;
    private final static int cookNameLayoutX = 210;
    private final static int farmerNameLayoutX = 360;
    private final static int firstLevelButtonLayoutY = 80;
    private final static int secondLevelButtonLayoutY = 110;
    private final static int thirdLevelButtonLayoutY = 140;
    private final static int fourthLevelButtonLayoutY = 170;
    private final static int mainSceneButtonsWidth = 120;

    //change name scene
    private Label newNameLabel = new Label(language.newNameString);
    private Button backToMainSceneFromNameSceneButton = new Button(language.backString);
    private Label warningLabelNameScene = new Label();
    //programmer
    private TextField newProgrammerNameTextField = new TextField();
    private Button saveNewProgrammerNameButton = new Button(language.saveString);
    //cook
    private TextField newCookNameTextField = new TextField();
    private Button saveNewCookNameButton = new Button(language.saveString);
    //farmer
    private TextField newFarmerNameTextField = new TextField();
    private Button saveNewFarmerNameButton = new Button(language.saveString);

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
    private Button backToMainSceneFromEatButton = new Button(language.backString);
    private ComboBox<Food> selectDishComboBox = new ComboBox<>();
    //programmer
    private Button programmerEatFoodButton = new Button(language.eatButtonString);
    //cook
    private Button cookEatFoodButton = new Button(language.eatButtonString);
    //farmer
    private Button farmerEatFoodButton = new Button(language.eatButtonString);

    private final static int selectDishLabelLayoutX = 50;
    private final static int selectDishLabelLayoutY = 90;
    private final static int selectDishComboBoxLayoutX = 155;
    private final static int selectDishComboBoxWidth = 250;
    private final static int backButtonEatSceneLayoutX = 50;
    private final static int buttonsEatSceneLayoutY = 130;
    private final static int eatFoodButtonLayoutX = 354;
    private final static int warningLabelNoDishSelectedLayoutX = 175;
    private final static int warningLabelNoDishSelectedLayoutY = 135;

    //programmer write code scene
    private TextArea writeCodeArea = new TextArea();
    private Button writeCodeToTextAreaButton = new Button(language.writeCodeString);
    private Button backToMainSceneFromWritingCodeButton = new Button(language.backString);

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
    private Button backToMainSceneFromCookingButton = new Button(language.backString);
    private Button makeDishButton = new Button(language.makeDishString);
    private Label warningLabelEmptyTextFieldCookScene = new Label();
    private Label warningLabelWrongInput = new Label();
    private Label chooseVegetablesLabel = new Label(language.chooseVegetablesString);
    private ComboBox<Vegetable> chooseVegetablesComboBox = new ComboBox<>();
    private Label warningLabelLowVegetables = new Label();

    private final static int cookSceneLabelsLayoutX = 45;
    private final static int cookSceneTextFieldsLayoutX = 165;
    private final static int dishNameLabelLayoutY = 80;
    private final static int portionNumberLabelLayoutY = 115;
    private final static int flavourLabelLayoutY = 150;
    private final static int buttonsCookSceneLayoutY = 185;
    private final static int cookButtonLayoutX = 328;
    private final static int cookingSceneTextFieldsColumnCount = 21;
    private final static int warningLabelCookSceneLayoutX = 150;
    private final static int warningLabelCookSceneLayoutY = 190;
    private final static int warningLabelWrongInputLayoutX = 150;
    private final static int warningLabelWrongInputLayoutY = 215;
    private final static int chooseVegetablesLayoutY = 45;
    private final static int chooseVegetableComboBoxWidth = 250;
    private final static int warningLabelLowVegetablesLayoutX = 220;
    private final static int warningLabelLowVegetablesLayoutY = 25;

    //cook buy vegetables scene
    private Label chooseVegetableLabel = new Label(language.chooseVegetableString);
    private Label vegetablesAmountLabel = new Label(language.vegetablesAmountString);
    private Label warningLabelEmptyFieldShopScene = new Label();
    private Label warningLabelWrongInputShopScene = new Label();
    private Label warningLabelNotEnoughItemsShopScene = new Label();
    private ComboBox<Vegetable> selectVegetableComboBox = new ComboBox<>();
    private TextField vegetablesAmountTextField = new TextField();
    private Button backToMainSceneFromShopButton = new Button(language.backString);
    private Button buyVegetablesButton = new Button(language.buyVegetablesString);

    private final static int shopSceneLabelsLayoutX = 50;
    private final static int chooseVegetableLayoutY = 70;
    private final static int selectVegetableComboBoxLayoutX = 150;
    private final static int vegetablesAmountLayoutY = 105;
    private final static int vegetablesAmountTextFieldLayoutX = 150;
    private final static int shopSceneButtonsLayoutY = 140;
    private final static int buyVegetablesButtonLayoutX = 347;
    private final static int selectVegetableComboBoxWidth = 250;
    private final static int vegetablesAmountTextFieldWidth = 250;
    private final static int warningLabelEmptyFieldLayoutX = 170;
    private final static int warningLabelEmptyFieldLayoutY = 145;
    private final static int warningLabelWrongInputShopSceneLayoutX = 168;
    private final static int warningLabelWrongInputShopSceneLayoutY = 145;
    private final static int warningLabelNotEnoughItemsShopSceneLayoutX = 120;
    private final static int warningLabelNotEnoughItemsShopSceneLayoutY = 170;

    //growing vegetables scene
    private Label newVegetableNameLabel = new Label(language.newVegetableNameString);
    private Label newVegetableAmountLabel = new Label(language.newVegetableAmountString);
    private Label newVegetableShapeLabel = new Label(language.newVegetableShapeString);
    private Label newVegetableColorLabel = new Label(language.newVegetableColorString);
    private Label warningLabelEmptyFieldGardenScene = new Label();
    private Label warningLabelWrongInputGardenScene = new Label();
    private TextField newVegetableNameTextField = new TextField();
    private TextField newVegetableAmountTextField = new TextField();
    private TextField newVegetableShapeTextField = new TextField();
    private TextField newVegetableColorTextField = new TextField();
    private Button backToMainSceneFromGardenButton = new Button(language.backString);
    private Button growNewVegetablesButton = new Button(language.growNewVegetablesString);

    private final static int gardenSceneLabelsLayoutX = 90;
    private final static int gardenSceneTextFieldsLayoutX = 190;
    private final static int newVegetableNameLayoutY = 40;
    private final static int newVegetableAmountLayoutY = 75;
    private final static int newVegetableShapeLayoutY = 110;
    private final static int newVegetableColorLayoutY = 145;
    private final static int gardenSceneTextFieldsWidth = 200;
    private final static int GardenSceneButtonsLayoutY = 180;
    private final static int growNewVegetablesButtonLayoutX = 317;
    private final static int warningLabelEmptyFieldGardenSceneLayoutX = 175;
    private final static int warningLabelEmptyFieldGardenSceneLayoutY = 185;
    private final static int warningLabelWrongInputGardenSceneLayoutX = 175;
    private final static int warningLabelWrongInputGardenSceneLayoutY = 205;


    public View() {
        programmerBasicNameLabel.setLayoutX(programmerColumnLayoutX);
        programmerBasicNameLabel.setLayoutY(titleLayoutY);
        cookBasicNameLabel.setLayoutX(cookColumnLayoutX);
        cookBasicNameLabel.setLayoutY(titleLayoutY);
        farmerBasicNameLabel.setLayoutX(farmerColumnLayoutX);
        farmerBasicNameLabel.setLayoutY(titleLayoutY);
        nameBasicFirstLabel.setLayoutX(programmerColumnLayoutX);
        nameBasicFirstLabel.setLayoutY(nameLevelLayoutY);
        nameBasicSecondLabel.setLayoutX(cookColumnLayoutX);
        nameBasicSecondLabel.setLayoutY(nameLevelLayoutY);
        nameBasicThirdLabel.setLayoutX(farmerColumnLayoutX);
        nameBasicThirdLabel.setLayoutY(nameLevelLayoutY);
        programmerNameLabel.setLayoutX(programmerNameLayoutX);
        programmerNameLabel.setLayoutY(nameLevelLayoutY);
        cookNameLabel.setLayoutX(cookNameLayoutX);
        cookNameLabel.setLayoutY(nameLevelLayoutY);
        farmerNameLabel.setLayoutX(farmerNameLayoutX);
        farmerNameLabel.setLayoutY(nameLevelLayoutY);
        programmerChangeNameButton.setLayoutX(programmerColumnLayoutX);
        programmerChangeNameButton.setLayoutY(firstLevelButtonLayoutY);
        programmerChangeNameButton.setPrefWidth(mainSceneButtonsWidth);
        cookChangeNameButton.setLayoutX(cookColumnLayoutX);
        cookChangeNameButton.setLayoutY(firstLevelButtonLayoutY);
        cookChangeNameButton.setPrefWidth(mainSceneButtonsWidth);
        farmerChangeNameButton.setLayoutX(farmerColumnLayoutX);
        farmerChangeNameButton.setLayoutY(firstLevelButtonLayoutY);
        farmerChangeNameButton.setPrefWidth(mainSceneButtonsWidth);
        programmerEatButton.setLayoutX(programmerColumnLayoutX);
        programmerEatButton.setLayoutY(secondLevelButtonLayoutY);
        programmerEatButton.setPrefWidth(mainSceneButtonsWidth);
        cookEatButton.setLayoutX(cookColumnLayoutX);
        cookEatButton.setLayoutY(secondLevelButtonLayoutY);
        cookEatButton.setPrefWidth(mainSceneButtonsWidth);
        farmerEatButton.setLayoutX(farmerColumnLayoutX);
        farmerEatButton.setLayoutY(secondLevelButtonLayoutY);
        farmerEatButton.setPrefWidth(mainSceneButtonsWidth);
        programmerWriteCodeButton.setLayoutX(programmerColumnLayoutX);
        programmerWriteCodeButton.setLayoutY(thirdLevelButtonLayoutY);
        programmerWriteCodeButton.setPrefWidth(mainSceneButtonsWidth);
        cookMakeFoodButton.setLayoutX(cookColumnLayoutX);
        cookMakeFoodButton.setLayoutY(thirdLevelButtonLayoutY);
        cookMakeFoodButton.setPrefWidth(mainSceneButtonsWidth);
        cookToVegetableShopButton.setLayoutX(cookColumnLayoutX);
        cookToVegetableShopButton.setLayoutY(fourthLevelButtonLayoutY);
        cookToVegetableShopButton.setPrefWidth(mainSceneButtonsWidth);
        farmerToGardenButton.setLayoutX(farmerColumnLayoutX);
        farmerToGardenButton.setLayoutY(thirdLevelButtonLayoutY);
        farmerToGardenButton.setPrefWidth(mainSceneButtonsWidth);

        warningLabelNameScene.setStyle(language.warningLabelNameSceneColor);
        warningLabelNameScene.setLayoutX(warningLabelNameSceneLayoutX);
        warningLabelNameScene.setLayoutY(warningLabelNameSceneLayoutY);
        newNameLabel.setLayoutX(newNameLayoutX);
        newNameLabel.setLayoutY(newNameLayoutY);
        backToMainSceneFromNameSceneButton.setLayoutX(backButtonChangeNameLayoutX);
        backToMainSceneFromNameSceneButton.setLayoutY(buttonsChangeNameLayoutY);
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
        newFarmerNameTextField.setLayoutX(newNameTextFieldLayoutX);
        newFarmerNameTextField.setLayoutY(newNameLayoutY);
        newFarmerNameTextField.setPrefWidth(newNameTextFieldWidth);
        saveNewFarmerNameButton.setLayoutX(saveButtonChangeNameLayoutX);
        saveNewFarmerNameButton.setLayoutY(buttonsChangeNameLayoutY);

        selectDishLabel.setLayoutX(selectDishLabelLayoutX);
        selectDishLabel.setLayoutY(selectDishLabelLayoutY);
        selectDishComboBox.setLayoutX(selectDishComboBoxLayoutX);
        selectDishComboBox.setLayoutY(selectDishLabelLayoutY);
        selectDishComboBox.setPrefWidth(selectDishComboBoxWidth);
        programmerEatFoodButton.setLayoutX(eatFoodButtonLayoutX);
        programmerEatFoodButton.setLayoutY(buttonsEatSceneLayoutY);
        cookEatFoodButton.setLayoutX(eatFoodButtonLayoutX);
        cookEatFoodButton.setLayoutY(buttonsEatSceneLayoutY);
        farmerEatFoodButton.setLayoutX(eatFoodButtonLayoutX);
        farmerEatFoodButton.setLayoutY(buttonsEatSceneLayoutY);
        backToMainSceneFromEatButton.setLayoutX(backButtonEatSceneLayoutX);
        backToMainSceneFromEatButton.setLayoutY(buttonsEatSceneLayoutY);
        warningLabelNoDishSelected.setLayoutX(warningLabelNoDishSelectedLayoutX);
        warningLabelNoDishSelected.setLayoutY(warningLabelNoDishSelectedLayoutY);
        warningLabelNoDishSelected.setStyle(language.warningLabelEatSceneColor);

        writeCodeArea.setLayoutX(writeCodeAreaLayoutX);
        writeCodeArea.setLayoutY(writeCodeAreaLayoutY);
        writeCodeArea.setPrefHeight(writeCodeAreaHeight);
        writeCodeArea.setPrefWidth(writeCodeAreaWidth);
        writeCodeArea.setEditable(false);
        backToMainSceneFromWritingCodeButton.setLayoutX(backButtonWriteCodeLayoutX);
        backToMainSceneFromWritingCodeButton.setLayoutY(buttonsLayoutY);
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
        backToMainSceneFromCookingButton.setLayoutX(cookSceneLabelsLayoutX);
        backToMainSceneFromCookingButton.setLayoutY(buttonsCookSceneLayoutY);
        makeDishButton.setLayoutX(cookButtonLayoutX);
        makeDishButton.setLayoutY(buttonsCookSceneLayoutY);
        warningLabelEmptyTextFieldCookScene.setLayoutX(warningLabelCookSceneLayoutX);
        warningLabelEmptyTextFieldCookScene.setLayoutY(warningLabelCookSceneLayoutY);
        warningLabelEmptyTextFieldCookScene.setStyle(language.warningLabelCookSceneColor);
        warningLabelWrongInput.setLayoutX(warningLabelWrongInputLayoutX);
        warningLabelWrongInput.setLayoutY(warningLabelWrongInputLayoutY);
        warningLabelWrongInput.setStyle(language.warningLabelCookSceneColor);
        chooseVegetablesLabel.setLayoutX(cookSceneLabelsLayoutX);
        chooseVegetablesLabel.setLayoutY(chooseVegetablesLayoutY);
        chooseVegetablesComboBox.setLayoutX(cookSceneTextFieldsLayoutX);
        chooseVegetablesComboBox.setLayoutY(chooseVegetablesLayoutY);
        chooseVegetablesComboBox.setPrefWidth(chooseVegetableComboBoxWidth);
        warningLabelLowVegetables.setLayoutY(warningLabelLowVegetablesLayoutY);
        warningLabelLowVegetables.setLayoutX(warningLabelLowVegetablesLayoutX);
        warningLabelLowVegetables.setStyle(language.warningLabelShopSceneColor);

        chooseVegetableLabel.setLayoutX(shopSceneLabelsLayoutX);
        chooseVegetableLabel.setLayoutY(chooseVegetableLayoutY);
        vegetablesAmountLabel.setLayoutX(shopSceneLabelsLayoutX);
        vegetablesAmountLabel.setLayoutY(vegetablesAmountLayoutY);
        selectVegetableComboBox.setLayoutX(selectVegetableComboBoxLayoutX);
        selectVegetableComboBox.setLayoutY(chooseVegetableLayoutY);
        selectVegetableComboBox.setPrefWidth(selectVegetableComboBoxWidth);
        vegetablesAmountTextField.setLayoutX(vegetablesAmountTextFieldLayoutX);
        vegetablesAmountTextField.setLayoutY(vegetablesAmountLayoutY);
        vegetablesAmountTextField.setPrefWidth(vegetablesAmountTextFieldWidth);
        backToMainSceneFromShopButton.setLayoutX(shopSceneLabelsLayoutX);
        backToMainSceneFromShopButton.setLayoutY(shopSceneButtonsLayoutY);
        buyVegetablesButton.setLayoutX(buyVegetablesButtonLayoutX);
        buyVegetablesButton.setLayoutY(shopSceneButtonsLayoutY);
        warningLabelEmptyFieldShopScene.setLayoutX(warningLabelEmptyFieldLayoutX);
        warningLabelEmptyFieldShopScene.setLayoutY(warningLabelEmptyFieldLayoutY);
        warningLabelEmptyFieldShopScene.setStyle(language.warningLabelShopSceneColor);
        warningLabelWrongInputShopScene.setLayoutX(warningLabelWrongInputShopSceneLayoutX);
        warningLabelWrongInputShopScene.setLayoutY(warningLabelWrongInputShopSceneLayoutY);
        warningLabelWrongInputShopScene.setStyle(language.warningLabelShopSceneColor);
        warningLabelNotEnoughItemsShopScene.setLayoutX(warningLabelNotEnoughItemsShopSceneLayoutX);
        warningLabelNotEnoughItemsShopScene.setLayoutY(warningLabelNotEnoughItemsShopSceneLayoutY);
        warningLabelNotEnoughItemsShopScene.setStyle(language.warningLabelShopSceneColor);

        newVegetableNameLabel.setLayoutX(gardenSceneLabelsLayoutX);
        newVegetableNameLabel.setLayoutY(newVegetableNameLayoutY);
        newVegetableAmountLabel.setLayoutX(gardenSceneLabelsLayoutX);
        newVegetableAmountLabel.setLayoutY(newVegetableAmountLayoutY);
        newVegetableShapeLabel.setLayoutX(gardenSceneLabelsLayoutX);
        newVegetableShapeLabel.setLayoutY(newVegetableShapeLayoutY);
        newVegetableColorLabel.setLayoutX(gardenSceneLabelsLayoutX);
        newVegetableColorLabel.setLayoutY(newVegetableColorLayoutY);
        newVegetableNameTextField.setLayoutX(gardenSceneTextFieldsLayoutX);
        newVegetableNameTextField.setLayoutY(newVegetableNameLayoutY);
        newVegetableNameTextField.setPrefWidth(gardenSceneTextFieldsWidth);
        newVegetableAmountTextField.setLayoutX(gardenSceneTextFieldsLayoutX);
        newVegetableAmountTextField.setLayoutY(newVegetableAmountLayoutY);
        newVegetableAmountTextField.setPrefWidth(gardenSceneTextFieldsWidth);
        newVegetableShapeTextField.setLayoutX(gardenSceneTextFieldsLayoutX);
        newVegetableShapeTextField.setLayoutY(newVegetableShapeLayoutY);
        newVegetableShapeTextField.setPrefWidth(gardenSceneTextFieldsWidth);
        newVegetableColorTextField.setLayoutX(gardenSceneTextFieldsLayoutX);
        newVegetableColorTextField.setLayoutY(newVegetableColorLayoutY);
        newVegetableColorTextField.setPrefWidth(gardenSceneTextFieldsWidth);
        backToMainSceneFromGardenButton.setLayoutX(gardenSceneLabelsLayoutX);
        backToMainSceneFromGardenButton.setLayoutY(GardenSceneButtonsLayoutY);
        growNewVegetablesButton.setLayoutX(growNewVegetablesButtonLayoutX);
        growNewVegetablesButton.setLayoutY(GardenSceneButtonsLayoutY);
        warningLabelEmptyFieldGardenScene.setLayoutX(warningLabelEmptyFieldGardenSceneLayoutX);
        warningLabelEmptyFieldGardenScene.setLayoutY(warningLabelEmptyFieldGardenSceneLayoutY);
        warningLabelEmptyFieldGardenScene.setStyle(language.warningLabelGardenSceneColor);
        warningLabelWrongInputGardenScene.setLayoutX(warningLabelWrongInputGardenSceneLayoutX);
        warningLabelWrongInputGardenScene.setLayoutY(warningLabelWrongInputGardenSceneLayoutY);
        warningLabelWrongInputGardenScene.setStyle(language.warningLabelGardenSceneColor);
    }

    public void setProgrammerChangeNameButtonHandler(EventHandler<ActionEvent> handler) {
        programmerChangeNameButton.setOnAction(handler);
    }
    public void setCookChangeNameButtonHandler(EventHandler<ActionEvent> handler) {
        cookChangeNameButton.setOnAction(handler);
    }
    public void setFarmerChangeNameButtonHandler(EventHandler<ActionEvent> handler) {
        farmerChangeNameButton.setOnAction(handler);
    }
    public void setProgrammerEatButtonHandler(EventHandler<ActionEvent> handler) {
        programmerEatButton.setOnAction(handler);
    }
    public void setCookEatButtonHandler(EventHandler<ActionEvent> handler) {
        cookEatButton.setOnAction(handler);
    }
    public void setFarmerEatButtonHandler(EventHandler<ActionEvent> handler) {
        farmerEatButton.setOnAction(handler);
    }
    public void setProgrammerWriteCodeButtonHandler(EventHandler<ActionEvent> handler) {
        programmerWriteCodeButton.setOnAction(handler);
    }
    public void setCookMakeFoodButtonHandler(EventHandler<ActionEvent> handler) {
        cookMakeFoodButton.setOnAction(handler);
    }
    public void setCookToVegetableShopButtonHandler(EventHandler<ActionEvent> handler) {
        cookToVegetableShopButton.setOnAction(handler);
    }
    public void setFarmerToGardenButtonHandler(EventHandler<ActionEvent> handler) {
        farmerToGardenButton.setOnAction(handler);
    }
    public void setBackToMainSceneFromNameSceneButtonHandler(EventHandler<ActionEvent> handler) {
        backToMainSceneFromNameSceneButton.setOnAction(handler);
    }
    public void setSaveNewProgrammerNameButtonHandler(EventHandler<ActionEvent> handler) {
        saveNewProgrammerNameButton.setOnAction(handler);
    }
    public void setSaveNewCookNameButtonHandler(EventHandler<ActionEvent> handler) {
        saveNewCookNameButton.setOnAction(handler);
    }
    public void setSaveNewFarmerNameButtonHandler(EventHandler<ActionEvent> handler) {
        saveNewFarmerNameButton.setOnAction(handler);
    }
    public void setBackToMainSceneFromEatButtonHandler(EventHandler<ActionEvent> handler) {
        backToMainSceneFromEatButton.setOnAction(handler);
    }
    public void setProgrammerEatFoodButtonHandler(EventHandler<ActionEvent> handler) {
        programmerEatFoodButton.setOnAction(handler);
    }
    public void setCookEatFoodButtonHandler(EventHandler<ActionEvent> handler) {
        cookEatFoodButton.setOnAction(handler);
    }
    public void setFarmerEatFoodButtonHandler(EventHandler<ActionEvent> handler) {
        farmerEatFoodButton.setOnAction(handler);
    }
    public void setWriteCodeToTextAreaButtonHandler(EventHandler<ActionEvent> handler) {
        writeCodeToTextAreaButton.setOnAction(handler);
    }
    public void setBackToMainSceneFromWritingCodeButtonHandler(EventHandler<ActionEvent> handler) {
        backToMainSceneFromWritingCodeButton.setOnAction(handler);
    }
    public void setMakeDishButtonHandler(EventHandler<ActionEvent> handler) {
        makeDishButton.setOnAction(handler);
    }
    public void setBackToMainSceneFromCookingButtonHandler(EventHandler<ActionEvent> handler) {
        backToMainSceneFromCookingButton.setOnAction(handler);
    }
    public void setBackToMainSceneFromShopButtonHandler(EventHandler<ActionEvent> handler) {
        backToMainSceneFromShopButton.setOnAction(handler);
    }
    public void setBuyVegetablesButtonHandler(EventHandler<ActionEvent> handler) {
        buyVegetablesButton.setOnAction(handler);
    }
    public void setBackToMainSceneFromGardenButtonHandler(EventHandler<ActionEvent> handler) {
        backToMainSceneFromGardenButton.setOnAction(handler);
    }
    public void setGrowNewVegetablesButtonHandler(EventHandler<ActionEvent> handler) {
        growNewVegetablesButton.setOnAction(handler);
    }

    public void setOldName(String person, String name) {
        switch(person){
            case "programmer": {
                newProgrammerNameTextField.setText(name);
                break;
            }
            case "cook": {
                newCookNameTextField.setText(name);
                break;
            }
            case "farmer": {
                newFarmerNameTextField.setText(name);
                break;
            }
        }
    }

    public String getNewProgrammerName() {
        if(newProgrammerNameTextField.getText().isEmpty()) {
            warningLabelNameScene.setText(language.warningStringNameScene);
            return null;
        } else {
            if(newProgrammerNameTextField.getText().length() > 15) {
                warningLabelNameScene.setText(language.warningStringTooLongNameScene);
                return null;
            } else {
                warningLabelNameScene.setText(null);
                return newProgrammerNameTextField.getText();
            }
        }
    }
    public String getNewCookName() {
        if(newCookNameTextField.getText().isEmpty()) {
            warningLabelNameScene.setText(language.warningStringNameScene);
            return null;
        } else {
            if(newCookNameTextField.getText().length() > 15) {
                warningLabelNameScene.setText(language.warningStringTooLongNameScene);
                return null;
            } else {
                warningLabelNameScene.setText(null);
                return newCookNameTextField.getText();
            }
        }
    }
    public String getNewFarmerName() {
        if(newFarmerNameTextField.getText().isEmpty()) {
            warningLabelNameScene.setText(language.warningStringNameScene);
            return null;
        } else {
            if(newFarmerNameTextField.getText().length() > 15) {
                warningLabelNameScene.setText(language.warningStringTooLongNameScene);
                return null;
            } else {
                warningLabelNameScene.setText(null);
                return newFarmerNameTextField.getText();
            }
        }
    }
    public Food getChosenDish() {
        if(selectDishComboBox.getValue() == null) {
            warningLabelNoDishSelected.setText(language.warningStringNoDishSelected);
            return null;
        } else {
            warningLabelNoDishSelected.setText(null);
            return selectDishComboBox.getValue();
        }
    }
    public String getNewDishName() {
        if(dishNameTextField.getText().isEmpty()) {
            warningLabelEmptyTextFieldCookScene.setText(language.warningStringEmptyTextFieldCookScene);
            return null;
        } else {
            warningLabelEmptyTextFieldCookScene.setText(null);
            return dishNameTextField.getText();
        }
    }
    public int getPortionNumber() {
        if(portionNumberTextField.getText().isEmpty()) {
            warningLabelLowVegetables.setText(null);
            warningLabelEmptyTextFieldCookScene.setText(language.warningStringEmptyTextFieldCookScene);
            return 0;
        } else {
            warningLabelEmptyTextFieldCookScene.setText(null);
            Scanner scanner = new Scanner(portionNumberTextField.getText());
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                warningLabelWrongInput.setText(null);
                if(getChosenVegetableForNewDish() != null) {
                    if(getChosenVegetableForNewDish().getQuantity() >= number) {
                        warningLabelLowVegetables.setText(null);
                        return number;
                    } else {
                        warningLabelLowVegetables.setText(language.warningLabelLowVegetablesString);
                        return 0;
                    }
                } else { return 0; }
            } else {
                warningLabelLowVegetables.setText(null);
                warningLabelWrongInput.setText(language.warningStringWrongInput);
                return 0;
            }
        }
    }
    public String getNewDishFlavour() {
        if(flavourTextField.getText().isEmpty()) {
            warningLabelEmptyTextFieldCookScene.setText(language.warningStringEmptyTextFieldCookScene);
            return null;
        } else {
            warningLabelEmptyTextFieldCookScene.setText(null);
            return flavourTextField.getText();
        }
    }
    public Vegetable getChosenVegetableForNewDish() {
        if(chooseVegetablesComboBox.getValue() == null) {
            warningLabelEmptyTextFieldCookScene.setText(language.warningStringEmptyTextFieldCookScene);
            return null;
        } else {
            warningLabelEmptyTextFieldCookScene.setText(null);
            return chooseVegetablesComboBox.getValue();
        }
    }
    public Vegetable getChosenVegetable() {
        if(selectVegetableComboBox.getValue() == null) {
            warningLabelWrongInputShopScene.setText(null);
            warningLabelEmptyFieldShopScene.setText(language.warningStringEmptyFieldShopScene);
            return null;
        } else {
            warningLabelEmptyFieldShopScene.setText(null);
            return selectVegetableComboBox.getValue();
        }
    }
    public int getVegetablesAmount(Vegetable plant) {
        if(vegetablesAmountTextField.getText().isEmpty()) {
            warningLabelWrongInputShopScene.setText(null);
            warningLabelEmptyFieldShopScene.setText(language.warningStringEmptyFieldShopScene);
            return 0;
        } else {
            warningLabelEmptyFieldShopScene.setText(null);
            Scanner scanner = new Scanner(vegetablesAmountTextField.getText());
            if (scanner.hasNextInt()) {
                warningLabelWrongInputShopScene.setText(null);
                int quantity = scanner.nextInt();
                if(plant.getQuantity() >= quantity) { return quantity; }
                else {
                    warningLabelNotEnoughItemsShopScene.setText(language.warningStringNotEnoughItemsShopScene + plant.getQuantity());
                    return 0;
                }
            } else {
                warningLabelWrongInputShopScene.setText(language.warningStringWrongInputShopScene);
                return 0;
            }
        }
    }
    public String getNewVegetableName() {
        if(newVegetableNameTextField.getText().isEmpty()) {
            warningLabelEmptyFieldGardenScene.setText(language.warningStringEmptyFieldGardenScene);
            return null;
        } else {
            warningLabelEmptyFieldGardenScene.setText(null);
            return newVegetableNameTextField.getText();
        }
    }
    public int getNewVegetableAmount() {
        if(newVegetableAmountTextField.getText().isEmpty()) {
            warningLabelEmptyFieldGardenScene.setText(language.warningStringEmptyFieldGardenScene);
            return 0;
        } else {
            warningLabelEmptyFieldGardenScene.setText(null);
            Scanner scanner = new Scanner(newVegetableAmountTextField.getText());
            if(scanner.hasNextInt()) {
                warningLabelWrongInputGardenScene.setText(null);
                return scanner.nextInt();
            } else {
                warningLabelWrongInputGardenScene.setText(language.warningStringWrongInputGardenScene);
                return 0;
            }
        }
    }
    public String getNewVegetableShape() {
        if(newVegetableShapeTextField.getText().isEmpty()) {
            warningLabelEmptyFieldGardenScene.setText(language.warningStringEmptyFieldGardenScene);
            return null;
        } else {
            warningLabelEmptyFieldGardenScene.setText(null);
            return newVegetableShapeTextField.getText();
        }
    }
    public String getNewVegetableColor() {
        if(newVegetableColorTextField.getText().isEmpty()) {
            warningLabelEmptyFieldGardenScene.setText(language.warningStringEmptyFieldGardenScene);
            return null;
        } else {
            warningLabelEmptyFieldGardenScene.setText(null);
            return newVegetableColorTextField.getText();
        }
    }
    public void setProgrammerName(String name) { programmerNameLabel.setText(name); }
    public void setCookName(String name) { cookNameLabel.setText(name); }
    public void setFarmerName(String name) { farmerNameLabel.setText(name); }
    public void setNewCode(String code) {
        writeCodeArea.setText(writeCodeArea.getText() + code);
    }
    public void setSelectDishComboBoxList(ObservableList<Food> dishMenu) {
        selectDishComboBox.getItems().addAll(dishMenu);
    }

    public void setSelectVegetableComboBox(ObservableList<Vegetable> vegetableList) {
        selectVegetableComboBox.getItems().addAll(vegetableList);
    }

    public void setChooseVegetablesComboBox(ObservableList<Vegetable> vegetableList) {
        chooseVegetablesComboBox.getItems().addAll(vegetableList);
    }

    public void setMainPane(Pane pane) {
        pane.getChildren().clear();
        pane.getChildren().addAll(
                programmerBasicNameLabel, cookBasicNameLabel, farmerBasicNameLabel,
                nameBasicFirstLabel, nameBasicSecondLabel, nameBasicThirdLabel,
                programmerNameLabel, cookNameLabel, farmerNameLabel,
                programmerChangeNameButton, cookChangeNameButton, farmerChangeNameButton,
                programmerEatButton, cookEatButton, farmerEatButton,
                programmerWriteCodeButton, cookMakeFoodButton, farmerToGardenButton,
                cookToVegetableShopButton
        );
    }
    public void setProgrammerNewNamePane(Pane pane) {
        pane.getChildren().clear();
        pane.getChildren().addAll(
                newNameLabel, newProgrammerNameTextField,
                backToMainSceneFromNameSceneButton, saveNewProgrammerNameButton,
                warningLabelNameScene
        );
        warningLabelNameScene.setText(null);
    }
    public void setCookNewNamePane(Pane pane) {
        pane.getChildren().clear();
        pane.getChildren().addAll(
                newNameLabel, newCookNameTextField,
                backToMainSceneFromNameSceneButton, saveNewCookNameButton,
                warningLabelNameScene
        );
        warningLabelNameScene.setText(null);
    }
    public void setFarmerNewNamePane(Pane pane) {
        pane.getChildren().clear();
        pane.getChildren().addAll(
                newNameLabel, newFarmerNameTextField,
                backToMainSceneFromNameSceneButton, saveNewFarmerNameButton,
                warningLabelNameScene
        );
        warningLabelNameScene.setText(null);
    }
    public void setProgrammerEatPane(Pane pane) {
        pane.getChildren().clear();
        pane.getChildren().addAll(
                selectDishLabel, selectDishComboBox,
                backToMainSceneFromEatButton, programmerEatFoodButton,
                warningLabelNoDishSelected
        );
        warningLabelNoDishSelected.setText(null);
        selectDishComboBox.getItems().clear();
    }
    public void setCookEatPane(Pane pane) {
        pane.getChildren().clear();
        pane.getChildren().addAll(
                selectDishLabel, selectDishComboBox,
                backToMainSceneFromEatButton, cookEatFoodButton,
                warningLabelNoDishSelected
        );
        warningLabelNoDishSelected.setText(null);
        selectDishComboBox.getItems().clear();
    }
    public void setFarmerEatPane(Pane pane) {
        pane.getChildren().clear();
        pane.getChildren().addAll(
                selectDishLabel, selectDishComboBox,
                backToMainSceneFromEatButton, farmerEatFoodButton,
                warningLabelNoDishSelected
        );
        warningLabelNoDishSelected.setText(null);
        selectDishComboBox.getItems().clear();
    }
    public void setWriteCodePane(Pane pane) {
        pane.getChildren().clear();
        pane.getChildren().addAll(
                writeCodeArea,
                backToMainSceneFromWritingCodeButton, writeCodeToTextAreaButton
        );
        writeCodeArea.clear();
    }
    public void setMakeDishPane(Pane pane) {
        pane.getChildren().clear();
        pane.getChildren().addAll(
                warningLabelLowVegetables,
                chooseVegetablesLabel, chooseVegetablesComboBox,
                dishNameLabel, dishNameTextField,
                portionNumberLabel, portionNumberTextField,
                flavourLabel, flavourTextField,
                backToMainSceneFromCookingButton, makeDishButton,
                warningLabelEmptyTextFieldCookScene, warningLabelWrongInput
        );
        dishNameTextField.clear();
        portionNumberTextField.clear();
        flavourTextField.clear();
        warningLabelEmptyTextFieldCookScene.setText(null);
        warningLabelWrongInput.setText(null);
        chooseVegetablesComboBox.getItems().clear();
        warningLabelLowVegetables.setText(null);
    }
    public void setBuyVegetablesPane(Pane pane) {
        pane.getChildren().clear();
        pane.getChildren().addAll(
                chooseVegetableLabel, selectVegetableComboBox,
                vegetablesAmountLabel, vegetablesAmountTextField,
                backToMainSceneFromShopButton, buyVegetablesButton,
                warningLabelEmptyFieldShopScene, warningLabelWrongInputShopScene,
                warningLabelNotEnoughItemsShopScene
        );
        selectVegetableComboBox.getItems().clear();
        vegetablesAmountTextField.clear();
        warningLabelEmptyFieldShopScene.setText(null);
        warningLabelWrongInputShopScene.setText(null);
        warningLabelNotEnoughItemsShopScene.setText(null);
    }
    public void setGrowNewVegetablesPane(Pane pane) {
        pane.getChildren().clear();
        pane.getChildren().addAll(
                newVegetableNameLabel, newVegetableNameTextField,
                newVegetableAmountLabel, newVegetableAmountTextField,
                newVegetableShapeLabel, newVegetableShapeTextField,
                newVegetableColorLabel, newVegetableColorTextField,
                backToMainSceneFromGardenButton, growNewVegetablesButton,
                warningLabelEmptyFieldGardenScene, warningLabelWrongInputGardenScene
        );
        newVegetableNameTextField.clear();
        newVegetableAmountTextField.clear();
        newVegetableShapeTextField.clear();
        newVegetableColorTextField.clear();
        warningLabelEmptyFieldGardenScene.setText(null);
        warningLabelWrongInputGardenScene.setText(null);
    }
}
