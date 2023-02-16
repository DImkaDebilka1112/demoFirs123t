package com.example.demofirst;
import java.lang.IllegalStateException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class ControllerFirst {

    @FXML
    private ResourceBundle resources;
    @FXML
    private ImageView addImagecarry;
    @FXML
    private URL location;

    @FXML
    private Button addContactButton;

    @FXML
    private Button deleteContactButton;

    @FXML
    private Button searchContactButton;

    @FXML

    private Button updateContactButton;


    public void initialize(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("second-file.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1440, 850);
        Stage stageSecond = new Stage();
        stageSecond.setTitle("Добавить контакт");
        stageSecond.setScene(scene);
        stageSecond.show();
    }

    public void startFourth(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Thirds-file.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 500);
        Stage stageSecond = new Stage();
        stageSecond.setTitle("Удалить");
        stageSecond.setScene(scene);
        stageSecond.show();

    }

    public void startThird(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("fifth-file.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 500);
        Stage stageSecond = new Stage();
        stageSecond.setTitle("Поиск");
        stageSecond.setScene(scene);
        stageSecond.show();

    }

    public void startTwo(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("fourth-file.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        Stage stageSecond = new Stage();
        stageSecond.setTitle("Список");
        stageSecond.setScene(scene);
        stageSecond.show();

    }
}