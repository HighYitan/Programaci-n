package ACT9_3B;
/**
 *
 * @author srhig
 */
public class Llibre extends PublicacioBase{
    private String autor;
    public Llibre(String titol, int anyPublicacio, double preu, String autor) {
        super(titol, anyPublicacio, preu);
        setAutor(autor);
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
    @Override
    public String toString(){
        return super.toString() + ", el seu autor és: " + getAutor();
    }
}