package ACT8_0E;
/**
 *
 * @author alumnat
 */
public class Cercle extends Figura{
    private double radi;
    public Cercle(String color, double radi){
        super(color);
        this.radi = radi;
    }
    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(radi, 2);
    }
    @Override
    public double calcularPerimetre(){
        return Math.PI * 2 * radi;
    }
    @Override
    public int calculaNCostats(){
        return 0;
    }
}