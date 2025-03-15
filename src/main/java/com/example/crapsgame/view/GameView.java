package com.example.crapsgame.view;

import com.example.crapsgame.HelloApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GameView extends Stage {
    public GameView() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("game-view.fxml")
        );
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        this.setTitle("Craps Game - Welcome!");
        this.setScene(scene);
    }
    public static WelcomeView getInstance() throws IOException {
        if (WelcomeView.WelcomeViewHolder.INSTANCE == null) {
            WelcomeView.WelcomeViewHolder.INSTANCE = new WelcomeView();
            return WelcomeView.WelcomeViewHolder.INSTANCE;
        } else {
            return WelcomeView.WelcomeViewHolder.INSTANCE;
        }

    }
    private static class WelcomeViewHolder {
        private static  WelcomeView INSTANCE;  //Nombran en mayusculas las instancias que que se van a mantener igual en el tiempo
    }
}
