package com.example.concurrency.indroduction;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ConcurrencyExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox(10);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(5);

        Scene scene = new Scene(vBox, 500, 450);
        stage.setScene(scene);
        stage.setTitle("Concurrency Example: ");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
