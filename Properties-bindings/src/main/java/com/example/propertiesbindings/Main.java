package com.example.propertiesbindings;

import com.example.propertiesbindings.constant.Constant;
import com.example.propertiesbindings.model.Employeee;
import javafx.application.Application;
import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);

        //TODO: Reading a Properties such as here...
        Employeee employeee = new Employeee("Alexander Oliveira", 100);

        Label label = new Label();
        Button button = new Button("Double Salary");
        button.setOnAction(e -> {
            int salary = employeee.getSalary();
            employeee.setSalary(salary * 2);
        });
        employeee.getSalaryProperty().addListener(observable -> label.setText("Name: " + employeee.getName() +
                " | Salary: " + employeee.getSalary()));
        root.getChildren().addAll(label, button);

        ReadOnlyIntegerWrapper numWrapper = new ReadOnlyIntegerWrapper(100);
        ReadOnlyIntegerProperty num = numWrapper.getReadOnlyProperty();

        System.out.println("NumWrapper: " + numWrapper.get());
        System.out.println("Num: " + num.get());

        numWrapper.set(1000);
        System.out.println("NumWrapper: " + numWrapper.get());

        Constant constant = new Constant(100, "Writing anything here...");
        constant.changeConstant();
        System.out.println(constant.getReadOnlyNumber().get());
        System.out.println(constant.getReadOnlyString().get());
        constant.changeStringWrapper();
        System.out.println(constant.getReadOnlyString().get());

        // TODO : Building example
        Label labelText = new Label("Welcome the Java FX");
        TextField textField = new TextField();
        Button button1 = new Button("Bind Label TO Field");
        ///TextField textField1 = new TextField();
        textField.setMaxWidth(200);
        button1.setOnAction(actionEvent -> labelText.textProperty().bind(textField.textProperty()));
        ///labelText.textProperty().bind(textField.textProperty());
        ///textField.textProperty().addListener((observable, oldVal, newVal) -> labelText.setText(newVal));
        labelText.textProperty().bind(textField.textProperty());
        root.getChildren().addAll(labelText, textField, button1);

        //TODO Observable Collections example
        ObservableList<String> observableList =
                FXCollections.observableArrayList("Palmeiras 99", "Palmeiras 20", "Palmeiras 21");
        ListView<String> items = new ListView<>();
        TextField textField1 = new TextField();
        textField1.setMaxWidth(200);
        Button button2 = new Button("Add new Palmeiras title here: ");
        items.setItems(observableList);
        button2.setOnAction(observable -> {
            if(!textField.textProperty().get().isEmpty()){
                observableList.add(textField1.getText());
            }
        });

        root.getChildren().addAll(items, textField1, button2);
        Scene scene = new Scene(root, 700, 700);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
