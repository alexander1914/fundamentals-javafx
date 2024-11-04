package com.example.controls.tabpane;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TabPaneExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane borderPane = new BorderPane();

        //TODO: Create new components here
        TabPane pane = new TabPane();
        Tab one = new Tab("One");
        Tab two = new Tab("Two");
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(new Label("Content for Tab One"));
        VBox vBoxTwo = new VBox();
        vBoxTwo.setAlignment(Pos.CENTER);
        vBoxTwo.getChildren().addAll(new Button("Content Two"));
        one.setContent(vBox);
        two.setContent(vBoxTwo);
        pane.getTabs().addAll(one, two);
        borderPane.setCenter(pane);

        Scene scene = new Scene(borderPane, 500, 450);
        stage.setTitle("Controls: Tab Pane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
