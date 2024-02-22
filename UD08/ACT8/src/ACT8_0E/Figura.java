package ACT8_0E;
/**
 *
 * @author alumnat
 */
abstract class Figura {
    private String color;
    public Figura(String color){
        this.color = color;
    }
    abstract double calcularArea();
    abstract double calcularPerimetre();
    abstract int calculaNCostats();
    @Override
    public String toString() {
        return "El color de la figura es: " + color;
    }
}