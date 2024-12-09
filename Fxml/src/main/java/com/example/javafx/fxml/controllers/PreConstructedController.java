package com.example.javafx.fxml.controllers;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class PreConstructedController implements Initializable {
    public String message;
    public Label lbl_message;
    public Button btn_message;

    public PreConstructedController(String message){
        this.message = message;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btn_message.setOnAction(e -> lbl_message.setText("Welcome Controller FirstFxmlController: " + message));
    }
}
