package com.example.concurrency.task;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.concurrent.ScheduledService;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TaskExample extends Application {
    Button startBtn = new Button("Start");
    Button resetBtn = new Button("Reset");
    Button cancelBtn = new Button("Cancel");
    Button exitBtn = new Button("Exit");
    Boolean onceStarted = false;

    //TODO: Creating a new ScheduledService this application
    ScheduledService<ObservableList<Integer>> service = new ScheduledService<ObservableList<Integer>>() {
        @Override
        protected Task<ObservableList<Integer>> createTask() {
            return new EvenNumTask(1, 20, 100);
        }
    };

    @Override
    public void start(Stage stage) {
        service.setPeriod(Duration.seconds(5));

        startBtn.setOnAction(e -> {
            if (onceStarted){
                service.restart();
            }else {
                service.start();
                onceStarted = true;
                startBtn.setText("Restart");
            }
        });
        cancelBtn.setOnAction(e -> service.cancel());
        resetBtn.setOnAction(e -> service.reset());
        exitBtn.setOnAction(e -> stage.close());

        GridPane pane = new WorkerUI(service);
        HBox hBox = new HBox(5, startBtn, resetBtn, cancelBtn, exitBtn);
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
