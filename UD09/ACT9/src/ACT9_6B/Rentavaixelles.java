package ACT9_6B;
/**
 *
 * @author srhig
 */
public final class Rentavaixelles extends Electrodomestic{
    public Rentavaixelles(String nom, double preu, double consumEnergetic, int gatantiaMesos, char classeEnergetica) {
        super(nom, preu, consumEnergetic, gatantiaMesos, classeEnergetica);
    }
    @Override
    public String toString() {
        return "\nRentavaixelles: " + super.toString() + ", el seu preu té un suplement de: " + super.calculaSuplement();
    }
}