package com.example.controls.menu;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane borderPane = new BorderPane();

        //TODO: Create new components here
        MenuBar menuBar = new MenuBar();
        Menu file = new Menu("File");
        MenuItem save = new MenuItem("Save");
        MenuItem exit = new MenuItem("Exit");
        exit.setOnAction(actionEvent -> Platform.exit());

        Menu edit = new Menu("Edit");
        RadioMenuItem option = new RadioMenuItem("Options");
        RadioMenuItem settings = new RadioMenuItem("Settings");
        Menu prefs = new Menu("Preferences");
        MenuItem prefOne = new MenuItem("Pref:One");
        MenuItem preTwo = new MenuItem("Pref:Two");

        edit.getItems().addAll(option, settings, new SeparatorMenuItem(), prefs);
        prefs.getItems().addAll(prefOne, preTwo);
        file.getItems().addAll(save, exit);
        menuBar.getMenus().addAll(file, edit);
        borderPane.setTop(menuBar);

        Scene scene = new Scene(borderPane, 500, 450);
        stage.setTitle("Controls: Menu");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
