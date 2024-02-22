package ACT9_3;
import java.util.ArrayList;
/**
 *
 * @author srhig
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        ArrayList<Concessionari> concessionaris = new ArrayList<>();
        //ArrayList<Automobil> autos = new ArrayList<>();
        ArrayList<Motocicleta> motos = new ArrayList<>();
        //ArrayList<Camio> camions = new ArrayList<>();
        
        ConcessionariAutos concessionariAutos = new ConcessionariAutos();
        concessionariAutos.vehicles.add(new Automobil("Volskwagen", "DWN.009", 50000.00, 4, 500.00));
        
        Vehicle vehicle;
        vehicle = new Automobil("Volkswagen", "DWN.009", 50000.00, 4, 500.00);
        vehicles.add(vehicle);
        vehicle = new Motocicleta("Suzuki", "0001", 12500.88, 500, "Ligera");
        vehicles.add(vehicle);
        vehicle = new Camio("Kawasaki", "DDD", 88140.99, 8000);
        vehicles.add(vehicle);
        
        for(Vehicle v : vehicles){
            
            /*if(v instanceof Automobil || v instanceof Camio){
                Automobil auto = (Automobil) v;
                autos.add(auto); 
            }*/
            if(v instanceof Motocicleta){
                Motocicleta moto = (Motocicleta) v;
                motos.add(moto);
                vehicles.remove(v);
            }
            /*else if(v instanceof Camio){
                Camio camio = (Camio) v;
                camions.add(camio);
            }*/
        }
        Concessionari concessionari;
        //concessionari = new ConcessionariAutos(autos, camions);
        concessionari = new ConcessionariAutos(vehicles);
        concessionaris.add(concessionari);
        concessionari = new ConcessionariMotos(motos);
        concessionaris.add(concessionari);
        for(Concessionari c : concessionaris){
            if(c instanceof ConcessionariAutos){
                System.out.println("Concessionari autos:");
                for(Vehicle v : vehicles){
                    if(v instanceof Automobil || v instanceof Camio){
                        System.out.println(v.toString());
                    }
                }
                ConcessionariAutos concessionariAuto = (ConcessionariAutos) c;
                System.out.println("Ingressos bruts: " + concessionariAuto.calculaIngressos());
            }
            else if(c instanceof ConcessionariMotos){
                System.out.println("Concessionari motos:");
                /*for(Vehicle v : vehicles){
                    if(v instanceof Motocicleta){
                        System.out.println(v.toString());
                    }
                }*/
                for(Motocicleta moto : motos){
                    System.out.println(moto.toString());
                }                
                ConcessionariMotos concessionariMoto = (ConcessionariMotos) c;
                System.out.println("Ingressos bruts: " + concessionariMoto.calculaIngressos());
            }
        }
    }
    private void carregaVehicles(ArrayList<Vehicle> vehicles){
        Vehicle vehicle;
        vehicle = new Automobil("Volkswagen", "DWN.009", 50000.00, 4, 500.00);
        vehicles.add(vehicle);
        vehicle = new Motocicleta("Suzuki", "0001", 12500.88, 500, "Ligera");
        vehicles.add(vehicle);
        vehicle = new Camio("Kawasaki", "DDD", 88140.99, 8000);
        vehicles.add(vehicle);        
    }
    private void carregaMotos(ArrayList<Motocicleta> motos){
        
    }
}