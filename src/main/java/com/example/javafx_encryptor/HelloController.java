package com.example.javafx_encryptor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class HelloController {
    public static void showResult(TextFlow outputFlow, String inputStr) {
        outputFlow.getChildren().clear();
        outputFlow.getChildren().add(new Text(inputStr));
    }

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
    private TextField inputFirst;
    @FXML
    private TextField inputSecond;
    @FXML
    private TextField inputThird;
    @FXML
    private TextField inputFourth;
    @FXML
    private TextField inputFifth;
    @FXML
    private TextField inputSixth;

    @FXML
    private TextFlow outputFirst;
    @FXML
    private TextFlow outputSecond;
    @FXML
    private TextFlow outputThird;
    @FXML
    private TextFlow outputFourth;
    @FXML
    private TextFlow outputFifth;
    @FXML
    private TextFlow outputSixth;
    //
    //
    Encryption encryption = new Encryption();
    //
    @FXML
    void onHelloButtonClick(ActionEvent event) {
        String textInputFirst  = inputFirst.getText();
        String textInputSecond = inputSecond.getText();
        String textInputThird  = inputThird.getText();
        String textInputFourth = inputFourth.getText();
        String textInputFifth  = inputFifth.getText();
        String textInputSixth  = inputSixth.getText();
        //
        //
        showResult(outputFirst, encryption.FirstMethod(textInputFirst));
        showResult(outputSecond, encryption.FirstMethod(textInputSecond));
        showResult(outputThird, encryption.FirstMethod(textInputThird));
        showResult(outputFourth, encryption.FirstMethod(textInputFourth));
        showResult(outputFifth, encryption.FirstMethod(textInputFifth));
        showResult(outputSixth, encryption.FirstMethod(textInputSixth));
    }

}