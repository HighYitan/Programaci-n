package ACT9_6A;
/**
 *
 * @author alumnat
 */
abstract class Producte {
    private String nom;
    private double preu, consumEnergetic;
    private int garantiaMesos, midaPantalla;
    public Producte(String nom, double preu, double consumEnergetic, int gatantiaMesos, int midaPantalla){
        this.nom = nom;
        this.preu = preu;
        this.consumEnergetic = consumEnergetic;
        this.garantiaMesos = garantiaMesos;
        this.midaPantalla = midaPantalla;
    }
    abstract double calculaDescompte();
    @Override
    public String toString(){
        return "Nom del producte: " + this.nom + ", amb preu base de: " + this.preu + 
                ", amb un consum energetic de: " + this.consumEnergetic + 
                "W, té una garantia de: " + this.garantiaMesos +
                " mesos i la pantalla té una mida de: " + this.midaPantalla; 
    }
    public double getPreu(){
        return preu;
    }
    public double getConsumEnergetic(){
        return consumEnergetic;
    }
    public int getGarantiaMesos(){
        return garantiaMesos;
    }
    public int getMidaPantalla(){
        return midaPantalla;
    }
}