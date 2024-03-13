package ACT11_1;
/**
 *
 * @author alumnat
 */
public class Persona {
    private String nom;
    private int edat;
    public Persona(String nom, int edat){
        this.nom = nom;
        this.edat = edat;
    }
    public String getNom(){
        return nom;
    }
    @Override
    public String toString() {
        return "Persona{" + "nom=" + nom + ", edat=" + edat + '}';
    }
    
}