package ACT9_7A;
/**
 *
 * @author srhig
 */
public class Llibre {
    private String titol, autor;
    private int anyPublicacio;
    private double preu;
    public Llibre(String titol, String autor, int anyPublicacio, double preu){
        this.titol = titol;
        this.autor = autor;
        this.anyPublicacio = anyPublicacio;
        this.preu = preu;
    }
    public String getTitol(){
        return titol;
    }
    @Override
    public String toString() {
        return "Llibre {" +
                "titol: '" + this.titol + '\'' +
                ", autor: '" + this.autor + '\'' +
                ", anyPublicacio: " + this.anyPublicacio +
                ", preu: " + this.preu +
                '}';
    }
}