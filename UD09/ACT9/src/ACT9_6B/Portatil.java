package ACT9_6B;
/**
 *
 * @author alumnat
 */
public final class Portatil extends Electronic{
    public Portatil(String nom, double preu, double consumEnergetic, int gatantiaMesos, int midaPantalla, int ram, int hdd, String processador) {
        super(nom, preu, consumEnergetic, gatantiaMesos, midaPantalla, ram, hdd, processador);
    }
    @Override
    double calculaDescompte() {
        if(super.getConsumEnergetic() > 20){
            return super.getPreu() * 0.15;
        }
        else{
            return super.getPreu() * 0.10;
        }
    }
    @Override
    public String toString() {
        return "\nPortatil: " + super.toString() + ", el seu preu té un descompte de: " + this.calculaDescompte();
    }
}