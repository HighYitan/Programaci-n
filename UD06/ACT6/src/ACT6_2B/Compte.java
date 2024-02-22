package ACT6_2B;
public class Compte {
    String banc, oficina, dc, numeroCompte; //Codi banc 4 digits, cofi oficina 4 digits, digits de control: 2, numero de compte 10 digits.
    double saldo; //No es posible un valor negatiu per aquest atribut.
    public void ingresa(double quantitat){//Quantitat positiva.
        saldo += quantitat;
        System.out.println("Ingrès de " + quantitat + " en el compte " + banc + "-" + oficina + "-" + dc + "-" + numeroCompte);
    }
    public void reintegra(double quantitat){//Quantitat negativa.
        if(quantitat <= saldo){
            saldo -= quantitat;
            System.out.println("Retirada de " + quantitat + " del compte " + banc + "-" + oficina + "-" + dc + "-" + numeroCompte);
        }
        else{
            System.out.println("Saldo insuficient " + saldo + " en el compte " + banc + "-" + oficina + "-" + dc + "-" + numeroCompte);
        }
    }
}