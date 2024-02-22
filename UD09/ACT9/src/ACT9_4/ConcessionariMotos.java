package ACT9_4;
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
    public void setMotocicleta(Motocicleta moto) {
        motos.add(moto);
    }
    @Override
    public String toString(){
        String info = "";
        for(Motocicleta moto: motos){
            info += moto.toString() + ", imposts: " + moto.calculaImpost() + "\n";
        }
        return info;
    }    
}