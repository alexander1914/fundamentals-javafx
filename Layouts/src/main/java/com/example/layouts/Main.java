package com.example.layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        //TODO: Layout definitions to layout here
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);

        //TODO: Create new Components here
        Label label = new Label("Learning more about layout...");
        Button button = new Button("Click the button me now:");
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> label.setText("PALMEIRAS TEM MUNDIAL SIM..."));

        //TODO: Layout definitions to components here
        button.setPrefWidth(100);
        button.setPadding(new Insets(0,0, 0, 60));
        root.getChildren().addAll(label, button);

        //TODO: Settings
        Scene scene = new Scene(root, 500, 450);
        stage.setScene(scene);
        stage.setTitle("Learning layouts");
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
