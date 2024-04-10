package ACT11_3;
/**
 *
 * @author srhig
 */
public class Llibre {
    private int id;
    private String titol, autor;
    private int anyPublicacio;
    public Llibre(int id, String titol, String autor, int anyPublicacio){
        this.id = id;
        this.titol = titol;
        this.autor = autor;
        this.anyPublicacio = anyPublicacio;
    }

    @Override
    public String toString() {
        return "Llibre{" + "id=" + id + ", titol=" + titol + ", autor=" + autor + ", anyPublicacio=" + anyPublicacio + '}';
    }

    
    
}