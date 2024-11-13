module com.example.controls {
    //TODO: Module is responsible to management the classes Java FX

    //TODO: Imports your dependencies to work with Java FX here
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
    exports com.example.controls.combobox;
    exports com.example.controls.colorpicker;
    exports com.example.controls.datepicker;
    exports com.example.controls.slider;
    exports com.example.controls.menu;
    exports com.example.controls.tabpane;
    exports com.example.controls.listview;
    exports com.example.controls.tableview;
}