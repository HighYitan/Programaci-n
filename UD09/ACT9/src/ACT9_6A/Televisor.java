package ACT9_6A;
/**
 *
 * @author alumnat
 */
public class Televisor extends Producte{
    public Televisor(String nom, double preu, double consumEnergetic, int gatantiaMesos, int midaPantalla) {
        super(nom, preu, consumEnergetic, gatantiaMesos, midaPantalla);
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
        return "Televisor: " + super.toString() + ", el seu preu té un descompte de: " + this.calculaDescompte();
    }
}