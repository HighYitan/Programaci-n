package ACT9_6B;
/**
 *
 * @author alumnat
 */
public final class Televisor extends Electronic{
    public Televisor(String nom, double preu, double consumEnergetic, int gatantiaMesos, int midaPantalla, int ram, int hdd, String processador) {
        super(nom, preu, consumEnergetic, gatantiaMesos, midaPantalla, ram, hdd, processador);
    }
    @Override
    double calculaDescompte() {
        if(super.getMidaPantalla() > 40){
            return super.getPreu() * 0.12;
        }
        else{
            return super.getPreu() * 0.08;
        }
    }
    @Override
    public String toString() {
        return "\nTelevisor: " + super.toString() + ", el seu preu té un descompte de: " + this.calculaDescompte();
    }
}