package reporte.clases;


import java.util.List;

public class FormatosJava {

    public static void IconBimset(List<String> lines, String sDirBimset){
        for(int i = 25; i < 80; i++){
            if (lines.get(i).contains("<div class=\"col-xs-3 text-right\">")){
                lines.set(i, "<div class=\"col-xs-3 text-right\"> <img width=\"100\" height=\"100\" " + sDirBimset + ">");
            }
        }
    }

    public static void Titulo(List<String> lines, String sTipo){
        for (int i=25; i < 60; i++){
            if (lines.get(i).contains("Issue Report")){
                lines.set(i, sTipo);
            }
        }
    }

    public static void IconoCliente(List<String> lines, String sDirIcono){
        for (int i = 35; i < 50; i++){
            if (lines.get(i).contains("img class=\"img hubimg-avatar48\"")){
                StringBuilder sAux = new StringBuilder(lines.get(i));
                int iAux = sAux.indexOf("src=");
                int iaux2 = sAux.indexOf("height");
                String sDirBimset = sAux.substring(iAux, iaux2 - 1);
                lines.set(i, "                     <img width=\"100\" height=\"100\" src=\"" + sDirIcono + "\" alt=\"\">");
                lines.set(i+3, "");
                IconBimset(lines, sDirBimset);
            }
        }

    }

    public static void PieSize(List<String> lines){
        for (int i = 100; i < lines.size(); i++){
            if (lines.get(i).contains("<div class=\"col-xs-1 col-xs-offset-1 remove-padding-l remove-padding-r\">")){

                StringBuilder sbAux = new StringBuilder(lines.get(i+2));
                int iAux = sbAux.indexOf("height=");
                int iAux2 = sbAux.indexOf("height:");

                sbAux.setCharAt(iAux + 8, '1');
                sbAux.setCharAt(iAux + 9, '4');
                sbAux.setCharAt(iAux + 10, '0');
                sbAux.setCharAt(iAux2 + 8, '1');
                sbAux.setCharAt(iAux2 + 9, '4');
                sbAux.setCharAt(iAux2 + 10, '0');


                lines.set(i+2,sbAux.toString());
            }
        }
    }

    public static void Redimension(List<String> lines){
        String x = "<div class=\"col-xs-7 remove-padding-r\">";
        String y = "<div class=\"col-xs-5\">";

        String w = "<div class=\"col-xs-5 remove-padding-r\">";
        String z = "<div class=\"col-xs-7\">";

        for(int i = 200; i < lines.size(); i++){
            if (lines.get(i).contains("<div class=\"col-xs-5 remove-padding-r\">")) {
                lines.set(i, x);
            }
            if (lines.get(i).contains("<div class=\"col-xs-7\">")){
                lines.set(i, y);
            }
            if (lines.get(i).contains("<div class=\"col-xs-2 remove-padding-r\">")) {
                lines.set(i, w);
            }
            if (lines.get(i).contains("<div class=\"col-xs-10 \">")){
                lines.set(i, z);
            }
        }
    }

    public static void RedimensionFoto(List<String> lines){
        for(int i = 200; i < lines.size(); i++){

            if (lines.get(i).contains("<div class=\"col-xs-7 remove-padding-r\">"))
            {
                StringBuilder sbAux = new StringBuilder(lines.get(i+2));
                int iAux= sbAux.indexOf("class=\"img-responsive issue-image\"");
                int iAux2= sbAux.lastIndexOf("class=\"img-responsive issue-image\"");

                sbAux.replace(iAux + 0,iAux2 + 1,"style=\"width: 100%; height: 100%\"");

                iAux= sbAux.indexOf("class=\"img-responsive issue-image\"");
                iAux2= sbAux.lastIndexOf("class=\"img-responsive issue-image\"");
                if(iAux >= 0 && iAux2 >= 0) {
                    sbAux.delete(iAux, iAux2 + 1);
                }
                lines.set(i+2, sbAux.toString());
            }

            if (lines.get(i).contains("<div class=\"col-xs-5 remove-padding-r\">")){
                StringBuilder sbAux = new StringBuilder(lines.get(i+2));
                int iAux= sbAux.indexOf("class=\"img-responsive issue-image\"");
                int iAux2= sbAux.lastIndexOf("class=\"img-responsive issue-image\"");

                sbAux.replace(iAux+0,iAux2+1,"style=\"width: 100%; height: 100%\"");

                iAux= sbAux.indexOf("class=\"img-responsive issue-image\"");
                iAux2= sbAux.lastIndexOf("class=\"img-responsive issue-image\"");
                if(iAux >= 0 && iAux2 >= 0) {
                    sbAux.delete(iAux, iAux2 + 1);
                }
                lines.set(i+2, sbAux.toString());
            }
        }

    }


}
