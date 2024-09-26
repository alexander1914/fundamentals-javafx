package com.example.propertiesbindings;

import javafx.application.Application;
import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        Employeee employeee = new Employeee("Alexander Oliveira", 100);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);

        Label label = new Label();
        Button button = new Button("Double Salary");
        button.setOnAction(e -> {
            int salary = employeee.getSalary();
            employeee.setSalary(salary * 2);
        });
        employeee.getSalaryProperty().addListener(observable -> label.setText("Name: " + employeee.getName() +
                " | Salary: " + employeee.getSalary()));
        root.getChildren().addAll(label, button);

        //TODO: Reading a Properties such as here...
        ReadOnlyIntegerWrapper numWrapper = new ReadOnlyIntegerWrapper(100);
        ReadOnlyIntegerProperty num = numWrapper.getReadOnlyProperty();

        System.out.println("NumWrapper: " + numWrapper.get());
        System.out.println("Num: " + num.get());

        numWrapper.set(1000);
        System.out.println("NumWrapper: " + numWrapper.get());

        Constant constant = new Constant(100);
        constant.changeConstant();
        System.out.println(constant.getReadOnlyNumber().get());

        Scene scene = new Scene(root, 550, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
