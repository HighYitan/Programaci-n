package ACT6_1A;
public class Modul {
    String nom;
    int idModul, idCicle, horesSetmanals;
    // Mòduls
    public String mostraModul(int idCicle) {
        String text = "";
        
        if (this.idCicle == idCicle)
            text = "Modul " + "ID=" + idModul + ", nom=" + nom + ", Hores setmanals=" + horesSetmanals;
        
        return text;
    }
}