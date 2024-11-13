package com.example.controls.listview;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListViewExample2 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);

        //TODO: Create new components here
        ListView<Task> taskListView = new ListView<>();
        ObservableList<Task> tasks = FXCollections.observableArrayList(
                new Task("Create Java Project"),
                new Task("Create Bug Report"),
                new Task("Commit changes to repo")
        );
        taskListView.setCellFactory(taskListView1 -> new CustomTaskCell());
        taskListView.getItems().addAll(tasks);
        vBox.getChildren().addAll(taskListView);

        Scene scene = new Scene(vBox, 500, 450);
        stage.setScene(scene);
        stage.setTitle("ListView Control Example: ");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
