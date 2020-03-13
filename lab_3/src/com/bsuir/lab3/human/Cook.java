package com.bsuir.lab3.human;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import com.bsuir.lab3.object.Food;
import com.bsuir.lab3.object.Vegetable;

public class Cook extends Human {
    private ObservableList<Vegetable> boughtVegetables = FXCollections.observableArrayList();
    public Cook(String name) { super(name); }

    public void makeFood(ObservableList<Food> dishMenu, Vegetable vegetable, String name, int quantity, String flavour) {
        for(int i = 0; i < boughtVegetables.size(); i++) {
            if(
                    boughtVegetables.get(i).getName().equals(vegetable.getName()) &&
                    boughtVegetables.get(i).getShape().equals(vegetable.getShape()) &&
                    boughtVegetables.get(i).getColor().equals(vegetable.getColor())
            ) {
                if(boughtVegetables.get(i).getQuantity() > quantity) { boughtVegetables.get(i).decreaseQuantity(); }
                else { boughtVegetables.remove(i); }
                break;
            }
        }
        for(int i = 0; i < dishMenu.size(); i++) {
            if(
                    dishMenu.get(i).getName().equals(name) &&
                    dishMenu.get(i).getTaste().equals(flavour)
            ) {
                dishMenu.get(i).increaseQuantity(quantity);
                return;
            }
        }
        dishMenu.add(new Food(name, quantity, flavour));
    }
    public void buyVegetables(ObservableList<Vegetable> vegetableList, Vegetable plant, int amount) {
        boolean added = false;
        for(int i = 0; i < vegetableList.size(); i++) {
            if(vegetableList.get(i).getName().equals(plant.getName())) {
                for(int j = 0; j < boughtVegetables.size(); j++) {
                    if(
                            boughtVegetables.get(j).getName().equals(plant.getName()) &&
                            boughtVegetables.get(j).getColor().equals(plant.getColor()) &&
                            boughtVegetables.get(j).getShape().equals(plant.getShape())
                    ) {
                        boughtVegetables.get(j).increaseQuantity(amount);
                        added = true;
                        break;
                    }
                }
                if(!added) {
                    boughtVegetables.add(new Vegetable(
                            vegetableList.get(i).getName(),
                            amount,
                            vegetableList.get(i).getShape(),
                            vegetableList.get(i).getColor()
                    ));
                }
                if(vegetableList.get(i).getQuantity() > amount) { vegetableList.get(i).decreaseQuantity(amount); }
                else { vegetableList.remove(i); }
                break;
            }
        }
    }

    public ObservableList<Vegetable> getBoughtVegetables() { return boughtVegetables; }
}
