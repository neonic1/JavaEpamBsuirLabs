package com.bsuir.lab3.application;

import javafx.collections.FXCollections;
import com.bsuir.lab3.human.*;
import com.bsuir.lab3.object.*;
import javafx.collections.ObservableList;

public class Model {
    private final String humanName = "Человек";
    private Cook cook = new Cook(humanName);
    private Programmer programmer = new Programmer(humanName);
    private Farmer farmer = new Farmer(humanName);
    private ObservableList<Food> dishMenu = FXCollections.observableArrayList();
    private ObservableList<Vegetable> vegetableList = FXCollections.observableArrayList();

    public void setCookName(String name) { cook.setName(name); }
    public String getCookName() { return cook.getName(); }
    public void cookEat(Food dish) { cook.eat(dishMenu, dish); }
    public void cookMakeFood(Vegetable vegetable, String name, int quantity, String flavour) { cook.makeFood(dishMenu, vegetable, name, quantity, flavour); }
    public void cookBuyVegetables(Vegetable plant, int amount) { cook.buyVegetables(vegetableList, plant, amount); }
    public void setProgrammerName(String name) { programmer.setName(name); }
    public String getProgrammerName() { return programmer.getName(); }
    public void programmerEat(Food dish) { programmer.eat(dishMenu, dish); }
    public String getNewCode() { return programmer.writeCode(); }
    public ObservableList<Food> getDishMenu() { return dishMenu; }
    public void setFarmerName(String name) { farmer.setName(name); }
    public String getFarmerName() { return farmer.getName(); }
    public void farmerEat(Food dish) { farmer.eat(dishMenu, dish); }
    public void farmerGrowVegetable(String name, int amount, String shape, String color) { farmer.growVegetable(vegetableList, name, amount, shape, color); }
    public ObservableList<Vegetable> getVegetableList() { return vegetableList; }
    public ObservableList<Vegetable> getBoughtVegetablesList() { return cook.getBoughtVegetables(); }
}
