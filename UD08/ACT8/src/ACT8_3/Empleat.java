package ACT8_3;
/**
 *
 * @author srhig
 */
public abstract class Empleat {
    //Atributs
    protected String nom, llinatge1;
    protected double souBase; //Per mes o per hora treballada.
    //Constructor
    public Empleat(String nom, String llinatge1, double souBase){
        this.nom = nom;
        this.llinatge1 = llinatge1;
        this.souBase = souBase;
    }
    //Métodos específicos
    /**
     * Método abstracto para calcular salario
     */
    public abstract double calcularSalari();
    // Método para mostrar detalles del empleado
    @Override
    public String toString(){
        return "Nombre: " + nom + " " + llinatge1 + ", Sou Base: " + souBase + ", Salari: " + calcularSalari();
    }
    // Método para comparar dos objetos y saber si son exactamente iguales en valor o no.
    @Override
    public boolean equals(Object obj){
        Empleat empleat = (Empleat) obj;
        
        return (this.getNom().equals(empleat.nom)) && (this.getLlinatge1().equals(empleat.llinatge1));        
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLlinatge1() {
        return llinatge1;
    }

    public void setLlinatge1(String llinatge1) {
        this.llinatge1 = llinatge1;
    }

    public double getSouBase() {
        return souBase;
    }

    public void setSouBase(double souBase) {
        this.souBase = souBase;
    }
}