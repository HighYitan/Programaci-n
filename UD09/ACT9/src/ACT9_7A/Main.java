package ACT9_7A;
import java.util.ArrayList;
/**
 *
 * @author srhig
 */
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Client client = new Client("Khris", "Red");
        Llibre llibre;
        llibre = new Llibre("Mein Kampf", "Adolf Hitler", 1934, 14.88);
        biblioteca.afegeixLlibre(llibre);
        llibre = new Llibre("Das Manifest zur Brechung der Zinsknechtschaft des Geldes", "Gottfried Feder", 1920, 14.88);
        biblioteca.afegeixLlibre(llibre);
        llibre = new Llibre("1984", "George Orwell", 1949, 18.0);
        biblioteca.afegeixLlibre(llibre);
        llibre = new Llibre("El Senyor dels Anells", "J.R.R. Tolkien", 1954, 25.0);
        biblioteca.afegeixLlibre(llibre);
        
        Llibre llibrePrestat1 = biblioteca.cercaLlibre("Mein Kampf");
        Llibre llibrePrestat2 = biblioteca.cercaLlibre("Das Manifest zur Brechung der Zinsknechtschaft des Geldes");
        if (llibrePrestat1 != null) {
            client.prestaLlibre(llibrePrestat1);
        }
        if (llibrePrestat2 != null) {
            client.prestaLlibre(llibrePrestat2);
        }
        
        System.out.println(biblioteca.toString());
        System.out.println(client.toString());
    }
}