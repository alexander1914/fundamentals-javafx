package com.example.borderpane;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //TODO: BorderPane settings definition to layout
        BorderPane borderPane = new BorderPane();
        //TODO: Left Nodes
        ListView<String> titles = new ListView<String>();
        ObservableList<String> items = FXCollections.observableArrayList();
        items.add("Libertadores 20");
        items.add("Super Copa Do Brasil 21");
        items.add("Recopa 21");
        titles.setItems(items);

        //TODO Create new components here:
        Label topLabel = new Label("Titles Abel Ferreira on Palmeiras:");
        topLabel.setPadding(new Insets(10));
        //TODO Button
        Label bottonLabel = new Label("Recently Added Fruit: Nome");
        bottonLabel.setPadding(new Insets(10));
        //TODO Right
        Label rightLabel = new Label("Total number of titles: ");
        rightLabel.setRotate(90);
        rightLabel.setPadding(new Insets(0, 0, 0, 60));
        //TODO Center Nodes
        TextField textField = new TextField();
        Button button = new Button("Add: ");
        HBox centerContainer = new HBox(10, textField, button);

        //TODO: Settings borderPane
        borderPane.setTop(topLabel);
        borderPane.setRight(rightLabel);
        borderPane.setBottom(bottonLabel);
        borderPane.setLeft(titles);
        borderPane.setCenter(centerContainer);

        //TODO: Event Handler
        button.setOnMouseClicked(mouseEvent -> {
            String item = textField.getText();
            items.add(item);
            bottonLabel.setText(STR."Title recently wom by Abel Ferreira now: \{item}");
            rightLabel.setText(STR."Total Number titles: \{titles.getItems().size()}");
            textField.clear();
        });
        Scene scene = new Scene(borderPane, 700, 650);
        stage.setScene(scene);
        stage.setTitle("Border Pane Layout Example: ");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
