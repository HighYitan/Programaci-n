package ACT9_4;
/**
 *
 * @author srhig
 */
public class Camio extends Vehicle{
    private double capacitatCarrega;
    public Camio(String marca, String model, double preu, double capacitatCarrega){
        super(marca, model, preu);
        this.capacitatCarrega = capacitatCarrega;
    }
    @Override
    public double calculaImpost() {
        return getPreu() * 0.15;
    }
    @Override
    public String toString(){
        return super.toString() + ", capacitat de carrega: " + capacitatCarrega;
    }    
}