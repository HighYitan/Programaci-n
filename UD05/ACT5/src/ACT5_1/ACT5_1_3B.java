package ACT5_1;
import java.util.Scanner;
public class ACT5_1_3B {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int posicion;
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("¿Qué posición del array (0-" + (array.length-1) + ") deseas mostrar? ");
            posicion = scanner.nextInt();
            mostraArray(array, posicion);
        }
        catch (Exception e) {
            // Captura i maneja l'excepció si l'usuari no introdueix un enter
            System.err.println("Error general en el 'main'");
        } 
        finally {
            System.out.println("Finally en el 'main'");
            scanner.close();
        }
    }
    public static void mostraArray(int[] array, int posicion) {
        try {
            System.out.println(array[posicion]);
        } 
        catch (Exception e) {
            System.err.println("Excepción capturada en el mètode 'mostraArray: " + e.getMessage());
            throw new IndexOutOfBoundsException("Es llança una 'excepció' de manera manual");
        }
    }
}