package com.example.textflow;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class TextFlowExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //TODO: TextFlow
        TextFlow textFlow = new TextFlow();

        //TODO Create new components here:
        Text text = new Text("We are learning Java FX on Udemy");
        text.setFill(Color.GREEN);
        text.setFont(Font.font("Arial", FontWeight.BOLD, 18));

        Text paragraph = new Text("\n We are learning more about all Java FX concepts, " +
                " because we will work this framework on the project " +
                " however I think that it's fantastic to learn more frameworks with Java");
        textFlow.setLineSpacing(5);
        textFlow.setTextAlignment(TextAlignment.CENTER);
        textFlow.setPrefHeight(300);
        textFlow.getChildren().addAll(text, paragraph);

        Scene scene = new Scene(textFlow);
        stage.setScene(scene);
        stage.setTitle("TextFlow Layout Example: ");
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
