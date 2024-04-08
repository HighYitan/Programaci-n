package ACT9_7A;
import java.util.ArrayList;
/**
 *
 * @author srhig
 */
public class Client {
    private String nom, cognom;
    private ArrayList<Llibre> llibresPrestats = new ArrayList<>();
    public Client(String nom, String cognom){
        this.nom = nom;
        this.cognom = cognom;
        this.llibresPrestats = llibresPrestats;
    }
    public void prestaLlibre(Llibre llibre){
        llibresPrestats.add(llibre);
    }
    @Override
    public String toString(){
        String text = "Nom i cognom de la persona: " + this.nom + " " + this.cognom +
                      "\nEls llibres prestats a aquesta persona son:";
        for(Llibre llibrePrestat : llibresPrestats){
            text += "\n" + llibrePrestat;
        }
        return text;
    }
}