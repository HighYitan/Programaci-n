package ACT7_1;
import java.util.ArrayList;
/**
 * Representa los institutos existentes y los ciclos de cada instituto.
 * @author srhig
 */
public class Institut {
    private String idInstitut, nom;
    private ArrayList<Cicle> cicles;
    //Constructor
    public Institut(String idInstitut, String nom) {
        this.idInstitut = idInstitut;
        this.nom = nom;
        this.cicles = new ArrayList<>();
    }
    //Métodos específicos
    /**
     * Mostra els atributs de la classe
     * @return String amb les dades concatenades
     */
    public String mostraInstitut() {
        String text;
        
        text = "Institut " + "ID=" + idInstitut + ", nom=" + nom + "; Cicles: {";
        for (Cicle c: cicles) {
            text = text + c.mostraCicle();
        }
        text = text +"}";
        
        return text;
    }
    //Getters y setters
    public String getIdInstitut() {
        return idInstitut;
    }

    public void setIdInstitut(String idInstitut) {
        this.idInstitut = idInstitut;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Cicle> getCicles() {
        return cicles;
    }

    public void setCicles(ArrayList<Cicle> cicles) {
        this.cicles = cicles;
    }
}