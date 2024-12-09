package com.example.javafx.fxml;

import com.example.javafx.fxml.controllers.PreConstructedController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppPreControllerExample extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //TODO: FXMLLoader is to load your fxml page.
        FXMLLoader fxmlLoader = new FXMLLoader(FirstFxmlExample.class
                .getResource("pre-constructed-controller.fxml"));

        //TODO: Controller Pre_Constructed example
        PreConstructedController preConstructedController = new PreConstructedController("Hi, Java Fx");
        fxmlLoader.setController(preConstructedController);

        Scene scene = new Scene(fxmlLoader.load(), 600, 240);
        stage.setTitle("Example FXML: ");
        stage.setScene(scene);
        stage.show();
    }
}
