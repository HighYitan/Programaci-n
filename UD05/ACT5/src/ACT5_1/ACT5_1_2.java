package ACT5_1;
import java.util.Scanner;
public class ACT5_1_2 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int posicion;
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("¿Qué posición del array (0-" + (array.length-1) + ") deseas mostrar? ");
            posicion = scanner.nextInt();
            System.out.println(array[posicion]);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Se ha excedido la longitud del array.");
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Error de ejecución.");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Error general.");
        }
        finally{
            scanner.close();
        }
    } 
}