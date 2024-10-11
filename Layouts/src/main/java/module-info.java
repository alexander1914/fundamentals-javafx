module com.example.layouts {
    requires javafx.controls;
    requires javafx.fxml;

    //TODO: Always to create new class settings your package here
    opens com.example.layouts to javafx.fxml;
    exports com.example.layouts;
    exports com.example.group;
    exports com.example.hbox;
    exports com.example.vbox;
    exports com.example.flowpane;
    exports com.example.borderpane;
    exports com.example.stackpane;
    opens com.example.group to javafx.fxml;
}