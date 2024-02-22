package ACT7_2;
import java.util.ArrayList;
/**
 * 
 * @author srhig
 */
public class Client {
    private String llinatge1, llinatge2, nom;
    private ArrayList<Compte> comptes;
    //Constructor
    public Client(String llinatge1, String llinatge2, String nom, ArrayList<Compte> comptes) {
        this.llinatge1 = llinatge1;
        this.llinatge2 = llinatge2;
        this.nom = nom;
        this.comptes = comptes;
    }  
    //Métodos específicos
    /**
     * 
     * @param compte
     * @param quantitat 
     */
    void realitzaTransaccio(Compte compte, double quantitat){ // ha de modificar el saldo del compte del client
        /*
        if(quantitat < 0){
            compte.reintegra(Math.abs(quantitat));  // valor en positiu de 'quantitat'
        }
        else{
            compte.ingresa(quantitat);
        }
        */
        /*
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
        */
        // es cerca 'compteAModificar' per a cada 'comptePossible' del 'client'
        for(int contador = 0; contador < comptes.size(); contador++){
            if(comptes.get(contador).equals(compte)){ // es compara pels 4 atributs de cada compte
                if(quantitat > 0){
                    compte.ingresa(quantitat);
                    break;
                }
                else if(quantitat < 0){
                    compte.reintegra(Math.abs(quantitat)); // valor en positiu de 'quantitat'
                    break;
                }
            }
        }
    }
    // ha de mostrar les dades del client
    /**
     * 
     */
    public void mostraClient(){
        System.out.println("Nom complet del client: " + nom + " " + llinatge1 + " " + llinatge2);
    }
    // ha de mostrar cada un dels comptes del client amb els seus saldos
    /**
     * 
     */
    public void mostraSaldo(){
        for(int contador = 0; contador < comptes.size(); contador++){
            System.out.println("Compte del client: " + comptes.get(contador).getNumeroCompte() + " amb saldo: " + comptes.get(contador).getSaldo());
        }
    }
    //Getters y setters
    public String getLlinatge1() {
        return llinatge1;
    }

    public void setLlinatge1(String llinatge1) {
        this.llinatge1 = llinatge1;
    }

    public String getLlinatge2() {
        return llinatge2;
    }

    public void setLlinatge2(String llinatge2) {
        this.llinatge2 = llinatge2;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(ArrayList<Compte> comptes) {
        this.comptes = comptes;
    }
    
}