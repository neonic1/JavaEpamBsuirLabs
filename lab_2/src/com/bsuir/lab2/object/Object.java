package com.bsuir.lab2.object;

public class Object {
    protected String name;
    protected int quantity;

    public Object(String name, int number) { this.name = name; quantity = number; }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public void setQuantity(int number) { quantity = number; }
    public void decreaseQuantity() { quantity--; }
    public int getQuantity() { return quantity; }
}
