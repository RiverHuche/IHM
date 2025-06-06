public class ControllerConnexion {

    private Executable app;

    public ControllerConnexion(Executable app) {
        this.app = app;
    }

    public void seConnecter(String login, String motDePasse) {
        if (login.equals("admin") && motDePasse.equals("1234")) {
            System.out.println("Connexion réussie !");
            /*app.afficherAnalyste();*/
        } else {
            System.out.println("Connexion échouée. Veuillez vérifier vos identifiants.");
        }
    }
}
