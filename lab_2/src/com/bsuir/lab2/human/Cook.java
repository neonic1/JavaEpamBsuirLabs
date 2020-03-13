package com.bsuir.lab2.human;

import javafx.collections.ObservableList;
import com.bsuir.lab2.object.Food;

public class Cook extends Human {
    public Cook(String name) { super(name); }

    public void makeFood(ObservableList<Food> dishMenu, String name, int quantity, String flavour) {
        dishMenu.add(new Food(name, quantity, flavour));
    }
}
