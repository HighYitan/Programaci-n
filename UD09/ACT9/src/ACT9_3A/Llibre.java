package ACT9_3A;
/**
 *
 * @author srhig
 */
public class Llibre extends PublicacioBase{
    private String autor;
    private double preu;
    public Llibre(String titol, int anyPublicacio, String autor, double preu) {
        super(titol, anyPublicacio);
        setAutor(autor);
        setPreu(preu);
    }
    @Override
    public double calculaPrecio() {
        return getPreu() * 1.21;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public double getPreu() {
        return preu;
    }
    public void setPreu(double preu) {
        this.preu = preu;
    }
    @Override
    public String toString(){
        return super.toString() + ", el seu autor és: " + getAutor() + " i el seu preu és: " + getPreu();
    }
}