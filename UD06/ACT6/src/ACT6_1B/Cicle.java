package ACT6_1B;
import java.util.ArrayList;
public class Cicle {
    int idCicle, numAlumnes;
    public static int comptadorCicles=1;
    String nom;
    ArrayList<Modul> moduls = new ArrayList<>();
    // Cicles
    public String mostraCicle() {
        String text;
        
        text = "Cicle: " + "ID=" + idCicle + ", nom=" + nom + ", numAlumnes=" + numAlumnes + 
               "; \n\t" +
               "Mòduls: {";
        for (Modul modul: moduls) {
            text = text + modul.idModul + "-" + modul.nom + " ";
        }
        text = text +"}";
        
        return text;
    }   
    
    private int cercaModul(String nom) {
        for (int i=0; i<moduls.size(); i++) {
            if (moduls.get(i).nom.equalsIgnoreCase(nom)) {
                return i;
            }
        }
        return -1;
    }
    
    public void afegeixModul(Modul modul) {
        moduls.add(modul);
    }
    
    public boolean eliminaModul(String nom) {
        int i = cercaModul(nom);
        
        if (i >= 0) {
            moduls.remove(i);
            return true;
        }
        return false;
    }
}