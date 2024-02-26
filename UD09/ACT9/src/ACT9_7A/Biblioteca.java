package ACT9_7A;
import java.util.ArrayList;
/**
 *
 * @author srhig
 */
public class Biblioteca {
    private ArrayList<Llibre> llibres = new ArrayList<>();
    public Biblioteca(){
        this.llibres = llibres;
    }
    public void afegeixLlibre(Llibre llibre){
        llibres.add(llibre);
    }
    public Llibre cercaLlibre(String titol){
        for(Llibre llibre : llibres){
            if(titol == llibre.getTitol()){
                return llibre;
            }
        }
        return null;
    }
    @Override
    public String toString(){
        String text = "Els llibres de aquesta biblioteca son:";
        for(Llibre llibre : llibres){
            text += "\n" + llibre;
        }
        return text;
    }
}