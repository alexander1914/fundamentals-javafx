package com.example.stackpane;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class StackPaneExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //TODO StackPane settings definition to layout
        StackPane stackPane = new StackPane();
        Rectangle rectangle = new Rectangle(300, 250);
        rectangle.setFill(Color.GREEN);

        //TODO Create new components here:
        Label label = new Label("The Rectangle");
        stackPane.setAlignment(label, Pos.TOP_LEFT);
        stackPane.getChildren().addAll(rectangle, label);
        Scene scene = new Scene(stackPane, 400, 350);
        stage.setTitle("StackPane Layout Example: ");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
