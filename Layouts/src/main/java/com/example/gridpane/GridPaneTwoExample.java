package com.example.gridpane;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class GridPaneTwoExample extends Application {

    @Override
    public void start(Stage stage) {
        /**
         * Settings about your Layout
         */
        GridPane gridPane = new GridPane();
        gridPane.setGridLinesVisible(true);

        /**
         * This part to create your new components your application
         * Columns and Rows (@ColumnConstraints, @)
         */
        for (int row = 0; row < 3;  row++){
            for (int col = 0; col < 3; col++){
                Button button = new Button(STR."\{col} | \{row}");
                gridPane.add(button, col, row);
            }
        }

        ColumnConstraints cc1 = new ColumnConstraints(100);
        cc1.setHalignment(HPos.LEFT);
        ColumnConstraints cc2 = new ColumnConstraints(200);
        cc2.setHalignment(HPos.CENTER);
        ColumnConstraints cc3 = new ColumnConstraints(200);
        cc3.setHalignment(HPos.RIGHT);

        RowConstraints rc1 = new RowConstraints(50);
        rc1.setValignment(VPos.TOP);
        RowConstraints rc2 = new RowConstraints(70);
        rc2.setValignment(VPos.CENTER);
        RowConstraints rc3 = new RowConstraints(60);
        rc3.setValignment(VPos.BOTTOM);

        gridPane.getColumnConstraints().addAll(cc1, cc2, cc3);
        gridPane.getRowConstraints().addAll(rc1, rc2, rc3);

        gridPane.setStyle("-fx-padding: 10;"+"-fx-border-style: solid inside;"+"-fx-width: 2;"
                +"-fx-border-insets: 5;"+"-fx-border-radius: 5;"+"-fx-border-color:blue;");

        /**
         * Settings definitions about my application
         */
        Scene scene = new Scene(gridPane);
        gridPane.requestFocus();
        stage.setTitle("Grid Pane Layout Two Example: ");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
