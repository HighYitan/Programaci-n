package ACT9_5A;
import java.util.ArrayList;
/**
 *
 * @author srhig
 */
public class CompteEstalvis extends ProducteBancari{
    private double comisMantCompte;
    private ArrayList<Tarjeta> tarjetes;
    public CompteEstalvis(String codiProducte, String nom, double importContractat, double interesPeriode, double comisMantCompte, ArrayList<Tarjeta> tarjetes) {
        super(codiProducte, nom, importContractat, interesPeriode);
        this.comisMantCompte = comisMantCompte;
        this.tarjetes = tarjetes;
    }
    @Override
    public double calculaRemuneracio() {
        double remuneracio = -(this.comisMantCompte);
        for (Tarjeta t : this.tarjetes) {
            remuneracio -= t.comisUs;
        }
        return remuneracio;
    }
    @Override
    public String toString(){
        String text = super.toString() + ", la comisió per mantenir el seu compte és: " + this.comisMantCompte;
        /*for(Tarjeta tarjeta : tarjetes){
            text += tarjeta.toString() + "\n"; //He decidido no mostrar los datos de las tarjetas porque puede suponer una brecha de seguridad para el usuario (codiTarjeta) y por eso no he implementado el toString en la clase Tarjeta.
        }*/
        return text;
    }
}