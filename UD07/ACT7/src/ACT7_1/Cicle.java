package ACT7_1;
import java.util.ArrayList;
/**
 *
 * @author srhig
 */
public class Cicle {
    private int idCicle, numAlumnes;
    private static int comptadorCicles = 1;
    private String nom;
    private ArrayList<Modul> moduls;
    //Constructor
    public Cicle(int numAlumnes, String nom) {
        this.idCicle = getComptadorCicles();
        this.numAlumnes = numAlumnes;
        this.nom = nom;
        this.moduls = new ArrayList<>();
    }
    //Métodos específicos
    /**
     * 
     * @return 
     */
    public String mostraCicle() {
        String text;
        
        text = "Cicle " + "ID=" + idCicle + ", nom=" + nom + ", numAlumnes=" + numAlumnes + 
                "; \n\t" +
                "Mòduls: {";
        for (Modul m: moduls) {
            text = text + m.getIdModul() + "-" + m.getNom() + " ";
        }
        text = text +"}";
        
        return text;
    }
    public void afegeixModul(Modul nouModul) {
        this.moduls.add(nouModul);
    }    
    // *****************************
    private int cercarModul(String nom) {
        for (int i=0; i<moduls.size(); i++) {
            if (moduls.get(i).getNom().equalsIgnoreCase(nom)) {
                return i;
            }
        }
        return -1;
    }
 
    public boolean eliminarModul(String nom) {
        int i = cercarModul(nom);
        
        if (i >= 0) {
            moduls.remove(i);
            return true;
        }
        return false;
    }    
    //Getters y setters
    public int getIdCicle() {
        return idCicle;
    }

    public void setIdCicle(int idCicle) {
        this.idCicle = idCicle;
    }

    public int getNumAlumnes() {
        return numAlumnes;
    }

    public void setNumAlumnes(int numAlumnes) {
        this.numAlumnes = numAlumnes;
    }

    public static int getComptadorCicles() {
        return comptadorCicles++;
    }

    public static void setComptadorCicles(int comptadorCicles) {
        Cicle.comptadorCicles = comptadorCicles;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Modul> getModuls() {
        return moduls;
    }

    public void setModuls(ArrayList<Modul> moduls) {
        this.moduls = moduls;
    }
    
}