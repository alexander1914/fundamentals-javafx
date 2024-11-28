package com.example.concurrency.task;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TaskExample extends Application {
    Button startBtn = new Button("Start");
    Button cancelBtn = new Button("Cancel");
    Button exitBtn = new Button("Exit");

    EvenNumTask task = new EvenNumTask(1, 20, 1000);

    @Override
    public void start(Stage stage) {
        startBtn.setOnAction(e -> {
            Thread bgThread = new Thread(task);
            bgThread.setDaemon(true);
            bgThread.start();
        });
        cancelBtn.setOnAction(e -> task.cancel());
        exitBtn.setOnAction(e -> stage.close());

        GridPane pane = new WorkerUI(task);
        HBox hBox = new HBox(5, startBtn, cancelBtn, exitBtn);
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(hBox);

        Scene scene = new Scene(borderPane, 700, 550);
        stage.setScene(scene);
        stage.setTitle("Testing a task now: ");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
