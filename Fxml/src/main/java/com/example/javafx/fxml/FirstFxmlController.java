package com.example.javafx.fxml;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FirstFxmlController {
    @FXML
    private Label text;

    @FXML
    protected void showMessage() {
        text.setText("At the moment, I am learning more about [FXML] with Java");
    }
}