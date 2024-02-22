package ACT9_3;
import java.util.ArrayList;
/**
 *
 * @author srhig
 */
public class ConcessionariMotos implements Concessionari{
    ArrayList<Motocicleta> motos;
    public ConcessionariMotos(ArrayList<Motocicleta> motos){
        this.motos = motos;
    }
    @Override
    public double calculaIngressos() {
        double ingressos = 0;
        for(Motocicleta moto : motos){
            ingressos += moto.getPreu() + moto.calculaImpost();
        }
        return ingressos;
    }
    @Override
    public String toString(){
        String info = "";
        for(Motocicleta moto: motos){
            info += moto.toString() + "\n";
        }
        return info;
    }    
}