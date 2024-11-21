package com.example.hbox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class HboxExample extends Application {
    @Override
    public void start(Stage stage) {
        //TODO: HBOX settings definition to layout
        HBox hBox = new HBox(10);
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.setFillHeight(false);

        //TODO: Create new components here:
        Label label = new Label("Hello world");
        TextArea textArea = new TextArea();
        HBox.setHgrow(textArea, Priority.ALWAYS);
        HBox.setMargin(textArea, new Insets(0, 10, 0, 10));
        hBox.getChildren().addAll(label, textArea);

        Scene scene = new Scene(hBox, 700, 500);
        stage.setScene(scene);
        stage.setTitle("Hbox Layout Example: ");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
