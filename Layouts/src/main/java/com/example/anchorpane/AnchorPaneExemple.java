package com.example.anchorpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AnchorPaneExemple extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //TODO: AnchorPane
        AnchorPane anchorPane = new AnchorPane();
        Scene scene = new Scene(anchorPane, 500, 450);

        //TODO Create new components here
        Button buttonRigth = new Button("Button Right");
        Button buttonTopLeft = new Button("Top Left");
        AnchorPane.setBottomAnchor(buttonRigth, 10.0);
        AnchorPane.setRightAnchor(buttonRigth, 10.0);
        AnchorPane.setTopAnchor(buttonTopLeft, 20.0);
        AnchorPane.setLeftAnchor(buttonTopLeft, 50.0);

        anchorPane.getChildren().addAll(buttonTopLeft, buttonRigth);

        stage.setTitle("AnchorPane Layout Example: ");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
