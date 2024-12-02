package reporte.clases;

import java.awt.*;
import java.io.*;

import javafx.scene.control.*;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class metodoArchivo {

    /*
    Methods to put text on TF on UI

     */
    public static void DireccionTF(File selectedFile, TextField tfDireccion){
        tfDireccion.setText(selectedFile.getAbsolutePath());
    }

    public static void DireccionTfIcon(File selectedFile, TextField tfDireccionIcn){
        tfDireccionIcn.setText(selectedFile.getAbsolutePath());
    }


    /*
    Methods to Apply according to language selected in UI
    */

    public static void FormatEsp(File selectedFile, String sTipo, String sDirIcono){
        String sFormato = "FormatEsp";
        metodoArchivo mA = new metodoArchivo();
        mA.readFileAsList(selectedFile, sTipo, sDirIcono, sFormato);

        try {
            Desktop.getDesktop().browse(selectedFile.toURI());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void FormatIng(File selectedFile, String sTipo, String sDirIcono){
        String sFormato = "FormatIng";
        metodoArchivo mA = new metodoArchivo();
        mA.readFileAsList(selectedFile, sTipo, sDirIcono, sFormato);

        try {
            Desktop.getDesktop().browse(selectedFile.toURI());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void FormatPer(File selectedFile, String sTipo, String sDirIcono){
        String sFormato = "FormatPer";
        metodoArchivo mA = new metodoArchivo();
        mA.readFileAsList(selectedFile, sTipo, sDirIcono, sFormato);

        try {
            Desktop.getDesktop().browse(selectedFile.toURI());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    /*
    Method of reading files and setting format to report
     */


    private void readFileAsList(File selectedFile, String sTipo, String sDirIcono, String sFormato){

        List<String> lines = new ArrayList<String>();
        String line;

        try {
            FileReader fr = new FileReader(selectedFile);
            BufferedReader bufferreader = new BufferedReader(fr);


            line = bufferreader.readLine();

            while (line != null) {
                lines.add(line);
                line = bufferreader.readLine();
            }
            //Methods to give format to report
            //FormatosJava.Titulo(lines, sTipo);
            FormatosJava.IconoCliente(lines, sDirIcono);
            System.out.println("IconoCliente");
            FormatosJava.PieSize(lines);
            System.out.println("PieSize");
            FormatosJava.Redimension(lines);
            System.out.println("Redimension tablas");
            FormatosJava.RedimensionFoto(lines);
            System.out.println("Redimension Foto");

            if (sFormato == "FormatEsp"){
                Translate.DecisionLang(sFormato, lines, sTipo);
            }

            fr.close();
            bufferreader.close();

            FileWriter fw = new FileWriter(selectedFile);
            BufferedWriter out = new BufferedWriter(fw);
            for (String sOut: lines
                 ) {
                out.write(sOut);
                out.write("\n");
            }
            out.flush();
            out.close();
            fw.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
