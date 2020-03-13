package com.bsuir.lab2.object;

public class Food extends Object {
    private String taste;

    public Food(String name, int number, String taste){
        super(name, number);
        this.taste = taste;
    }

    public void setTaste(String taste) { this.taste = taste; }
    public String getTaste() { return taste; }
    public String toString() { return name; }
}
