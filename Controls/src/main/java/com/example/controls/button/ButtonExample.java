package com.example.controls.button;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ButtonExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);

        //TODO: Create news components here
        /// Button
        Button button = new Button("Click here");
        Button button2 = new Button("Other");
        Rectangle rectangle = new Rectangle(20, 20, Color.CYAN);
        button2.setGraphic(rectangle);
        vBox.getChildren().addAll(button2, button);
        button.setCancelButton(true);
        button.setOnAction(actionEvent -> {
            System.out.println("Quiting Program");
            Platform.exit();
        });
        Scene scene = new Scene(vBox, 500, 450);

        stage.setTitle("Controls: Button Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
