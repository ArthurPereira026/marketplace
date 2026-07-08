module com.arthur.marketplace {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.arthur.marketplace to javafx.fxml;
    exports com.arthur.marketplace;
}