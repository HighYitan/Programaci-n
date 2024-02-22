package ACT9_6A;
/**
 *
 * @author alumnat
 */
public class Portatil extends Producte{
    public Portatil(String nom, double preu, double consumEnergetic, int gatantiaMesos, int midaPantalla) {
        super(nom, preu, consumEnergetic, gatantiaMesos, midaPantalla);
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
        return "Portatil: " + super.toString() + ", el seu preu té un descompte de: " + this.calculaDescompte();
    }
}