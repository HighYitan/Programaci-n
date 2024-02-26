package ACT9_6B;
/**
 *
 * @author alumnat
 */
abstract class Producte {
    private String nom;
    private double preu, consumEnergetic;
    private int garantiaMesos;
    public Producte(String nom, double preu, double consumEnergetic, int gatantiaMesos){
        this.nom = nom;
        this.preu = preu;
        this.consumEnergetic = consumEnergetic;
        this.garantiaMesos = garantiaMesos;
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
    @Override
    public String toString(){
        return "Nom del producte: " + this.nom + ", amb preu base de: " + this.preu + 
                "\n, amb un consum energetic de: " + this.consumEnergetic + 
                "W\n, té una garantia de: " + this.garantiaMesos + " mesos";
    }
    @Override
    public boolean equals(Object o){
        Producte producte = (Producte) o;
        return (this.nom.equals(producte.nom));
    }
}