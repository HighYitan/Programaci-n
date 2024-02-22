package ACT9_3B;
/**
 *
 * @author srhig
 */
abstract class PublicacioBase implements Publicacio{
    private String titol;
    private int anyPublicacio;
    private double preu;
    public PublicacioBase(String titol, int anyPublicacio, double preu){
        setTitol(titol);
        setAnyPublicacio(anyPublicacio);
        setPreu(preu);
    }
    public String getTitol() {
        return titol;
    }
    public void setTitol(String titol) {
        this.titol = titol;
    }
    public int getAnyPublicacio() {
        return anyPublicacio;
    }
    public void setAnyPublicacio(int anyPublicacio) {
        this.anyPublicacio = anyPublicacio;
    }
    public double getPreu() {
        return preu;
    }
    public void setPreu(double preu) {
        this.preu = preu;
    }
    @Override
    public String toString(){
        return "Publicacio amb titol: " + getTitol() + " va ser publicat a " + getAnyPublicacio() + ", amb preu: " + getPreu();
    }
}