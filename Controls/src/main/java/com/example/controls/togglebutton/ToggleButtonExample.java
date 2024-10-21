package com.example.controls.togglebutton;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ToggleButtonExample extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        HBox seasonsLayout = new HBox();
        seasonsLayout.setAlignment(Pos.CENTER);
        seasonsLayout.setSpacing(5);

        //TODO: Create new components here
        Label label = new Label("Your Selection is: ");
        ToggleButton spring = new ToggleButton("Spring");
        ToggleButton summer = new ToggleButton("Summer");
        ToggleButton fail = new ToggleButton("Fail");
        ToggleButton winter = new ToggleButton("Winter");
        ToggleGroup seasons = new ToggleGroup();

        seasons.getToggles().addAll(spring, summer, fail, winter);
        seasonsLayout.getChildren().addAll(spring, summer, fail, winter);
        vBox.getChildren().addAll(label, seasonsLayout);
        seasons.selectedToggleProperty().addListener((observableValue, toggle, t1) -> {
            label.setText("Your Selection is: " + ((Labeled)t1).getText());
        });

        Scene scene = new Scene(vBox, 500, 450);
        stage.setTitle("Controls: ToggleButton");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
