package com.bsuir.lab3.human;

import javafx.collections.ObservableList;
import com.bsuir.lab3.object.Vegetable;

public class Farmer extends Human {
    public Farmer(String name) { super(name); }

    private void plantVegetable() {}
    private void pourVegetable() {}
    public void growVegetable(ObservableList<Vegetable> vegetableList, String name, int amount, String shape, String color) {
        plantVegetable();
        pourVegetable();
        for(int i = 0; i < vegetableList.size(); i++) {
            if(
                    vegetableList.get(i).getName().equals(name) &&
                    vegetableList.get(i).getShape().equals(shape) &&
                    vegetableList.get(i).getColor().equals(color)
            ) {
                vegetableList.get(i).increaseQuantity(amount);
                return;
            }
        }
        vegetableList.add(new Vegetable(name, amount, shape, color));
    }
}
