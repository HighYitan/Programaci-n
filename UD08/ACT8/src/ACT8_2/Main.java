package ACT8_2;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        try{
            // Declarar i instanciar un compte bancari
            ArrayList<Compte> comptes1 = new ArrayList<>();
            Compte compte1 = new Compte("0001", "0001", "01", "0000000001", 0);
            comptes1.add(compte1);
            
            Compte compte2 = new Compte("0001", "0001", "01", "0000000002", 0);
            comptes1.add(compte2);
            // Declarar i instanciar un client
            //Client client1 = new Client("Máximo", "Red", "Khris");
            //client1.setComptes(comptes); //setComptes sin recibir arraylist desde constructor
            Client client1 = new Client("Máximo", "Red", "Khris", comptes1); //Set comptes con el constructor completo, con el arraylist dentro.
            try{
                // Realitzar transaccions
                client1.realitzaTransaccio(compte1,500.0);
                client1.realitzaTransaccio(compte1,-200.0);
                client1.realitzaTransaccio(compte2,1000.0);
                client1.realitzaTransaccio(compte2,-500.0);
                client1.realitzaTransaccio(compte2,-1500.0);
            }
            catch(Exception e){
                System.err.println(e.getMessage());
            }
            // Mostrar saldo final            
            System.out.println(client1.toString());
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}