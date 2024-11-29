module com.example.javafx.fxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx.fxml to javafx.fxml;
    exports com.example.javafx.fxml;
}