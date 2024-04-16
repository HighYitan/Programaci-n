package ACT11_3;
/**
 *
 * @author srhig
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.afegeixLlibre(1, "Mein Kampf", "Adolf Hitler", 1934);
        biblioteca.afegeixLlibre(2, "Das Manifest zur Brechung der Zinsknechtschaft des Geldes", "Gottfried Feder", 1920);
        biblioteca.afegeixLlibre(3, "1984", "George Orwell", 1949);
        biblioteca.afegeixLlibre(4, "El Senyor dels Anells", "J.R.R. Tolkien", 1954);
        biblioteca.afegeixLlibre(5, "Mein Kampf", "Adolf Hitler", 1934);
        
        biblioteca.mostraLlibresDisponibles();
        biblioteca.mostraLlibresPrestats();
        System.out.println("-----------------------------------------");
        
        biblioteca.prestaLlibre("Mein Kampf");
        biblioteca.mostraLlibresDisponibles();
        biblioteca.mostraLlibresPrestats();
        System.out.println("-----------------------------------------");

        biblioteca.tornaLlibre();       
        biblioteca.mostraLlibresDisponibles();
        biblioteca.mostraLlibresPrestats();
        
        System.out.println("-----------------------------------------");
        biblioteca.mostraTitolsDisponibles();
    }
}