package ACT8_2;
/**
 * 
 * @author srhig
 */
public class Compte {
    private String banc, oficina, dc, numeroCompte; //Codi banc 4 digits, cofi oficina 4 digits, digits de control: 2, numero de compte 10 digits.
    private double saldo; //No es posible un valor negatiu per aquest atribut.
    //Constructor
    public Compte(String banc, String oficina, String dc, String numeroCompte, double saldo) {
        this.banc = banc;
        this.oficina = oficina;
        this.dc = dc;
        this.numeroCompte = numeroCompte;
        this.saldo = saldo;
    }
    //Métodos específicos
    /**
     * 
     * @param quantitat 
     */
    public void ingresa(double quantitat){//Quantitat positiva.
        //saldo += quantitat;
        setSaldo(saldo + quantitat);
        System.out.println("Ingrès de " + quantitat + " en el compte " + banc + "-" + oficina + "-" + dc + "-" + numeroCompte);
    }
    public void reintegra(double quantitat){//Quantitat negativa.
        /*
        if(quantitat <= saldo){
            saldo -= quantitat;
            System.out.println("Retirada de " + quantitat + " del compte " + banc + "-" + oficina + "-" + dc + "-" + numeroCompte);
        }
        else{
            System.out.println("Saldo insuficient " + saldo + " en el compte " + banc + "-" + oficina + "-" + dc + "-" + numeroCompte);
        }
        */
        setSaldo(saldo - quantitat);
        System.out.println("Retirada de " + quantitat + " del compte " + banc + "-" + oficina + "-" + dc + "-" + numeroCompte);
    }
    //Getters y setters
    public String getBanc() {
        return banc;
    }

    public void setBanc(String banc) {
        this.banc = banc;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo >= 0){
            this.saldo = saldo;
        }
        else{
            throw new IllegalArgumentException(this.numeroCompte + ": No és possible un Import negatiu en compte.");
        }
    }
    @Override
    public boolean equals(Object o){
        Compte c = (Compte) o;
        if ((c.banc.equalsIgnoreCase(this.banc)) &&
            (c.oficina.equalsIgnoreCase(this.oficina)) &&
            (c.dc.equalsIgnoreCase(this.dc)) &&
            (c.numeroCompte.equalsIgnoreCase(this.numeroCompte)))
            return true;
        else
            return false;        
    }
}