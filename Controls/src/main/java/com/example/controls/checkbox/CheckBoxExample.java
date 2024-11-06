package com.example.controls.checkbox;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxExample extends Application {

    Label answer;
    CheckBox checkBox;

    @Override
    public void init() throws Exception {
        answer = new Label("Your answer: None");
        checkBox = new CheckBox("Choice");
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);

        //TODO: Create new components here:
        Label question = new Label("Do you like to learn Java FX framework");
        checkBox.setAllowIndeterminate(true);
        checkBox.selectedProperty().addListener(this::changed);
        checkBox.indeterminateProperty().addListener(this::changed);
        Scene scene = new Scene(vBox, 500, 450);
        vBox.getChildren().addAll(answer, question, checkBox);

        stage.setTitle("Controls: CheckBox Example");
        stage.setScene(scene);
        stage.show();
    }

    public void changed(ObservableValue<? extends Boolean> observableValue, Boolean oldVal, Boolean newVal){
        String choice;

        if (checkBox.isIndeterminate()){
            choice = "Neutral";
        }else if (checkBox.isSelected()){
            choice = "Agree";
        }else {
            choice = "Disagree";
        }
        answer.setText("Your Answer: " + choice);
    }

    public static void main(String[] args) {
        launch();
    }
}
