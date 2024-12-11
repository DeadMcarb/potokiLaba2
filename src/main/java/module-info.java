module org.example.potokilaba {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.potokilaba to javafx.fxml;
    exports org.example.potokilaba;
}