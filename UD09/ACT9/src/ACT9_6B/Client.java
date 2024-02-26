package ACT9_6B;
import java.util.ArrayList;
/**
 *
 * @author alumnat
 */
public class Client {
    private String nom, cognom;
    private ArrayList<Producte> productes;
    public Client(String nom, String cognom, ArrayList<Producte> productes){
        this.nom = nom;
        this.cognom = cognom;
        this.productes = productes;
    }
    public double calculaPreuTotal(){
        double preuTotal = 0.0;
        for(Producte producte : productes){
            if(producte instanceof Electronic){
                preuTotal += producte.getPreu() - ((Electronic) producte).calculaDescompte();
            }
            else if(producte instanceof Electrodomestic){
                preuTotal += producte.getPreu() + ((Electrodomestic) producte).calculaSuplement();
            }
        }
        return preuTotal;
    }
    @Override
    public String toString() {
        String text = "Client amb nom i cognom: " + this.nom + " " + this.cognom + " té els productes següents:";
        for(Producte producte : productes){
            text += "\n" + producte.toString();
        }
        text += "\nEn conjunt tenen un preu total de: " + this.calculaPreuTotal();
        return text;
    }
}