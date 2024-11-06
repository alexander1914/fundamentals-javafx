package com.example.controls.combobox;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ComboBoxExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);

        //TODO: Create new components here
        ///Option one with ComboBox
        /*
        Label label = new Label("My Squad names: ");
        ComboBox<String> names = new ComboBox<>();
        names.setPromptText("Please you choice a name: ");
        names.setEditable(true);
        ObservableList<String> namesList =
                FXCollections.observableArrayList("Alexander", "Rafael", "Rodrigo", "Daniel", "Marcelo");
        names.getItems().addAll(namesList);
        names.getSelectionModel().selectedItemProperty()
                .addListener(o -> label.setText("You chosen: " + names.getSelectionModel().getSelectedItem()));
         */
        ///Option two with ComboBox
        /*
        ComboBox<HBox> mysquad = new ComboBox<>();
        mysquad.getItems().addAll(new HBox(
                new Line(0, 10, 20, 10), new Label(" Alexander")),
                new HBox(new Rectangle(0, 0 , 20, 20), new Label(" Rodrigo")),
                new HBox(new Circle(20, 20, 10), new Label(" Daniel"))
        );
         */

        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Alexander", "Daniel", "Rodrigo");
        comboBox.setCellFactory(listView -> new ShapeNameCell());
        comboBox.setButtonCell(new ShapeNameCell());

        vBox.getChildren().addAll(comboBox);
        Scene scene = new Scene(vBox, 500, 450);
        vBox.requestFocus();

        stage.setScene(scene);
        stage.setTitle("Controls: ComboBox Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
