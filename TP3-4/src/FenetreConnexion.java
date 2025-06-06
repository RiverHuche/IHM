import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FenetreConnexion {

    public static void afficher(Stage stage, ControllerConnexion controller) {
        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(20));

        Label identifiant = new Label("Login :");
        TextField champId = new TextField();

        Label motDePasse = new Label("Mot de passe :");
        PasswordField champMDP = new PasswordField();

        Button boutonConnexion = new Button("Connexion");
        boutonConnexion.setOnAction(e -> controller.seConnecter(champId.getText(), champMDP.getText()));

        grid.add(identifiant, 0, 0);
        grid.add(champId, 1, 0);
        grid.add(motDePasse, 0, 1);
        grid.add(champMDP, 1, 1);
        grid.add(boutonConnexion, 1, 2);

        Scene scene = new Scene(grid, 300, 200);
        stage.setTitle("Connexion");
        stage.setScene(scene);
        stage.show();
    }
}
