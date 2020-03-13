package com.bsuir.lab2.human;

import java.util.Random;

public class Programmer extends Human{
    private final static int rndMax = 30;
    private final static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZacdefghijklmnopqrstuvwyz1234567890{}.<>!=()/*-+[]";

    public Programmer(String name) { super(name); }

    public String writeCode() {
        StringBuilder randomCodeBuilder = new StringBuilder();
        Random rnd = new Random();
        int randomStringSize = (int) (rnd.nextFloat() * rndMax);
        while(randomCodeBuilder.length() < randomStringSize) {
            int index = (int)(rnd.nextFloat() * alphabet.length());
            randomCodeBuilder.append(alphabet.charAt(index));
        }
        String randomCode = randomCodeBuilder.toString();
        randomCode += "\n";
        return randomCode;
    }
}
