package ACT5_1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ACT5_1_4 {
    public static void main(String[] args) {
        int num;
        try(Scanner scanner = new Scanner(System.in);){ //Try-with-resources: Cierra al terminar la ejecución del bloque try-catch, hace al finally obsoleto.
            System.out.print("Introduce un número entero: ");
            num = scanner.nextInt();
            System.out.println(num);
        }
        catch (InputMismatchException e) { // Se ejecuta si el usuario no introduce un entero, captura el error y lo trata.
            System.err.println("ERROR: Debe introducir un número entero.");
        }
    } 
}