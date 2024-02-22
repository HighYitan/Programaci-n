package ACT9_3A;
/**
 *
 * @author srhig
 */
abstract class PublicacioBase implements Publicacio{
    private String titol;
    private int anyPublicacio;
    public PublicacioBase(String titol, int anyPublicacio){
        setTitol(titol);
        setAnyPublicacio(anyPublicacio);
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
    @Override
    public String toString(){
        return "Publicacio amb titol: " + getTitol() + " va ser publicat a " + getAnyPublicacio();
    }
}