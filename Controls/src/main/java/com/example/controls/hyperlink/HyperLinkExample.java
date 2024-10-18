package com.example.controls.hyperlink;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HyperLinkExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);

        //TODO: Create new components here:
        Hyperlink link = new Hyperlink("GitHub");
        Hyperlink link2 = new Hyperlink("YouTube");

        hBox.getChildren().addAll(link, link2);

        Scene scene = new Scene(hBox, 500, 450);
        stage.setTitle("Controls: HyperLink Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
