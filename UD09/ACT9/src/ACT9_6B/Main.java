package ACT9_6B;
import java.util.ArrayList;
/**
 *
 * @author alumnat
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Producte> productes = new ArrayList<>();
        Producte producte;
        producte = new Telefon("Samsung", 199.99, 35, 12, 6, 2, 8, "E-Gamma");
        productes.add(producte);
        producte = new Portatil("Acer", 750.00, 350, 24, 19, 4, 1024, "E-102");
        productes.add(producte);
        producte = new Televisor("LG", 400.88, 100, 36, 50, 1, 64, "E-Omega");
        productes.add(producte);
        producte = new Gelera("Mitsubishi", 1488.77, 150, 72, 'A');
        productes.add(producte);
        producte = new Rentavaixelles("Electropope", 200.50, 100, 48, 'B');
        productes.add(producte);
        producte = new Rentadora("LG", 275.75, 125, 72, 'C', 50);
        productes.add(producte);
        Client client = new Client("Máximo", "Red", productes);
        System.out.println(client.toString());
    }
}