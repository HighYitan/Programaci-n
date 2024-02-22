package ACT9_5B;
import java.util.ArrayList;
/**
 *
 * @author srhig
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Tarjeta> tarjetes = new ArrayList<>();
        ArrayList<ProducteBancari> productesBancaris = new ArrayList<>();
        creaTarjetes(tarjetes);
        creaProductesBancaris(tarjetes, productesBancaris);
        Persona persona = new Persona("Khris", 28, productesBancaris);
        mostraPersona(persona);
    }
    private static void creaTarjetes(ArrayList<Tarjeta> tarjetes){
        Tarjeta tarjeta = new Credit("123ABC", 2.34, 1488, 999999, 666);
        tarjetes.add(tarjeta);
        tarjeta = new Debit("456DEF", 2.34, 1488, 999999, 88);
        tarjetes.add(tarjeta);        
    }
    private static void creaProductesBancaris(ArrayList<Tarjeta> tarjetes, ArrayList<ProducteBancari> productesBancaris){
        ProducteBancari producteBancari = new CompteEstalvis("0001-0001-0001", "La Caixa", 50000, 2, 14.88, tarjetes);
        productesBancaris.add(producteBancari);
        producteBancari = new Deposit("0001-0001-0002", "Santander", 100000, 5, 12);
        productesBancaris.add(producteBancari);
        producteBancari = new Hipoteca("0001-0001-0003", "BBVA", 500000, 3, 50000, 60);
        productesBancaris.add(producteBancari);
        producteBancari = new FonsInversio("0001-0001-0004", "JP Morgan Chase", 148800, 10, 1, 24);
        productesBancaris.add(producteBancari);
        producteBancari = new PlanPensiones("0001-0001-0005", "Banco de Andalucia", 50000, 5, 50);
        productesBancaris.add(producteBancari);
    }
    private static void mostraPersona(Persona persona){
        System.out.println(persona.toString() + "\nRemuneració total: " + persona.calculaRemuneracioTotal());       
    }
}