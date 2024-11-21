package com.example.controls.listview;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListViewExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox(10);
        vBox.setAlignment(Pos.CENTER);

        //TODO: Create new components here
        Label label = new Label();
        Button button = new Button("Select Firs");
        ListView<String> listView = new ListView<>();
        ObservableList<String> names = FXCollections.observableArrayList("Lina", "Bruna", "Dani");
        ///listView.setOrientation(Orientation.HORIZONTAL);
        ///listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        listView.getSelectionModel().selectedItemProperty().addListener(observable ->
                label.setText(listView.getSelectionModel().getSelectedItem()));
        listView.getItems().addAll(names);
        button.setOnAction(actionEvent -> listView.getSelectionModel().selectLast());
        vBox.getChildren().addAll(listView, label, button);
        Scene scene = new Scene(vBox, 500, 250);
        stage.setScene(scene);
        stage.setTitle("Controls: List View Example 1: ");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
