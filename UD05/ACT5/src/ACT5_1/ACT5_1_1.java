package ACT5_1;
import java.util.Scanner;
public class ACT5_1_1 {
    public static void main(String[] args) {
        double dividendo, divisor;
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("En este programa se dividirá el dividendo por el divisor.");
            System.out.print("Introduzca el dividendo: ");
            dividendo = scanner.nextInt();
            System.out.print("Introduzca el divisor: ");
            divisor = scanner.nextInt();
            System.out.println("El resultado es " + dividendo/divisor);            
        }
        catch(Exception e){
            //System.out.println(e.getMessage());
            System.out.println("ERROR: No es posible dividir entre 0.");
        }
        finally{
            scanner.close();
        }
    }  
}