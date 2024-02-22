package ACT6_2A;
public class Main {
    public static void main(String[] args) {
        try{
            // Declarar i instanciar un compte bancari
            Compte compte1 = new Compte();
            compte1.banc = "0001";
            compte1.oficina = "0001";
            compte1.dc = "01";
            compte1.numeroCompte = "0000000001";
            // Declarar i instanciar un client
            Client client1 = new Client();
            client1.nom = "Khris";
            client1.llinatge1 = "Máximo";
            client1.llinatge2 = "Red";
            client1.compte = compte1;
            // Realitzar transaccions
            client1.realitzaTransaccio(500);
            client1.realitzaTransaccio(-200);
            // Mostrar saldo final
            System.out.println("Client " + client1.nom + " " + client1.llinatge1 + " amb SALDO " + 
                               client1.compte.saldo );
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}