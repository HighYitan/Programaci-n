package ACT9_6A;
/**
 *
 * @author alumnat
 */
public class Main {
    public static void main(String[] args) {
        Telefon telefon = new Telefon("Samsung", 199.99, 35, 12, 6);
        Portatil portatil = new Portatil("Acer", 750.00, 350, 24, 19);
        Televisor televisor = new Televisor("LG", 400.88, 100, 36, 50);
        Client client = new Client("Máximo", "Red", telefon, portatil, televisor);
        System.out.println(client.toString());
    }
}