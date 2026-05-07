package com.example.demo2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader fxmlLoader =
                new FXMLLoader(HelloApplication.class.getResource("/com.example.demo2/Menu.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle("Sistema");
        stage.setScene(scene);
        stage.show();
    }
}
