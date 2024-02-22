package Examen;

import java.util.ArrayList;

public class Enunciado1 {

    static ArrayList<String> historial = new ArrayList();
    static int index;

    public static void main(String[] args) {
        // Inicialitzaci� de l'historial de navegaci�
        historial.add("www.paginaInicial.com"); // historial[0]
        historial.add("www.primeraPagina.com"); // historial[1]
        historial.add("www.segonaPagina.com");  // historial[2]
        historial.add("www.terceraPagina.com"); // historial[3]
        historial.add("www.quartaPagina.com");  // historial[4]
        historial.add("www.paginaFinal.com");   // historial[5]
        index = historial.size() - 1;

        // Simulaci� 
        retrocedir(historial);      // retrocedir 1 posici� --> historial[4]
        retrocedir(historial,10); // retrocedir 10 posicions (o b� fins a l'inici) --> historial[0]
        avancar(historial);         // avan�ar 1 posici� --> historial[1]
        avancar(historial,2);     // avan�ar 2 posicions --> historial[3]
        
        System.out.println(visitarPagina(historial));       // visitar actual --> "www.terceraPagina.com"
        System.out.println(visitarPagina(historial,100)); // visitar posici� 100 (o b� fins el final) --> "www.paginaFinal.com"
        System.out.println(visitarPagina(historial));       // visitar actual--> "www.paginaFinal.com"

    }
    
    // visitar la posici� actual
    private static String visitarPagina(ArrayList<String> historial) {
        String web = historial.get(index);
        
        return web;
    }

    // visitar la posici� 'i' (sempre que es pugui)
    private static String visitarPagina(ArrayList<String> historial, int i) {
        String web = "";
        
        // TO-DO
        
        return web;
    }
    
    // retrocedir 1 posici� (sempre que es pugui)
    private static void retrocedir(ArrayList<String> historial) {
        // TO-DO
        
    }
    
    // retrocedir 'i' posicions (sempre que es pugui)
    private static void retrocedir(ArrayList<String> historial, int i) {
        // TO-DO
        
    }
    
    // avan�ar 1 posici� (sempre que es pugui)
    private static void avancar(ArrayList<String> historial) {
        // TO-DO
        
    } 
    
    // avan�ar 'i' posicions (sempre que es pugui)
    private static void avancar(ArrayList<String> historial, int i) {
        // TO-DO
        
    }

    // mostrar tot l'historial
    private static void mostrarHistorial(ArrayList<String> historial) {
        // TO-DO
        
    }

}
