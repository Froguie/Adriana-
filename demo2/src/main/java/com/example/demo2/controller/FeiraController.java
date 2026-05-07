package com.example.demo2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FeiraController {

    public void abrirCliente(ActionEvent event) throws Exception {

        FXMLLoader loader =
                new FXMLLoader(
                        getClass().getResource(
                                "/com/example/demo2/cliente.fxml"
                        )
                );

        Stage stage = new Stage();
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Cliente");
        stage.show();
    }

    public void abrirFuncionario(ActionEvent event) throws Exception {

        FXMLLoader loader =
                new FXMLLoader(
                        getClass().getResource(
                                "/com/example/demo2/funcionario.fxml"
                        )
                );

        Stage stage = new Stage();
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Funcionário");
        stage.show();
    }

    public void abrirFruta(ActionEvent event) throws Exception {

        FXMLLoader loader =
                new FXMLLoader(
                        getClass().getResource(
                                "/com/example/demo2/fruta.fxml"
                        )
                );

        Stage stage = new Stage();
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Fruta");
        stage.show();
    }
}