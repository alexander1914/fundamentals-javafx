package com.example.controls.combobox;

import javafx.scene.control.ListCell;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

import java.awt.*;

public class ShapeNameCell extends ListCell<String> {
    @Override
    public void updateItem(String item, boolean empty){
        super.updateItem(item, empty);
        if (empty){
            setText(null);
            setGraphic(null);
        }else{
            setText(item);
            Shape shape = this.getShape(item);
            setGraphic(shape);
        }
    }

    public Shape getShape(String name){
        Shape shape = null;
        switch (name){
            case "Alexander":
                shape = new Line(0, 10, 20, 10);
                break;

            case "Daniel":
                shape = new Rectangle(0, 0, 20, 20);
                break;

            case "Rodrigo":
                shape = new Circle(20, 20, 10);
                break;

            default:
                shape = null;
        }
        return shape;
    }
}
