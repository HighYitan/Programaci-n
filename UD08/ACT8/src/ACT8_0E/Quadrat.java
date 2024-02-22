package ACT8_0E;
/**
 *
 * @author alumnat
 */
public class Quadrat extends Figura{
    private double costats;
    public Quadrat(String color, double costats) {
        super(color);
        this.costats = costats;
    }
    @Override
    double calcularArea() {
        return Math.pow(this.costats, 2);
    }
    @Override
    double calcularPerimetre() {
        return this.costats * 4;
    }
    @Override
    int calculaNCostats() {
        return 4;
    }
    public double getCostats() {
        return costats;
    }
    public void setCostats(double costats) {
        this.costats = costats;
    }
}