package ACT9_3;
/**
 *
 * @author srhig
 */
public class Motocicleta extends Vehicle{
    private int cilindrada;
    private String tipus;
    public Motocicleta(String marca, String model, double preu, int cilindrada, String tipus){
        super(marca, model, preu);
        this.cilindrada = cilindrada;
        this.tipus = tipus;
    }
    @Override
    public double calculaImpost() {
        return getPreu() * 0.05;
    }
    @Override
    public String toString(){
        return super.toString() + ", cilindrada: " + cilindrada + ", tipus de moto: " + tipus;
    }
}