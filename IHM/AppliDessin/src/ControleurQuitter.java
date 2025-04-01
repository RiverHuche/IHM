import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class ControleurQuitter implements EventHandler<ActionEvent>{
    private AppliDessin appli;
    
    public ControleurQuitter(AppliDessin appli){
        this.appli = appli;
    }


    @Override
    public void handle(ActionEvent e){
        System.out.println("Quitter");
        this.appli.quitter();
    }
}
