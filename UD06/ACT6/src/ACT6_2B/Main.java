package ACT6_2B;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        try{
            // Declarar i instanciar un compte bancari
            ArrayList<Compte> comptes = new ArrayList<>();
            Compte compte1 = new Compte();
            compte1.banc = "0001";
            compte1.oficina = "0001";
            compte1.dc = "01";
            compte1.numeroCompte = "0000000001";
            comptes.add(compte1);
            
            Compte compte2 = new Compte();
            compte2.banc = "0002";
            compte2.oficina = "0002";
            compte2.dc = "02";
            compte2.numeroCompte = "0000000002";
            comptes.add(compte2);
            // Declarar i instanciar un client
            Client client1 = new Client();
            client1.nom = "Khris";
            client1.llinatge1 = "Máximo";
            client1.llinatge2 = "Red";
            client1.comptes = comptes;
            // Realitzar transaccions
            client1.realitzaTransaccio(compte1,500.0);
            client1.realitzaTransaccio(compte1,-200.0);
            client1.realitzaTransaccio(compte2,1000.0);
            client1.realitzaTransaccio(compte2,-500.0);
            // Mostrar saldo final
            client1.mostraClient();
            client1.mostraSaldo();
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}