package com.bsuir.lab2.application;

import com.bsuir.lab2.human.Cook;
import com.bsuir.lab2.human.Programmer;
import com.bsuir.lab2.object.Food;
import javafx.collections.FXCollections;
import com.bsuir.lab2.human.*;
import com.bsuir.lab2.object.*;
import javafx.collections.ObservableList;

public class Model {
    private String humanName = "Человек";
    private Cook cook = new Cook(humanName);
    private Programmer programmer = new Programmer(humanName);
    private ObservableList<Food> dishMenu = FXCollections.observableArrayList();

    public void setCookName(String name) { cook.setName(name); }
    public String getCookName() { return cook.getName(); }
    public void cookEat(Food dish) { cook.eat(dishMenu, dish); }
    public void cookMakeFood(String name, int quantity, String flavour) { cook.makeFood(dishMenu, name, quantity, flavour); }
    public void setProgrammerName(String name) { programmer.setName(name); }
    public String getProgrammerName() { return programmer.getName(); }
    public void programmerEat(Food dish) { programmer.eat(dishMenu, dish); }
    public String getNewCode() { return programmer.writeCode(); }
    public ObservableList<Food> getDishMenu() { return dishMenu; }
}
