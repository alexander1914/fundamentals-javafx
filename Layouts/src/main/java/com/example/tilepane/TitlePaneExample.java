package com.example.tilepane;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TitlePaneExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //TODO: Setting your layout here
        TilePane tileCenter = createTilePane(Pos.CENTER);
        TilePane tileLeft = createTilePane(Pos.CENTER_LEFT);
        HBox hBox = new HBox(10, tileCenter, tileLeft);

        //TODO: Create new components here

        //TODO: Settings
        Scene scene = new Scene(hBox, 300, 250);
        stage.setTitle("Layouts: TitledPane Example");
        stage.setScene(scene);
        stage.show();
    }

    private TilePane createTilePane(Pos tileAlignment) {
        Button[] buttons = new Button[] {
                new Button("The"),
                new Button("Palmeiras"),
                new Button("has"),
                new Button("FIFA"),
                new Button("World"),
                new Button("club"),
                new Button(tileAlignment.toString())
        };
        TilePane pane = new TilePane(5, 5, buttons);
        pane.setTileAlignment(tileAlignment);
        pane.setPrefColumns(3);

        return pane;
    }

    public static void main(String[] args) {
        launch();
    }
}
