package menu;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.Node;

public class MenuController {

    private void trocarTela(ActionEvent event, String caminho) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(caminho));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void irParaFarmacia(ActionEvent event) {
        trocarTela(event, "/farmacia/telaCliente.fxml");
    }

    public void irParaFeira(ActionEvent event) {
        trocarTela(event, "/feira/telaCliente.fxml");
    }

    public void irParaSalao(ActionEvent event) {
        trocarTela(event, "/salao/telaCliente.fxml");
    }
}
