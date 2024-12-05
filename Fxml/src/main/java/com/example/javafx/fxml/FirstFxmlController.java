package com.example.javafx.fxml;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FirstFxmlController {

    //TODO: These are annotations to use the components your project
    @FXML
    private Label text;

    @FXML
    protected void showMessage() {
        text.setText("At the moment, I am learning more about [FXML] with Java");
    }
}