package com.example.controls.label;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LabelExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);

        //TODO Create news components here
        /// Label
        Label label = new Label("First Label");
        vBox.getChildren().addAll(label);

        Scene scene = new Scene(vBox, 500, 450);
        stage.setTitle("Controls: Label");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
