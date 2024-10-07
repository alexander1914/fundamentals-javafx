package com.example.eventseventhandling;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //TODO: Definition para the VBOX
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);

        //TODO: Create new components
        Label label = new Label("This is Label");
        Button button = new Button("Click me: ");

        //TODO: Events Handling
        button.addEventFilter(MouseEvent.MOUSE_CLICKED,
                mouseEvent -> label.setText("Thank you for clicking the button..."));

        ///root.addEventFilter(MouseEvent.MOUSE_CLICKED, Event::consume);/// Lambda expression java

        root.addEventFilter(MouseEvent.MOUSE_CLICKED,
                mouseEvent -> System.out.println("Event at the root.."));

        root.getChildren().addAll(label, button);

        //TODO: Settings definition
        Scene scene = new Scene(root, 500, 450);

        //TODO: Events Handling
        scene.setOnMouseMoved(mouseEvent -> label.setText("X: " + mouseEvent.getX() + " | Y " + mouseEvent.getY()));
        scene.setOnKeyPressed(keyEvent -> label.setText(keyEvent.getText()));
        stage.setScene(scene);
        stage.setOnShowing(windowEvent -> System.out.println("Stage is showing..."));

        stage.setTitle("Events - Handling");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
