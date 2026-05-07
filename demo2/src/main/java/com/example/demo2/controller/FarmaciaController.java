package com.example.demo2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FarmaciaController {

    public void abrirCliente(ActionEvent event) throws Exception {

        FXMLLoader loader =
                new FXMLLoader(
                        getClass().getResource(
                                "/com/example/demo2/clienteFarmacia.fxml"
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
                                "/com/example/demo2/funcionarioFarmacia.fxml"
                        )
                );

        Stage stage = new Stage();
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Funcionário");
        stage.show();
    }

    public void abrirRemedio(ActionEvent event) throws Exception {

        FXMLLoader loader =
                new FXMLLoader(
                        getClass().getResource(
                                "/com/example/demo2/remedio.fxml"
                        )
                );

        Stage stage = new Stage();
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Remédio");
        stage.show();
    }
}