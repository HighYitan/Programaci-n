package ACT9_5B;
/**
 *
 * @author srhig
 */
abstract class ProducteBancari {
    private String codiProducte, nom;
    protected double importContractat, interesPeriode;
    public ProducteBancari(String codiProducte, String nom, double importContractat, double interesPeriode){
        this.codiProducte = codiProducte;
        this.nom = nom;
        this.importContractat = importContractat;
        this.interesPeriode = interesPeriode;
    }
    abstract double calculaRemuneracio();
    @Override
    public String toString(){
        return "El codi del producte és: " + this.codiProducte + " amb nom: " + this.nom + ", el import contractat és: " + this.importContractat + " i el interes del periode actual és: " + this.interesPeriode;
    }
}