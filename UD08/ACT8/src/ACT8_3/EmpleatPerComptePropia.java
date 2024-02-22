package ACT8_3;
/**
 *
 * @author srhig
 */
// Clase concreta EmpleadoPorHora
public class EmpleatPerComptePropia extends Empleat{
    //Atributo adicional
    private int horesTreballades;
    //Constructor
    public EmpleatPerComptePropia(String nom, String llinatge1, double souBase, int horesTreballades) {
        super(nom, llinatge1, souBase);
        this.horesTreballades = horesTreballades;
    }
    // Implementación del método abstracto    
    @Override
    public double calcularSalari() {
        // El salario total para empleados por hora depende de las horas trabajadas
        return souBase * horesTreballades;
    }
    //Getters y setters
    public int getHoresTreballades() {
        return horesTreballades;
    }

    public void setHoresTreballades(int horesTreballades) {
        this.horesTreballades = horesTreballades;
    }
}