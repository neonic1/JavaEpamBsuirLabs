package com.bsuir.lab3.object;

public abstract class Object {
    protected String name;
    protected int quantity;

    public Object(String name, int number) { this.name = name; quantity = number; }

    public String getName() { return name; }
    public void decreaseQuantity() { quantity--; }
    public void decreaseQuantity(int amount) { quantity -= amount; }
    public void increaseQuantity(int amount) { quantity += amount; }
    public int getQuantity() { return quantity; }
}
