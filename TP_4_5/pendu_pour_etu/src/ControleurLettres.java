import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

/**
 * Controleur du clavier
 */
public class ControleurLettres implements EventHandler<ActionEvent> {

    /**
     * modèle du jeu
     */
    private MotMystere modelePendu;
    /**
     * vue du jeu
     */
    private Pendu vuePendu;

    /**
     * @param modelePendu modèle du jeu
     * @param vuePendu vue du jeu
     */
    ControleurLettres(MotMystere modelePendu, Pendu vuePendu){
        this.modelePendu = modelePendu;
        this.vuePendu = vuePendu;
    }

    /**
     * Actions à effectuer lors du clic sur une touche du clavier
     * Il faut donc: Essayer la lettre, mettre à jour l'affichage et vérifier si la partie est finie
     * @param actionEvent l'événement
     */
    @Override
    public void handle(ActionEvent actionEvent){
        Button bouton = (Button) actionEvent.getSource();
        String lettre = bouton.getText();
        bouton.setDisable(true);


        modelePendu.essaiLettre(lettre.charAt(0));
        vuePendu.majAffichage();

        if (modelePendu.gagne()){
            Alert alert = vuePendu.popUpMessageGagne(modelePendu.getMotATrouve());
            alert.showAndWait();
            vuePendu.lancePartie();
        }
        else if(modelePendu.perdu()){
            Alert alert = vuePendu.popUpMessagePerdu(modelePendu.getMotATrouve());
            alert.showAndWait();
            vuePendu.lancePartie();
        }   
    }
}
