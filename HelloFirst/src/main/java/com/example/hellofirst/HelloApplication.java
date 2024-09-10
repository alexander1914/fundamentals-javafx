package com.example.hellofirst;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Java FX Application");
        stage.setScene(scene);
        stage.show();

        // TODO: I am creating a new VBOX another way
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20,20,20,20));
        root.setSpacing(20);
        Label text = new Label("");
        Button button = new Button("Click me ...");
        button.setOnAction(e -> text.setText("Welcome to JavaFX Application"));
        root.getChildren().addAll(text, button);

        /*
        Scene scene2 = new Scene(root, 350, 300);
        stage.setScene(scene2);
        stage.show();
        */
    }

    public static void main(String[] args) {
        launch();
    }
}