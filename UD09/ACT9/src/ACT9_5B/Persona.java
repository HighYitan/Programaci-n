package ACT9_5B;
import java.util.ArrayList;
/**
 *
 * @author srhig
 */
public class Persona {
    private String nom;
    private int edat;
    private ArrayList<ProducteBancari> productesBancaris;
    public Persona(String nom, int edat, ArrayList<ProducteBancari> productesBancaris){
        this.nom = nom;
        this.edat = edat;
        this.productesBancaris = productesBancaris;
    }
    public double calculaRemuneracioTotal(){
        double remuneracio = 0;
        for(ProducteBancari producteBancari : productesBancaris){
            remuneracio += producteBancari.calculaRemuneracio();
        }
        return remuneracio;
    }
    @Override
    public String toString(){
        String text = "El nom de la persona és: " + this.nom + " amb edat: " + this.edat + ", está associat a aquests productes bancaris: ";
        for(ProducteBancari producteBancari : productesBancaris){
            text += "\n" + producteBancari.toString() + " amb remuneració: " + producteBancari.calculaRemuneracio();
        }
        return text;
    }    
}