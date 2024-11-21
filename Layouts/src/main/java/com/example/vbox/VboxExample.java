package com.example.vbox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VboxExample extends Application {
    @Override
    public void start(Stage stage) {
        //TODO: VBox settings definition to layout
        VBox vBox = new VBox();
        vBox.setSpacing(10);
        vBox.setAlignment(Pos.CENTER);
        vBox.setFillWidth(true);

        //TODO: Create new components here
        TextArea textArea = new TextArea();
        VBox.setVgrow(textArea, Priority.ALWAYS);
        VBox.setMargin(textArea, new Insets(0, 10, 0, 10));
        vBox.getChildren().add(textArea);
        Scene scene = new Scene(vBox, 500, 450);

        stage.setScene(scene);
        stage.setTitle("VBOx Layout Example: ");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
