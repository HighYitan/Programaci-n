package ACT9_6B;
/**
 *
 * @author srhig
 */
public final class Rentadora extends Electrodomestic{
    private int capacitatCarrega;
    public Rentadora(String nom, double preu, double consumEnergetic, int gatantiaMesos, char classeEnergetica, int capacitatCarrega) {
        super(nom, preu, consumEnergetic, gatantiaMesos, classeEnergetica);
        this.capacitatCarrega = capacitatCarrega;
    }
    @Override
    public String toString() {
        return "\nRentadora: " + super.toString() + ", amb una capacitat de carrega de: " + this.capacitatCarrega + "KG,\nel seu preu té un suplement de: " + super.calculaSuplement();
    }
}