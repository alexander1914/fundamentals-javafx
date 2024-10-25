package com.example.controls.choicebox;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChoiceBoxExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setAlignment(Pos.CENTER);

        //TODO: Create new components here
        Label label = new Label("Your Direction: ");
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        ObservableList<String> observableList =
                FXCollections.observableArrayList("North", "South", "East", "West");
        choiceBox.getItems().addAll(observableList);
        choiceBox.getSelectionModel().selectFirst();
        choiceBox.getSelectionModel().selectedItemProperty()
                .addListener(observable -> label.setText("Your Direction is: " + choiceBox.getSelectionModel()
                        .getSelectedItem()));
        vbox.getChildren().addAll(label, choiceBox);

        Scene scene = new Scene(vbox, 500, 450);
        stage.setTitle("Controls: Choice Box");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
