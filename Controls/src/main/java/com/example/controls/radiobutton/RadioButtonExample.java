package com.example.controls.radiobutton;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RadioButtonExample extends Application {
    Label userSelection;

    @Override
    public void init() throws Exception {
        userSelection = new Label("Your Selection: Node");
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox(10);
        vBox.setAlignment(Pos.CENTER);

        //TODO: Create new components here
        RadioButton radioButton = new RadioButton("Spring");
        RadioButton radioButton2 = new RadioButton("Summer");
        RadioButton radioButton3 = new RadioButton("Fail");
        RadioButton radioButton4 = new RadioButton("Winter");
        ToggleGroup toggleGroup = new ToggleGroup();
        toggleGroup.selectedToggleProperty().addListener(this::changed);
        toggleGroup.getToggles().addAll(radioButton, radioButton2, radioButton3, radioButton4);
        vBox.getChildren().addAll(userSelection, radioButton, radioButton2, radioButton3, radioButton4);

        Scene scene = new Scene(vBox, 500, 450);
        stage.setScene(scene);
        stage.setTitle("Controls: RadioButton Example");
        stage.show();
    }

    public void changed(ObservableValue<? extends Toggle> observableValue, Toggle oldBtn, Toggle newBtn) {
        String selectedLabel = "None";
        if (newBtn != null){
            selectedLabel = ((Labeled)newBtn).getText();
        }
        userSelection.setText("Your selection here: " + selectedLabel);
    }

    public static void main(String[] args) {
        launch();
    }
}
