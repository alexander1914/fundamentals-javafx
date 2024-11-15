package com.example.controls.treeview;

import javafx.application.Application;
import javafx.event.Event;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TreeViewExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox(10);
        vBox.setAlignment(Pos.CENTER);

        //TODO: Create new components here
        TreeView<String> treeView = new TreeView<>();
        TreeItem<String> classes = new TreeItem<>("Classes");
        TreeItem<String> classOne = new TreeItem<>("Class One");
        classOne.setExpanded(true);
        classOne.getChildren().addAll(
                new TreeItem<>("Alexander"),
                new TreeItem<>("Nathalia"),
                new TreeItem<>("Phelipe"),
                new TreeItem<>("Larisse"),
                new TreeItem<>("Welligton"),
                new TreeItem<>("Carla")

        );
        TreeItem<String> classTwo = new TreeItem<>("Class Two");
        classTwo.getChildren().addAll(
          new TreeItem<>("Antonio"),
          new TreeItem<>("Adenir")
        );
        classTwo.addEventHandler(TreeItem.branchExpandedEvent(), e -> System.out.println(e.getTreeItem().getValue()));
        classes.getChildren().addAll(classOne, classTwo);
        treeView.setRoot(classes);
        treeView.setShowRoot(false);
        treeView.setCellFactory(cell -> {
            TreeCell<String> treeCell = new TreeCell<>(){
                @Override
                public void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    setText(null);
                    setGraphic(null);
                    if (!empty){
                        if (this.getTreeItem().getValue().equals("Antonio")){
                            setText(item);
                            setGraphic(new Rectangle(15, 15, Color.BLUE));
                        }else {
                            setText(item);
                            setGraphic(new Rectangle(15, 15, Color.PINK));
                        }
                    }
                }
            };
            return treeCell;
        });
        vBox.getChildren().addAll(treeView);

        Scene scene = new Scene(vBox, 500, 450);
        stage.setScene(scene);
        stage.setTitle("TreeView Control Example: ");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
