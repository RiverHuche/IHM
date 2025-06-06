package application;

import controller.ConnexionController;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class FenetreConnexion extends Application{

    private TextField txtIdentifiant;
    private PasswordField txtMotDePasse;
    private Button boutonConnexion;
    private GridPane grid;

    

    public Pane getVue() {
        return grid;
    }

    public String getIdentifiant() {
        return txtIdentifiant.getText();
    }

    public String getMotDePasse() {
        return txtMotDePasse.getText();
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(20));

        Label lblIdentifiant = new Label("Identifiant :");
        txtIdentifiant = new TextField();

        Label lblMotDePasse = new Label("Mot de passe :");
        txtMotDePasse = new PasswordField();

        boutonConnexion = new Button("Connexion");

        grid.add(lblIdentifiant, 0, 0);
        grid.add(txtIdentifiant, 1, 0);
        grid.add(lblMotDePasse, 0, 1);
        grid.add(txtMotDePasse, 1, 1);
        grid.add(boutonConnexion, 1, 3, 2, 1);

        ConnexionController controller = new ConnexionController(this);
        boutonConnexion.setOnAction(controller);

        Scene scene = new Scene(grid, 320, 200);
        primaryStage.setTitle("Connexion");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
