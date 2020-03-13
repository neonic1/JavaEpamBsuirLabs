package com.bsuir.lab1.application;

public class Model {

    public int areaCalculation(int[] params) {
        int halfArea = params[0]*params[1] + params[0]*params[2] + params[1]*params[2];
        if(params[0] == 0 || params[1] == 0 || params[2] == 0)
            return halfArea;
        return (2 * halfArea);
    }
    public int perimeterCalculation(int[] params) {
        int quarterPerimeter = params[0] + params[1] + params[2];
        int missingSidesCounter = 0;
        for(int i = 0; i < 3; i++){ if(params[i] == 0) missingSidesCounter++; }
        if(missingSidesCounter == 2) return quarterPerimeter;
        if(params[0] == 0 || params[1] == 0 || params[2] == 0)
            return (2 * quarterPerimeter);
        return (4 * quarterPerimeter);
    }
}
