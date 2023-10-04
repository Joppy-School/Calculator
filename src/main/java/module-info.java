module com.jop.counter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jop.counter to javafx.fxml;
    exports com.jop.counter;
}