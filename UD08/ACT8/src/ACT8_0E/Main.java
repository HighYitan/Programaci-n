package ACT8_0E;
/**
 *
 * @author alumnat
 */
public class Main {
    public static void main(String[] args) {
        Cercle cercle = new Cercle("Vermell", 10);
        Quadrat quadrat = new Quadrat("Groc", 7);
        System.out.println(cercle.toString());
        System.out.println(cercle.calcularArea());
        System.out.println(cercle.calcularPerimetre());
        System.out.println(cercle.calculaNCostats());
        System.out.println(quadrat.toString());
        System.out.println(quadrat.calcularArea());
        System.out.println(quadrat.calcularPerimetre());
        System.out.println(quadrat.calculaNCostats());
    } 
}