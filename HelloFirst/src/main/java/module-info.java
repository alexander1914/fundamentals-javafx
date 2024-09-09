module com.example.hellofirst {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hellofirst to javafx.fxml;
    exports com.example.hellofirst;
}