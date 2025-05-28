import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;


public class ControleurParametres implements EventHandler<ActionEvent> {
    private MotMystere modele;
    private Pendu vue;

    /**
     * Constructeur
     * @param modele le modèle du mot mystère
     * @param vue la vue du jeu
     */
    public ControleurParametres(MotMystere modele, Pendu vue) {
        this.modele = modele;
        this.vue = vue;
    }

    /**
     * Action à effectuer lors d'un clic de la souris pour ouvrir les paramètres 
     *@param actionEvent de type ActionEvent
     */
    public void handle(ActionEvent actionEvent){
        ComboBox<String> combo = (ComboBox<String>) actionEvent.getSource();
        String niveau = combo.getValue();
        /*if (niveau != null) {
            if (niveau.equals("Facile")) {
                modele.setNiveau(MotMystere.FACILE);
            } else if (niveau.equals("Moyen")) {
                modele.setNiveau(MotMystere.MOYEN);
            } else if (niveau.equals("Expert")) {
                modele.setNiveau(MotMystere.EXPERT);
            } else {
                System.err.println("Niveau inconnu : " + niveau);
            }
            vue.lancerPartie();
        }*/
    }
}

