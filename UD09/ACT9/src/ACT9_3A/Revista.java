package ACT9_3A;
/**
 *
 * @author srhig
 */
public class Revista extends PublicacioBase{
    private int numeroEdicion;
    private double preu;
    public Revista(String titol, int anyPublicacio, int numeroEdicion, double preu) {
        super(titol, anyPublicacio);
        setNumeroEdicion(numeroEdicion);
        setPreu(preu);
    }
    @Override
    public double calculaPrecio() {
        return getPreu() * 1.10;
    }
    public int getNumeroEdicion() {
        return numeroEdicion;
    }
    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }
    public double getPreu() {
        return preu;
    }
    public void setPreu(double preu) {
        this.preu = preu;
    }
    @Override
    public String toString(){
        return super.toString() + ", el numero de la revista és: " + getNumeroEdicion() + " i el seu preu és: " + getPreu();
    }
}