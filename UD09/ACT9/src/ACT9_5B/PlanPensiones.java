package ACT9_5B;
/**
 *
 * @author alumnat
 */
public class PlanPensiones extends ProducteBancari{
    private int nombrePeriodes;
    public PlanPensiones(String codiProducte, String nom, double importContractat, double interesPeriode, int nombrePeriodes) {
        super(codiProducte, nom, importContractat, interesPeriode);
        this.nombrePeriodes = nombrePeriodes;
    }
    @Override
    public double calculaRemuneracio() {
        return (super.importContractat * super.interesPeriode * nombrePeriodes);
    }
    @Override
    public String toString(){
        return super.toString() + ", el nombre de periodes és: " + this.nombrePeriodes;
    }
}