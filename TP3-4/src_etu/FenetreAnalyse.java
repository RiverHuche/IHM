package application;

import org.w3c.dom.Text;

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



public class FenetreAnalyse extends Application{

    @Override
    public void start(Stage primaryStage){
        
        BorderPane topPane = new BorderPane();
        TilePane right = new TilePane(); 
        
        Text title = new Text("Bonjour tout le monde !");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 32));
        
        Button rightButton = new Button("options");
        VBox centerVBox = new VBox(10);
        Hbox hbox = new Hbox(10);
        

        
        Test questionText = new Text("Que lisez-vous au petit déjeuner ?");
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Pain","Céréales","Fruits","Autre");

        PieChart chart = new PieChart();
        chart.setTitle("Que lisez-vous au petit déjeuner ?");
        chart.getData().setAll(
            new PieChart.Data("Le journal" , 21),
            new PieChart.Data("Un livre", 3),
            new PieChart.Data(" Le courier" , 7),
            new PieChart.Data("La boîte de céréales" , 75));
        chart.setLegendSide(Side.LEFT); // pour mettre la l é gende à gauche
    }
}
