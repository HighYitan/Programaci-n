package ACT9_3;
/**
 *
 * @author srhig
 */
public class Automobil extends Vehicle{
    private int numPortes;
    private double capacitatMaleter;
    public Automobil(String marca, String model, double preu, int numPortes, double capacitatMaleter) { //Constructor completo
        super(marca, model, preu);
        this.numPortes = numPortes;
        this.capacitatMaleter = capacitatMaleter;
    }
    @Override
    public double calculaImpost() {
        return super.getPreu() * 0.10;
    }
    @Override
    public String toString(){
        return super.toString() + ", numero de portes: " + numPortes + ", té una capacitat de maleter de: " + capacitatMaleter;
    }
}