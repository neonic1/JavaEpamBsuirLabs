package com.bsuir.lab3.object;

public class Food extends Object {
    private String taste;

    public Food(String name, int number, String taste){
        super(name, number);
        this.taste = taste;
    }

    public String getTaste() { return taste; }
    public String toString() { return taste + " " + name; }
}
