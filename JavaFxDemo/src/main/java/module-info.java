module org.example.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens org.example.javafxdemo to javafx.fxml;
    exports org.example.javafxdemo;
}