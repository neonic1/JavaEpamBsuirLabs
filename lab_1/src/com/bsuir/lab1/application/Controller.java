package com.bsuir.lab1.application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import java.util.Scanner;

public class Controller {
    private View view = new View();
    private Model model = new Model();

    private int[] checkParameters(String width, String height, String length) {
        if(width.isEmpty() || height.isEmpty() || length.isEmpty()) {
            view.unsetWarningMessages();
            view.setWarningMessageEmptyField();
        }
        else {
            Scanner widthScanner = new Scanner(width);
            Scanner heightScanner = new Scanner(height);
            Scanner lengthScanner = new Scanner(length);
            if (widthScanner.hasNextInt() && heightScanner.hasNextInt() && lengthScanner.hasNextInt()) {
                int[] params = new int[3];
                params[0] = widthScanner.nextInt();
                params[1] = heightScanner.nextInt();
                params[2] = lengthScanner.nextInt();
                return params;
            } else {
                view.unsetWarningMessages();
                view.setWarningMessageWrongInput();
            }
        }
        return null;
    }
    private EventHandler<ActionEvent> areaCalculationButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            String width = view.getWidth();
            String height = view.getHeight();
            String length = view.getLength();
            int[] params;
            params = checkParameters(width, height, length);
            if(params != null) {
                view.unsetWarningMessages();
                view.setArea(model.areaCalculation(params));
            }
        }
    };
    private EventHandler<ActionEvent> perimeterCalculationButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            String width = view.getWidth();
            String height = view.getHeight();
            String length = view.getLength();
            int[] params;
            params = checkParameters(width, height, length);
            if(params != null) {
                view.unsetWarningMessages();
                view.setPerimeter(model.perimeterCalculation(params));
            }
        }
    };

    public Controller(){
        view.setAreaCalculationButtonHandler(areaCalculationButtonActionEvent);
        view.setPerimeterCalculationButtonHandler(perimeterCalculationButtonActionEvent);
    }

    public void setViewPane(Pane pane){view.setPane(pane);}
}
