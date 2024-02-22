package ACT9_3B;
/**
 *
 * @author srhig
 */
public class Revista extends PublicacioBase{
    private int numeroEdicion;
    public Revista(String titol, int anyPublicacio, double preu, int numeroEdicion) {
        super(titol, anyPublicacio, preu);
        setNumeroEdicion(numeroEdicion);
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
    @Override
    public String toString(){
        return super.toString() + ", el numero de la revista és: " + getNumeroEdicion();
    }
}