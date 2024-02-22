package ACT6_2B;
import java.util.ArrayList;
public class Client {
    String llinatge1, llinatge2, nom;
    ArrayList<Compte> comptes;
    void realitzaTransaccio(Compte compte, double quantitat){ // ha de modificar el saldo del compte del client
        /*
        if(quantitat < 0){
            compte.reintegra(Math.abs(quantitat));  // valor en positiu de 'quantitat'
        }
        else{
            compte.ingresa(quantitat);
        }
        */
        String compteComplet1 = compte.banc + compte.oficina + compte.dc + compte.numeroCompte;
        String compteComplet2 = "";
        for(int contador = 0; contador < comptes.size(); contador++){
            compteComplet2 = comptes.get(contador).banc + comptes.get(contador).oficina + comptes.get(contador).dc + comptes.get(contador).numeroCompte;
            if (compteComplet1.equalsIgnoreCase(compteComplet2))
                if (quantitat > 0)
                    comptes.get(contador).ingresa(quantitat);
                else if (quantitat < 0) 
                    comptes.get(contador).reintegra(Math.abs(quantitat));  // valor en positiu de 'quantitat'
        }
        
    }
    // ha de mostrar les dades del client
    public void mostraClient(){
        System.out.println("Nom complet del client: " + nom + " " + llinatge1 + " " + llinatge2);
    }
    // ha de mostrar cada un dels comptes del client amb els seus saldos
    public void mostraSaldo(){
        for(int contador = 0; contador < comptes.size(); contador++){
            System.out.println("Compte del client: " + comptes.get(contador).numeroCompte + " amb saldo: " + comptes.get(contador).saldo);
        }
    }
}