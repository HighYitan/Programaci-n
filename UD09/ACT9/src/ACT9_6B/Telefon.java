package ACT9_6B;
/**
 *
 * @author alumnat
 */
public final class Telefon extends Electronic{
    public Telefon(String nom, double preu, double consumEnergetic, int gatantiaMesos, int midaPantalla, int ram, int hdd, String processador) {
        super(nom, preu, consumEnergetic, gatantiaMesos, midaPantalla, ram, hdd, processador);
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
        return "\nTelefon: " + super.toString() + ", el seu preu té un descompte de: " + this.calculaDescompte();
    }
}