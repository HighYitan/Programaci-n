package ACT6_2A;
public class Client {
    String llinatge1, llinatge2, nom;
    Compte compte;
    void realitzaTransaccio(double quantitat){ // ha de modificar el saldo del compte del client
        if(quantitat < 0){
            compte.reintegra(Math.abs(quantitat));  // valor en positiu de 'quantitat'
        }
        else{
            compte.ingresa(quantitat);
        }
    }
}