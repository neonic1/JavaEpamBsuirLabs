package com.bsuir.lab3.human;

import javafx.collections.ObservableList;
import com.bsuir.lab3.object.Food;

public abstract class Human {
    private String name;

    public Human(String name) { this.name = name; }

    public void setName(String name){ this.name = name; }
    public String getName() { return name; }
    public void eat(ObservableList<Food> dishMenu, Food dish) {
        dish.getTaste();
        for(int i = 0; i < dishMenu.size(); i++){
            if(dishMenu.get(i).getName().equals(dish.getName())) {
                if(dishMenu.get(i).getQuantity() == 1) { dishMenu.remove(i); }
                else { dishMenu.get(i).decreaseQuantity(); }
                break;
            }
        }
    }
}
