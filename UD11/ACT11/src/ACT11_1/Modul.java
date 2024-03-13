package ACT11_1;

import java.util.List;

/**
 *
 * @author alumnat
 */
public class Modul {
    private String nom;
    private int numHores;
    private List<Persona> matricula;
    public Modul(String nom, int numHores, List<Persona> matricula){
        this.nom = nom;
        this.numHores = numHores;
        this.matricula = matricula;
    }
    public String getNom(){
        return nom;
    }
    public List<Persona> getMatricula(){
        return matricula;
    }
    @Override
    public String toString() {
        return "Modul{" + "nom=" + nom + ", numHores=" + numHores + ", matricula=" + matricula + '}';
    }
    
}