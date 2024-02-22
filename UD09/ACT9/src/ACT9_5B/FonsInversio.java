package ACT9_5B;
/**
 *
 * @author srhig
 */
public class FonsInversio extends ProducteBancari{
    private double comisApertura;
    private int nombrePeriodes;
    public FonsInversio(String codiProducte, String nom, double importContractat, double interesPeriode, double comisApertura, int nombrePeriodes) {
        super(codiProducte, nom, importContractat, interesPeriode);
        this.comisApertura = comisApertura;
        this.nombrePeriodes = nombrePeriodes;
    }
    @Override
    public double calculaRemuneracio() {
        return - (super.importContractat * super.interesPeriode * this.nombrePeriodes) - this.comisApertura;
    }
    @Override
    public String toString(){
        return super.toString() + ", la comisió de apertura és " + this.comisApertura + ", el nombre de periodes és: " + this.nombrePeriodes;
    }
}