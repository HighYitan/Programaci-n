package ACT9_5A;
/**
 *
 * @author srhig
 */
public class Hipoteca extends ProducteBancari{
    private double comisApertura;
    private int nombrePeriodes;
    public Hipoteca(String codiProducte, String nom, double importContractat, double interesPeriode, double comisApertura, int nombrePeriodes) {
        super(codiProducte, nom, importContractat, interesPeriode);
        this.comisApertura = comisApertura;
        this.nombrePeriodes = nombrePeriodes;
    }
    @Override
    public double calculaRemuneracio() {
        double remuneracio = - (super.importContractat * super.interesPeriode * nombrePeriodes) - this.comisApertura;
        return remuneracio;
    }
    @Override
    public String toString(){
        return super.toString() + ", la comisió de apertura és " + this.comisApertura + ", el nombre de periodes és: " + this.nombrePeriodes;
    }    
}