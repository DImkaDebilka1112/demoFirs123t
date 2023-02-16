package com.example.demofirst;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class ControllerSecond {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private CheckBox addContactCheckBoxFemale;

    @FXML
    private CheckBox addContactCheckBoxMale;

    @FXML
    private TextField addContactLastName;

    @FXML
    private TextField addContactName;

    @FXML
    private TextField addContactNumber;

    @FXML
    private Button deleteContactButton;

    @FXML
    void initialize() {
     deleteContactButton.setOnAction(actionEvent -> {
         System.out.println("Вы успешно создали контакт");
     });



    }

    public void startSixth(ActionEvent actionEvent) {
    }
}


