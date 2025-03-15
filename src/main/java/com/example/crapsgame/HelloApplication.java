package com.example.crapsgame;

import com.example.crapsgame.models.Cat;
import com.example.crapsgame.models.Dog;
import com.example.crapsgame.view.WelcomeView;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        WelcomeView welcomeView = WelcomeView.getInstance();
        welcomeView.show();
    }
        /*FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("welcome-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    */
}