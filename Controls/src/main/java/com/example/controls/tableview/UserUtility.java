package com.example.controls.tableview;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.LocalDateStringConverter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserUtility {
    public static ObservableList<User> getUsersList(){
        return FXCollections.observableArrayList(
                new User("Alexander", "Oliveira", LocalDate.of(1990, 07, 24)),
                new User("Nathália", "Silva", LocalDate.of(1997, 12, 22)),
                new User("Safira", "Vargas", LocalDate.of(2018, 01, 01))
        );
    }

    public static TableColumn<User, String> getFirstNameColumn(){
        TableColumn<User, String> fNameCol = new TableColumn<>("First Name");
        fNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        fNameCol.setCellFactory(TextFieldTableCell.forTableColumn());
        fNameCol.setOnEditCommit(editEvent -> {
            editEvent.getRowValue().setFirstName(editEvent.getNewValue());
            System.out.println(editEvent.getRowValue());
        });
        return fNameCol;
    }

    public static TableColumn<User, String> getLastNameColumn(){
        TableColumn<User, String> lNameCol = new TableColumn<>("Last Name");
        lNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        return lNameCol;
    }

    public static TableColumn<User, LocalDate> getBirthDateColumn(){
        TableColumn<User, LocalDate> bDateCol = new TableColumn<>("Birth Date");
        bDateCol.setCellValueFactory(new PropertyValueFactory<>("birthDate"));

        String pattern = "yyy-MM-dd";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDateStringConverter stringConverter = new LocalDateStringConverter(formatter, null);

        bDateCol.setCellFactory(TextFieldTableCell.forTableColumn(stringConverter));
        bDateCol.setOnEditCommit(editEvent -> {
            editEvent.getRowValue().setBirthDate(editEvent.getNewValue());
            System.out.println(editEvent.getRowValue());
        });
        return bDateCol;
    }

    public static TableColumn<User, Button> getDeleteUserColumn(){
        TableColumn<User, Button> dUserCol = new TableColumn<>("Actions");
        dUserCol.setCellFactory(userButtonTableColumn -> new TableCell<>(){
            @Override
            protected void updateItem(Button item, boolean empty) {
                super.updateItem(item, empty);
                setText(null);
                setGraphic(null);
                if(!empty){
                    Button button = new Button("Delete");
                    button.setOnAction(actionEvent -> {
                        int rowIndex = this.getTableRow().getIndex();
                        this.getTableView().getItems().remove(rowIndex);
                    });
                    setText(null);
                    setGraphic(button);
                }
            }
        });
        return dUserCol;
    }

}
