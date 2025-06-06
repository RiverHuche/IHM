public class ControllerDeconnexion {
    private Executable app;

    public ControllerDeconnexion(Executable app) {
        this.app = app;
    }

    public void seDeconnecter() {
        System.out.println("Déconnexion réussie !");
        app.afficherConnexion();
    }
}
