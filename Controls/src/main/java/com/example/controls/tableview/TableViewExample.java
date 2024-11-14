package com.example.controls.tableview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TableViewExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();

        //TODO: Create new components here
        TableView<User> userTableView = new TableView<>(UserUtility.getUsersList());
        userTableView.setEditable(true);
        userTableView.getColumns().addAll(
                UserUtility.getFirstNameColumn(),
                UserUtility.getLastNameColumn(),
                UserUtility.getBirthDateColumn(),
                UserUtility.getDeleteUserColumn()
        );
        vBox.getChildren().addAll(userTableView);

        Scene scene = new Scene(vBox, 500, 400);
        stage.setTitle("TableView Controls Example: ");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
