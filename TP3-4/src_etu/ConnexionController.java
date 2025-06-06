package controller;

import application.FenetreConnexion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ConnexionController implements EventHandler<ActionEvent> {

    private FenetreConnexion vue;

    public ConnexionController(FenetreConnexion vue) {
        this.vue = vue;
    }

    @Override
    public void handle(ActionEvent event) {
        connexion(); // appel correct
    }

    public void connexion() {
        String id = vue.getIdentifiant();
        String mdp = vue.getMotDePasse();

        if (id.equals("admin") && mdp.equals("1234")) {
        }
    }
}
