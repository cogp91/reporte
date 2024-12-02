package reporte.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import reporte.clases.metodoArchivo;


import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


import java.io.File;


public class ControllerPantallaPrincipal {

    public Button btnIcnClient;
    public Button btnBuscar;

    public TextField tfDireccion;
    public TextField tfDireccionIcn;

    public File selectedFile;
    public File selectedImage;

    public ChoiceBox cbTipo;
    public ChoiceBox cbIdioma;

    ObservableList<String> Idioma = FXCollections.observableArrayList("- Idioma -","Español","Inglés","Personalizado");
    ObservableList<String> Tipo = FXCollections.observableArrayList("- Título -", "Revisión Preliminar","Bitácora de Modelado","Reporte de Cruce");

    @FXML
    private void initialize() {
        cbIdioma.setItems(Idioma);
        cbIdioma.setValue("- Idioma -");

        cbTipo.setItems(Tipo);
        cbTipo.setValue("- Título -");
    }

    public void pressBuscar () throws Exception
    {
        try {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Seleccionar archivo html para formatear");
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("Archivo de html", "*.html")
            );
            Stage mainStage = new Stage();
            selectedFile = fileChooser.showOpenDialog(mainStage);
            metodoArchivo.DireccionTF(selectedFile, tfDireccion);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void pressBuscarIcn () throws Exception
    {
        try {
            FileChooser fileChooser = new FileChooser();
            File initialDir = new File("M:\\01. LINEAMIENTOS\\01. ESTANDARES BIM\\03. ESTANDARES OFICIALES\\LOGOS");
            fileChooser.setInitialDirectory(initialDir);
            fileChooser.setTitle("Seleccionar icono de cliente en formato png");
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("Imagen icono para cliente", "*.png")
            );
            Stage mainStage = new Stage();
            selectedImage = fileChooser.showOpenDialog(mainStage);
            metodoArchivo.DireccionTfIcon(selectedImage, tfDireccionIcn);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void pressAplicar ()
    {
        if (cbIdioma.getValue() == "Español"){

            if (cbTipo.getValue() == "Revisión Preliminar")
                metodoArchivo.FormatEsp(selectedFile, "Revisión Preliminar", tfDireccionIcn.getText());
            if (cbTipo.getValue() == "Bitácora de Modelado")
                metodoArchivo.FormatEsp(selectedFile, "Bitácora de Modelado", tfDireccionIcn.getText());
            if (cbTipo.getValue() == "Reporte de Cruce")
                metodoArchivo.FormatEsp(selectedFile, "Reporte de Cruce", tfDireccionIcn.getText());
        }
        if (cbIdioma.getValue() == "Inglés"){

            if (cbTipo.getValue() == "Revisión Preliminar")

                metodoArchivo.FormatIng(selectedFile, "Preliminary Review", tfDireccionIcn.getText());
            if (cbTipo.getValue() == "Bitácora de Modelado")
                metodoArchivo.FormatIng(selectedFile, "Modeling Logbook", tfDireccionIcn.getText());
            if (cbTipo.getValue() == "Reporte de Cruce")
                metodoArchivo.FormatIng(selectedFile, "Clashing Report", tfDireccionIcn.getText());
        }
        if (cbIdioma.getValue() == "Personalizado"){
            if (cbTipo.getValue() == "Revisión Preliminar")
                metodoArchivo.FormatPer(selectedFile, "Revisión Preliminar", tfDireccionIcn.getText());
            if (cbTipo.getValue() == "Bitácora de Modelado")
                metodoArchivo.FormatPer(selectedFile, "Bitácora de Modelado", tfDireccionIcn.getText());
            if (cbTipo.getValue() == "Reporte de Cruce")
                metodoArchivo.FormatPer(selectedFile, "Reporte de Cruce", tfDireccionIcn.getText());
        }
    }


}
