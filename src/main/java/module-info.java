module com.example.javafx_encryptor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_encryptor to javafx.fxml;
    exports com.example.javafx_encryptor;
}