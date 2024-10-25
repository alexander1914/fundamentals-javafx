module com.example.controls {
    //TODO: Imports your dependencies here
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    //TODO: Always to create new class settings your package here
    exports com.example.controls.label;
    exports com.example.controls.button;
    exports com.example.controls.hyperlink;
    exports com.example.controls.menubutton;
    exports com.example.controls.togglebutton;
    exports com.example.controls.radiobutton;
    exports com.example.controls.checkbox;
    exports com.example.controls.choicebox;
}