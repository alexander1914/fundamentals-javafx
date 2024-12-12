package com.example.gridpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        /**
         * Settings for the layout
         */
        GridPane gridPane = new GridPane();
        ///gridPane.setGridLinesVisible(true);
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        /**
         * Create new components your application
         * This a example a form with JX
         */
        Label label = new Label("First Name: ");
        TextField textField = new TextField();
        Button button = new Button("COMMENT");
        TextArea textArea = new TextArea();
        textArea.setPromptText("Enter your message here:");

        gridPane.addRow(0, label, textField, button);
        gridPane.add(textArea, 0, 1, GridPane.REMAINING, 1);

        /**
         * Another example about AddRows and AddColumn
         */

        ///Button b1 = new Button("One");
        ///Button b2 = new Button("Two");
        ///Button b3 = new Button("Three");
        //TODO: AddRows
        ///gridPane.addRow(0, b1, b2);
        ///gridPane.add(b3,0, 1);
        //TODO: AddColumn
        ///gridPane.addColumn(2, b1, b3);
        ///gridPane.addRow(2, b2);

        gridPane.setStyle("-fx-padding: 10;"+"-fx-border-style: solid inside;"+"-fx-width: 2;"
                +"-fx-border-insets: 5;"+"-fx-border-radius: 5;"+"-fx-border-color:blue;");

        Scene scene = new Scene(gridPane);
        stage.setTitle("Grid Pane Layout Example: ");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
