import javafx.application.Application;
import javafx.stage.Stage;

public class Executable extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage stage) {
        this.primaryStage = stage;
        afficherConnexion();
    }

    public void afficherConnexion() {
        ControllerConnexion ctrl = new ControllerConnexion(this);
        FenetreConnexion.afficher(primaryStage, ctrl);
    }

    /*public void afficherAnalyste() {
        ControllerDeconnexion ctrl = new ControllerDeconnexion(this);
        FenetreAnalyste.afficher(primaryStage, ctrl);
    }
    */

    public static void main(String[] args) {
        launch(args);
    }
}

