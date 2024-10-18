package com.example.controls.menubutton;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MenuButtonExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);

        //TODO: Create new components here
        MenuButton menuButton = new MenuButton("Sites");
        MenuItem menuItem1 = new MenuItem("GitHub");
        MenuItem menuItem2 = new MenuItem("YouTube");
        menuItem1.setOnAction(actionEvent -> System.out.println("Visiting Git.com"));
        menuItem2.setOnAction(actionEvent -> System.out.println("Visiting YouTube.com"));
        menuButton.getItems().addAll(menuItem1, menuItem2);

        hBox.getChildren().addAll(menuButton);
        Scene scene = new Scene(hBox, 500, 450);

        stage.setTitle("Controls: MenuButton Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
