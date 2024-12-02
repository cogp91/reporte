package reporte.clases;

import java.util.List;


public class Translate {

    public static void DecisionLang(String sFormato, List<String> lines, String sTipo){
        if (sFormato == "FormatEsp"){
            EspToIng(lines, sTipo);
        }
    }


    public static void EspToIng (List<String> lines, String sTipo){

        FormatosJava.Titulo(lines, sTipo);

        for (int i = 0; i < lines.size(); i++){
            if(lines.get(i).contains("<h5>Summary</h5>")){
                lines.set(i, "<h5>Resumen</h5>");
             }

            if(lines.get(i).contains("Bitácora de Modelado")){
                lines.set(i, "Bit&aacutecora de Modelado");
            }
            if(lines.get(i).contains("Revisión Preliminar")){
                lines.set(i, "Revisi&oacuten Preliminar");
            }
            if(lines.get(i).contains("<h5>Total project issues")){
                StringBuilder sbAux = new StringBuilder(lines.get(i));
                String sAux = sbAux.substring(46);

                lines.set(i, "<h5>Total de detecciones en el proyecto :" + sAux);
                System.out.println(sAux);
            }
            if(lines.get(i).contains("<h5>Total printed issues")){
                StringBuilder sbAux = new StringBuilder(lines.get(i));
                String sAux = sbAux.substring(46);

                lines.set(i, "<h5>Total de detecciones en este reporte :" + sAux);
                System.out.println(sAux);
            }
            if(lines.get(i).contains("<td width=\"35%\">All</td>")){
                lines.set(i, "<td width=\"35%\">Todos</td>");
            }
            if(lines.get(i).contains("<td width=\"30%\">All</td>")){
                lines.set(i, "<td width=\"30%\">Todos</td>");
            }
            if(lines.get(i).contains("<td colspan=\"3\">All</td>")){
                lines.set(i, "<td colspan=\"3\">Todos</td>");
            }
            if(lines.get(i).contains("<td>All</td>")){
                lines.set(i, "<td>Todos</td>");
            }
            if(lines.get(i).contains("<td width=\"15%\" style=\"background-color: #f9f9f9;\">Assigned to</td>")){
                lines.set(i, "<td width=\"15%\" style=\"background-color: #f9f9f9;\">Asignado a</td>");
            }
            if(lines.get(i).contains("<td width=\"25%\" class=\"bgcol\">Assigned to</td>")){
                lines.set(i, "<td width=\"25%\" class=\"bgcol\">Asignado a</td>");
            }
            if(lines.get(i).contains("<td style=\"background-color: #f9f9f9;\">Types</td>")){
                lines.set(i, "<td style=\"background-color: #f9f9f9;\">Tipos</td>");
            }
            if(lines.get(i).contains("<td width=\"25%\" class=\"bgcol\">Type</td>")){
                lines.set(i, "<td width=\"25%\" class=\"bgcol\">Tipo</td>");
            }
            if(lines.get(i).contains("<td style=\"background-color: #f9f9f9;\">Priorities</td>")){
                lines.set(i, "<td style=\"background-color: #f9f9f9;\">Prioridades</td>");
            }
            if(lines.get(i).contains("<td width=\"25%\" class=\"bgcol\">Priority</td>")){
                lines.set(i, "<td width=\"25%\" class=\"bgcol\">Prioridad</td>");
            }
            if(lines.get(i).contains("<td style=\"background-color: #f9f9f9;\">Status</td>")){
                lines.set(i, "<td style=\"background-color: #f9f9f9;\">Estatus</td>");
            }
            if(lines.get(i).contains("<td width=\"25%\" class=\"bgcol\">Status</td>")){
                lines.set(i, "<td width=\"25%\" class=\"bgcol\">Estatus</td>");
            }
            if(lines.get(i).contains("<td style=\"background-color: #f9f9f9;\">Teams</td>")){
                lines.set(i, "<td style=\"background-color: #f9f9f9;\">Equipos</td>");
            }
            if(lines.get(i).contains("<td width=\"25%\" class=\"bgcol\">Teams</td>")){
                lines.set(i, "<td width=\"25%\" class=\"bgcol\">Equipos</td>");
            }
            if(lines.get(i).contains("<td style=\"background-color: #f9f9f9;\">Numbers</td>")){
                lines.set(i, "<td style=\"background-color: #f9f9f9;\">N&uacutemeros de detecci&oacuten</td>");
            }
            if(lines.get(i).contains("<td width=\"20%\" style=\"background-color: #f9f9f9;\">Zones</td>")){
                lines.set(i, "<td width=\"20%\" class=\"bgcol\">Zonas</td>");
            }
            if(lines.get(i).contains("<td width=\"25%\" class=\"bgcol\">Zone</td>")){
                lines.set(i, "<td width=\"25%\" class=\"bgcol\">Zona</td>");
            }
            if(lines.get(i).contains("<td style=\"background-color: #f9f9f9;\">Phases</td>")){
                lines.set(i, "<td style=\"background-color: #f9f9f9;\">Fases</td>");
            }
            if(lines.get(i).contains("<td width=\"25%\" class=\"bgcol\">Phase</td>")){
                lines.set(i, "<td width=\"25%\" class=\"bgcol\">Fase</td>");
            }
            if(lines.get(i).contains("<td style=\"background-color: #f9f9f9;\">Labels</td>")){
                lines.set(i, "<td style=\"background-color: #f9f9f9;\">Etiquetas</td>");
            }
            if(lines.get(i).contains("<td width=\"25%\" class=\"bgcol\">Labels</td>")){
                lines.set(i, "<td width=\"25%\" class=\"bgcol\">Etiquetas</td>");
            }
            if(lines.get(i).contains("<td style=\"background-color: #f9f9f9;\">Issue group</td>")){
                lines.set(i, "<td style=\"background-color: #f9f9f9;\">Clasificaci&oacuten de problemas</td>");
            }
            if(lines.get(i).contains("<td width=\"25%\" class=\"bgcol\">Issue group</td>")){
                lines.set(i, "<td width=\"25%\" class=\"bgcol\">Clasificaci&oacuten de problemas</td>");
            }
            if(lines.get(i).contains("<td style=\"background-color: #f9f9f9;\">Author</td>")){
                lines.set(i, "<td style=\"background-color: #f9f9f9;\">Autores</td>");
            }
            if(lines.get(i).contains("<td width=\"25%\" class=\"bgcol\">Author</td>")){
                lines.set(i, "<td width=\"25%\" class=\"bgcol\">Autores</td>");
            }
            if(lines.get(i).contains("Average time to close an issue")){
                lines.set(i, "Tiempo promedio para cerrar un cruce");
            }
            if(lines.get(i).contains("Average opened issue age")){
                lines.set(i, "Tiempo promedio de un cruce abierto");
            }
            if(lines.get(i).contains("<h5 class=\"block-title font-s12\">Issues By Assigned To</h5>")){
                lines.set(i, "<h5 class=\"block-title font-s12\">Detecciones Por Asignaci&oacuten</h5>");
            }
            if(lines.get(i).contains("<h5 class=\"block-title font-s12\">Issues By Priorities</h5>")){
                lines.set(i, "<h5 class=\"block-title font-s12\">Detecciones Por Prioridades</h5>");
            }
            if(lines.get(i).contains("<h5 class=\"block-title font-s12\">Issues By Phases</h5>")){
                lines.set(i, "<h5 class=\"block-title font-s12\">Detecciones Por Fases</h5>");
            }
            if(lines.get(i).contains("<h5 class=\"block-title font-s12\">Issues By Zones</h5>")){
                lines.set(i, "<h5 class=\"block-title font-s12\">Detecciones Por Zonas</h5>");
            }
            if(lines.get(i).contains("<h5 class=\"block-title font-s12\">Issues By Status</h5>")){
                lines.set(i, "<h5 class=\"block-title font-s12\">Detecciones Por Estatus</h5>");
            }
            if(lines.get(i).contains("<h5 class=\"block-title font-s12\">Issues By Type</h5>")){
                lines.set(i, "<h5 class=\"block-title font-s12\">Detecciones Por Tipo</h5>");
            }
            if(lines.get(i).contains("<h5 class=\"block-title font-s12\">Issues By Teams</h5>")){
                lines.set(i, "<h5 class=\"block-title font-s12\">Detecciones Por Equipos</h5>");
            }
            if(lines.get(i).contains("<h5 class=\"block-title font-s12\">Issues By Groups</h5>")){
                lines.set(i, "<h5 class=\"block-title font-s12\">Detecciones Por Clasificaci&oacuten</h5>");
            }
            if(lines.get(i).contains("<h5 class=\"block-title font-s12\">Issues By Labels</h5>")){
                lines.set(i, "<h5 class=\"block-title font-s12\">Detecciones Por Etiquetas</h5>");
            }
            if(lines.get(i).contains("<h5 class=\"block-title font-s12\">Issues By Author</h5>")){
                lines.set(i, "<h5 class=\"block-title font-s12\">Detecciones Por Autor</h5>");
            }
            if(lines.get(i).contains("<div class=\"small push-10-t\">Printed by")){
                StringBuilder sbAux = new StringBuilder(lines.get(i));
                String sAux = sbAux.substring(52);
                lines.set(i,"<div class=\"small push-10-t\">Impreso Por " + sAux);
            }
            if(lines.get(i).contains("<div class=\"small\">Date")){
                StringBuilder sbAux = new StringBuilder(lines.get(i));
                sbAux.setCharAt(31, 'F');
                sbAux.setCharAt(32, 'e');
                sbAux.setCharAt(33, 'c');
                sbAux.setCharAt(34, 'h');
                sbAux.setCharAt(35, 'a');
                lines.set(i,sbAux.toString());
            }
            if(lines.get(i).contains("<h5 class=\"block-title font-s12\">Total vs Closed Issues</h5>")){
                lines.set(i, "<h5 class=\"block-title font-s12\">Total De Detecciones vs Detecciones Cerradas</h5>");
            }
            if(lines.get(i).contains("<h5 class=\"block-title font-s12\">Issue's commented images</h5>")){
                lines.set(i, "<h5 class=\"block-title font-s12\">Im&aacutegenes comentadas de detecci&oacuten</h5>");
            }
            if(lines.get(i).contains("<th class=\"bgcol-Darker font-s13\" width=\"30%\" valign=\"middle\">User / Date</th>")){
                lines.set(i, "<th class=\"bgcol-Darker font-s13\" width=\"30%\" valign=\"middle\">Autor / Fecha</th>");
            }
            if(lines.get(i).contains("<th class=\"bgcol-Darker font-s13\" width=\"20%\" valign=\"middle\">User / Date</th>")){
                lines.set(i, "<th class=\"bgcol-Darker font-s13\" width=\"20%\" valign=\"middle\">Autor / Fecha</th>");
            }
            if(lines.get(i).contains("<th class=\"bgcol-Darker font-s13\" valign=\"middle\">Comments</th>")){
                lines.set(i, "<th class=\"bgcol-Darker font-s13\" valign=\"middle\">Comentarios</th>");
            }
            if(lines.get(i).contains("<td width=\"25%\" class=\"bgcol\">Created</td>")){
                lines.set(i, "<td width=\"25%\" class=\"bgcol\">Creado</td>");
            }
            if(lines.get(i).contains("<td width=\"25%\" class=\"bgcol\">Last changed by</td>")){
                lines.set(i, "<td width=\"25%\" class=\"bgcol\">&Uacuteltima modificaci&oacuten por</td>");
            }
            if(lines.get(i).contains("<td width=\"25%\" class=\"bgcol\">Last changed</td>")){
                lines.set(i, "<td width=\"25%\" class=\"bgcol\">&Uacuteltimo cambio</td>");
            }
            if(lines.get(i).contains("<td width=\"25%\" class=\"bgcol\">Due date</td>")){
                lines.set(i, "<td width=\"25%\" class=\"bgcol\">Fecha de vencimiento</td>");
            }
            if(lines.get(i).contains("<td width=\"25%\" class=\"bgcol\">Notification list</td>")){
                lines.set(i, "<td width=\"25%\" class=\"bgcol\">Lista de notificados</td>");
            }
            if(lines.get(i).contains("days")){
                StringBuilder sbAux = new StringBuilder(lines.get(i));
                String after, before;

                int iAux = sbAux.indexOf("days");

                after = sbAux.substring(iAux + 4);
                before = sbAux.substring(0, iAux);


                lines.set(i, before + "d&iacuteas" + after);
            }

            if (lines.get(i).contains("<span class=\"strong\">Description:</span>")){
                StringBuilder sbAux = new StringBuilder((lines.get(i)));
                String after, before;

                int iAux = sbAux.indexOf("Description");

                after = sbAux.substring(iAux + 11);
                before = sbAux.substring(0, iAux);

                lines.set(i, before + "DESCRIPCI&OacuteN" + after);
            }

            if(lines.get(i).contains("<h5 class=\"block-title font-s12\">Commented images</h5>")){
                lines.set(i, "<h5 class=\"block-title font-s12\">Im&aacutegenes Comentadas</h5>");
            }
        }
    }
}
