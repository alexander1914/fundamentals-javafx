package com.example.controls.label;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.awt.*;

public class LabelExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);

        //TODO Create news components here
        /// Label
        Label label = new Label("First Label");
        Rectangle rectangle = new Rectangle(20, 20, Color.RED);
        label.setGraphic(rectangle);
        label.setUnderline(true);
        label.setFont(Font.font("Arial", FontWeight.BOLD, 18));
        label.setTextFill(Color.GREEN);
        vBox.getChildren().addAll(label);

        Scene scene = new Scene(vBox, 500, 450);
        stage.setTitle("Controls: Label Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
