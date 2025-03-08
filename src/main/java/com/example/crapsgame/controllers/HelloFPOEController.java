package com.example.crapsgame.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class HelloFPOEController {

    @FXML
    private TextField nicknameTextField;

    // decorador antes de la función
    @FXML //ayuda a relacionar los compnestes de FXML con java
    public void onActionFPOEButton(ActionEvent actionEvent) {
        System.out.println("Hello FPOE from FXMl");
    }

    @FXML
    void oKeyPressedNicknameTExtField(KeyEvent event) {
        String nickname = nicknameTextField.getText();
        System.out.println("+" + nickname);
        System.out.println(event.getCode());

    }

    @FXML
    void onReleassedNicknameTExtField(KeyEvent event) {

    }

}


// como usar clase "Timeline"
