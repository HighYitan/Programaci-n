package ACT9_6A;
/**
 *
 * @author alumnat
 */
public class Client {
    private String nom, cognom;
    private Telefon telefon;
    private Portatil portatil;
    private Televisor televisor;
    public Client(String nom, String cognom, Telefon telefon, Portatil portatil, Televisor televisor){
        this.nom = nom;
        this.cognom = cognom;
        this.telefon = telefon;
        this.portatil = portatil;
        this.televisor = televisor;
    }
    public double calculaPreuTotal(){
        return (telefon.getPreu() + portatil.getPreu() + televisor.getPreu()) - (this.telefon.calculaDescompte() + this.portatil.calculaDescompte() + this.televisor.calculaDescompte());
    }
    @Override
    public String toString() {
        return "Nom i cognom: " + this.nom + " " + this.cognom + ", que té un telefon: " + this.telefon + 
                ",\nun portatil: " + this.portatil + " i un televisor: " + this.televisor +
                ",\naquestes 3 coses tenen un preu total amb descomptes de: " + this.calculaPreuTotal();
    }    
}