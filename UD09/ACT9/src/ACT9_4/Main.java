package ACT9_4;
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
        ////ArrayList<Concessionari> concessionaris = new ArrayList<>();
        ArrayList<Motocicleta> motos = new ArrayList<>();
        ConcessionariAutos concessionariAutos = creaConcessionariAutos(vehicles);
        ConcessionariMotos concessionariMotos = creaConcessionariMotos(motos);
        System.out.println(concessionariAutos.toString());
        System.out.println(concessionariMotos.toString());
        System.out.println("Ingressos del Concesionari de Autos: " + concessionariAutos.calculaIngressos());
        System.out.println("Ingressos del Concesionari de Motos: " + concessionariMotos.calculaIngressos());
        //Vehicle vehicle;
        //vehicle = new Automobil("Volkswagen", "DWN.009", 50000.00, 4, 500.00);
        //vehicles.add(vehicle);
        //vehicle = new Motocicleta("Suzuki", "0001", 12500.88, 500, "Ligera");
        //vehicles.add(vehicle);
        //vehicle = new Camio("Kawasaki", "DDD", 88140.99, 8000);
        //vehicles.add(vehicle);
        
        //for(Vehicle v : vehicles){
            
            /*if(v instanceof Automobil || v instanceof Camio){
                Automobil auto = (Automobil) v;
                autos.add(auto); 
            }*/
        //    if(v instanceof Motocicleta){
        //        Motocicleta moto = (Motocicleta) v;
        //        motos.add(moto);
        //        vehicles.remove(v);
        //    }
            /*else if(v instanceof Camio){
                Camio camio = (Camio) v;
                camions.add(camio);
            }*/
        //}
        //Concessionari concessionari;
        ////concessionari = new ConcessionariAutos(autos, camions);
        //concessionari = new ConcessionariAutos(vehicles);
        //concessionaris.add(concessionari);
        //concessionari = new ConcessionariMotos(motos);
        //concessionaris.add(concessionari);
        //for(Concessionari c : concessionaris){
        //    if(c instanceof ConcessionariAutos){
        //        System.out.println("Concessionari autos:");
        //        for(Vehicle v : vehicles){
        //            if(v instanceof Automobil || v instanceof Camio){
        //                System.out.println(v.toString());
        //            }
        //        }
        //        ConcessionariAutos concessionariAuto = (ConcessionariAutos) c;
        //        System.out.println("Ingressos bruts: " + concessionariAuto.calculaIngressos());
        //    }
        //    else if(c instanceof ConcessionariMotos){
        //        System.out.println("Concessionari motos:");
                /*for(Vehicle v : vehicles){
                    if(v instanceof Motocicleta){
                        System.out.println(v.toString());
                    }
                }*/
        //        for(Motocicleta moto : motos){
        //            System.out.println(moto.toString());
        //        }                
        //        ConcessionariMotos concessionariMoto = (ConcessionariMotos) c;
        //        System.out.println("Ingressos bruts: " + concessionariMoto.calculaIngressos());
        //    }
        //}
        /*
        ConcessionariAutos concessionariAutos = new ConcessionariAutos();
        creaConcessionariAutos(concessionariAutos);

        ConcessionariMotos concessionariMotos = new ConcessionariMotos();
        creaConcessionariMotos(concessionariMotos);

        // Mostrar resultats
        System.out.println(concessionariAutos.toString());
        System.out.println(concessionariMotos.toString());
        System.out.println("Ingressos del Concesionari de Autos: " + concessionariAutos.calculaIngressos());
        System.out.println("Ingressos del Concesionari de Motos: " + concessionariMotos.calculaIngressos());
        */
    }
    private static void carregaVehicles(ArrayList<Vehicle> vehicles){
        Vehicle vehicle;
        vehicle = new Automobil("Volkswagen", "DWN.009", 50000.00, 4, 500.00);
        vehicles.add(vehicle);
        vehicle = new Camio("Kawasaki", "DDD", 88140.99, 8000);
        vehicles.add(vehicle);        
    }
    private static void carregaMotos(ArrayList<Motocicleta> motos){
        Motocicleta moto;
        moto = new Motocicleta("Suzuki", "0001", 12500.88, 500, "Ligera");
        motos.add(moto);
    }
    private static ConcessionariAutos creaConcessionariAutos(ArrayList<Vehicle> vehicles) {
        carregaVehicles(vehicles);
        ConcessionariAutos concessionariAutos = new ConcessionariAutos(vehicles);
        return concessionariAutos;
        /*concessionariAutos.setVehicle(new Automobil("Renault", "Megane", 25000.0, "Turisme", 4, 500.0));
        concessionariAutos.setVehicle(new Automobil("Honda", "Civic", 22000.0, "Turisme", 4, 450.0));
        concessionariAutos.setVehicle(new Camio("Pegasus", "Brabus",15000,"Trucker", 5000.0));
        concessionariAutos.setVehicle(new Camio("Ebro", "Santana",10000, "Truck", 500.0));
        concessionariAutos.setVehicle(new Motocicleta("Labretta", "Model D", 3300.0, "Scotter", 125));*/
    }
    
    private static ConcessionariMotos creaConcessionariMotos(ArrayList<Motocicleta> motos) {
        carregaMotos(motos);
        ConcessionariMotos concessionariMotos = new ConcessionariMotos(motos);
        return concessionariMotos;
        /*concessionariMotos.setMotocicleta(new Motocicleta("Vespa", "Primavera", 2000.0, "Scotter", 125));
        concessionariMotos.setMotocicleta(new Motocicleta("Honda", "CBR", 15000.0, "Deportiva", 600));*/
    }
    
}