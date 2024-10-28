package com.example.controls.colorpicker;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ColorPickerExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox(10);
        vBox.setAlignment(Pos.CENTER);

        //TODO: Create new components here:
        ColorPicker colorPicker = new ColorPicker();
        colorPicker.setOnAction(actionEvent ->
                vBox.setBackground(new Background(new BackgroundFill(colorPicker.getValue(),
                        CornerRadii.EMPTY, Insets.EMPTY))));
        vBox.getChildren().addAll(colorPicker);

        Scene scene = new Scene(vBox, 500, 450);
        stage.setTitle("Controls: Color Picker");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
