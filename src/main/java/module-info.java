module com.example.website {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.website to javafx.fxml;
    exports com.example.website;
}