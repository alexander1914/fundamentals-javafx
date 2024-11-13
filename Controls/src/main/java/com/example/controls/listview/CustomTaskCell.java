package com.example.controls.listview;

import javafx.scene.control.CheckBox;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class CustomTaskCell extends ListCell<Task> {
    @Override
    public void updateItem(Task item, boolean empty) {
        super.updateItem(item, empty);
        if (empty){
            setText(null);
            setGraphic(null);
        }else {
            CheckBox checkBox = new CheckBox();
            Text text = new Text(item.getTask());
            HBox cell = new HBox(10, checkBox, text);
            checkBox.selectedProperty().addListener(observable -> {
                if (checkBox.isSelected()){
                    text.setStyle("-fx-strikethrough: true");
                }else {
                    text.setStyle("-fx-strikethrough: false");
                }
            });
            setText(null);
            setGraphic(cell);
        }
    }
}
