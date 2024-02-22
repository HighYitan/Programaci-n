package ACT9_4;
import java.util.ArrayList;
/**
 *
 * @author srhig
 */
public class ConcessionariAutos implements Concessionari{
    //ArrayList<Automobil> autos;
    //ArrayList<Camio> camions;
    private ArrayList<Vehicle> vehicles;
    public ConcessionariAutos(ArrayList<Vehicle> vehicles){
        //this.autos = autos;
        //this.camions = camions;
        this.vehicles = vehicles;
    }
    public ConcessionariAutos(){
        
    }
    @Override
    public double calculaIngressos() {
        double ingressos = 0;
        /*for(Automobil auto : autos){
            ingressos += auto.getPreu() + auto.calculaImpost();
        }
        for(Camio camio : camions){
            ingressos += camio.getPreu() + camio.calculaImpost();
        }*/
        for(Vehicle vehicle : vehicles){
            if(vehicle instanceof Automobil){
                Automobil auto = (Automobil) vehicle;
                ingressos += auto.getPreu() + auto.calculaImpost();
            }
            else if(vehicle instanceof Camio){
                Camio camio = (Camio) vehicle;
                ingressos += camio.getPreu() + camio.calculaImpost();
            }
        }
        return ingressos;
    }
    public void setVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
    @Override
    public String toString(){
        String info = "";
        /*for(Automobil auto: autos){
            info += auto.toString() + "\n";
        }
        for(Camio camio : camions){
            info += camio.toString() + "\n";
        }*/
        for(Vehicle vehicle : vehicles){
            info += vehicle.toString() + ", imposts: " + vehicle.calculaImpost() + "\n";
        }
        return info;
    }
}