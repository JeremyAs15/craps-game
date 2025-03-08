/** package com.example.crapsgame;

import com.example.crapsgame.models.Cat;
import com.example.crapsgame.models.Dog;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication1 extends Application {
    @Override
    public void start(Stage stage) throws IOException {


        Button button = new Button("Event Test");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Hello, I am a Button Event");
                System.out.println("Type: " + moueEvent.getEventType);
                System.out.println("Source: " + mousEvent.getSource());
                System.out.println("Target: " + mouseEvent.getTarget());
            }
        });




        VBox vbox = new VBox();
        vbox.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("Hello, I am a VBox event");

            }


        });


    }
}



/*
Componentes de un evento:
    - Tipo/type: tipo del evento
    - Origen/source: instancia u objeto donde se define el comportamiento
    - Target / objetivo: espacio donde se da clic
    - Etiqueta:



 */