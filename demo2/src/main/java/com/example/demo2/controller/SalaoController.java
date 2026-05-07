package com.example.demo2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SalaoController {

    public void abrirCliente(ActionEvent event) throws Exception {

        FXMLLoader loader =
                new FXMLLoader(
                        getClass().getResource(
                                "/com/example/demo2/clienteSalao.fxml"
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
                                "/com/example/demo2/funcionarioSalao.fxml"
                        )
                );

        Stage stage = new Stage();
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Funcionário");
        stage.show();
    }

    public void abrirCorte(ActionEvent event) throws Exception {

        FXMLLoader loader =
                new FXMLLoader(
                        getClass().getResource(
                                "/com/example/demo2/corte.fxml"
                        )
                );

        Stage stage = new Stage();
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Corte");
        stage.show();
    }
}