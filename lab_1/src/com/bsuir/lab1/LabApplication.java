package com.bsuir.lab1;

import com.bsuir.lab1.application.Controller;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LabApplication extends javafx.application.Application {
    private final static int windowWidth = 400;
    private final static int windowHeight = 250;
    private final static String windowName = "Lab 1";
    private Controller controller = new Controller();

    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();
        controller.setViewPane(pane);
        Group root = new Group(pane);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle(windowName);
        stage.setWidth(windowWidth);
        stage.setHeight(windowHeight);
        stage.show();
    }
}
