module com.example.javafx.fxml {
    requires javafx.controls;
    requires javafx.fxml;

    //TODO: The settings all class to use your project
    opens com.example.javafx.fxml to javafx.fxml;
    exports com.example.javafx.fxml;
}