package com.example.demo2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuController {

    public void abrirFarmacia(ActionEvent event) throws Exception {

        FXMLLoader loader =
                new FXMLLoader(getClass().getResource("/com.example.demo2/farmacia.fxml"));

        Stage stage = new Stage();
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Farmácia");
        stage.show();
    }

    public void abrirSalao(ActionEvent event) throws Exception {

        FXMLLoader loader =
                new FXMLLoader(getClass().getResource("/com.example.demo2/salao.fxml"));

        Stage stage = new Stage();
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Salão");
        stage.show();
    }

    public void abrirFeira(ActionEvent event) throws Exception {

        FXMLLoader loader =
                new FXMLLoader(getClass().getResource("/com.example.demo2/feira.fxml"));

        Stage stage = new Stage();
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Feira");
        stage.show();
    }
}
