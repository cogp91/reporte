/*
Created by Carlos Omar Gálvez Peña
Date: March 23 2018

 */


package reporte.clases;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/reporte/pantallas/PantallaPrincipal.fxml"));
        primaryStage.setTitle("Formato de Reportes");
        primaryStage.setScene(new Scene(root, 700, 250));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
