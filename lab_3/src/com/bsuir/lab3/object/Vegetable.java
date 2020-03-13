package com.bsuir.lab3.object;

public class Vegetable extends Object {
    private String shape;
    private String color;

    public Vegetable(String name, int number, String shape, String color) {
        super(name, number);
        this.shape = shape;
        this.color = color;
    }

    public String getShape() { return shape; }
    public String getColor() { return color; }
    public String toString() { return shape + " " + color + " " + name + ", " + quantity + " шт."; }
}
