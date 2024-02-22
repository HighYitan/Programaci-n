package ACT9_6A;
/**
 *
 * @author alumnat
 */
public final class Telefon extends Producte{

    public Telefon(String nom, double preu, double consumEnergetic, int gatantiaMesos, int midaPantalla) {
        super(nom, preu, consumEnergetic, gatantiaMesos, midaPantalla);
    }

    @Override
    double calculaDescompte() {
        if(super.getGarantiaMesos() < 6){
            return super.getPreu() * 0.10;
        }
        else{
            return super.getPreu() * 0.05;
        }
    }
    @Override
    public String toString() {
        return "Telefon: " + super.toString() + ", el seu preu té un descompte de: " + this.calculaDescompte();
    }
    
}