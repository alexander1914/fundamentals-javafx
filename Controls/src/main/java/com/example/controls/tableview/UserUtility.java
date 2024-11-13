package com.example.controls.tableview;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

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
        return bDateCol;
    }
}
