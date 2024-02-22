package ACT6_1A;
public class Cicle {
    int idCicle, numAlumnes;
    String nom;
    // Cicles
    public String mostraCicle() {
        String text;
        
        text = "Cicle " + "ID=" + idCicle + ", nom=" + nom + ", numAlumnes=" + numAlumnes;
        
        return text;
    }
}