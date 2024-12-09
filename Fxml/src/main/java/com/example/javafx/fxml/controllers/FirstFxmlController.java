package com.example.javafx.fxml.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class FirstFxmlController implements Initializable {

    //TODO: These are annotations to use the components your project
    @FXML
    private Label text;
    @FXML
    private Label count_lbl;

    public int count;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        count = 0;
        count_lbl.setText("Count: " + count);
    }

    @FXML
    protected void showMessage() {
        text.setText("At the moment, I am learning more about [FXML] with Java");
    }

    @FXML
    protected void onIncrement(){
        count++;
        count_lbl.setText("Count: " + count);
    }
}