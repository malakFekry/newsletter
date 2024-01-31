module com.newsletter {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.newsletter to javafx.fxml;
    exports com.newsletter;
}
