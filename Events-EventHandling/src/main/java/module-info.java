module com.example.eventseventhandling {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.eventseventhandling to javafx.fxml;
    exports com.example.eventseventhandling;
}