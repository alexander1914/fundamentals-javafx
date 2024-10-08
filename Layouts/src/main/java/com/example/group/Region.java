package com.example.group;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.stage.Stage;

public class Region extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();

        //TODO: Create new components here
        Button button1 = new Button("Button 1: ");
        Button button2 = new Button("Button 2: ");

        button1.setLayoutX(50);
        button1.setLayoutY(10);
        button2.layoutXProperty().bind(button1.layoutXProperty().add(button1.widthProperty().add(10)));
        button2.layoutXProperty().bind(button1.layoutXProperty());

        group.setEffect(new DropShadow());
        group.setRotate(10);
        group.getChildren().addAll(button1, button2);

        Scene scene = new Scene(group, 350, 300);
        stage.setTitle("Group Layout Example: ");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
