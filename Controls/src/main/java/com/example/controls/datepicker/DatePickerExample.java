package com.example.controls.datepicker;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DatePickerExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);

        //TODO: Create new components here
        Label date = new Label();
        DatePicker datePicker = new DatePicker();
        datePicker.setEditable(true);
        datePicker.setOnAction(actionEvent -> date.setText(datePicker.getValue().toString()));
        vBox.getChildren().addAll(date, datePicker);
        Scene scene = new Scene(vBox, 500, 450);

        stage.setTitle("Controls: DatePicker Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
