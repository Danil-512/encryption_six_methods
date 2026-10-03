package com.example.javafx_encryptor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    private Label welcomeText1;

    @FXML
    private Label welcomeText11;

    @FXML
    private Label welcomeText111;

    @FXML
    private Label welcomeText1111;

    @FXML
    private Label welcomeText1112;

    @FXML
    private Label welcomeText1113;

    @FXML
    private Label welcomeText2;

    @FXML
    void onHelloButtonClick(ActionEvent event) {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

}