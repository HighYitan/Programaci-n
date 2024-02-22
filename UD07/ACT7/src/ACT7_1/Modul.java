package ACT7_1;
/**
 *
 * @author srhig
 */
public class Modul {
    private int idModul, horesSetmanals;
    private static int comptadorModuls = 1;
    private String nom;
    //Constructor
    public Modul(int horesSetmanals, String nom) {
        this.idModul = getComptadorModuls();
        this.horesSetmanals = horesSetmanals;
        this.nom = nom;
    }
    //Métodos específicos
    /**
     * 
     * @return 
     */
    
    //Getters y setters
    public int getIdModul() {
        return idModul;
    }

    public void setIdModul(int idModul) {
        this.idModul = idModul;
    }

    public int getHoresSetmanals() {
        return horesSetmanals;
    }

    public void setHoresSetmanals(int horesSetmanals) {
        this.horesSetmanals = horesSetmanals;
    }

    public static int getComptadorModuls() {
        return comptadorModuls++;
    }

    public static void setComptadorModuls(int comptadorModuls) {
        Modul.comptadorModuls = comptadorModuls;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
}