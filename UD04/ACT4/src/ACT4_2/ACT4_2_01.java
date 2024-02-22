package ACT4_2;
import ACT4_1.UtilitatsArrays;
public class ACT4_2_01 {
    public static void main(String[] args) {
        final int MINIMO = 10, MAXIMO = 100, LONG = 10;
        int[][] matrizAleatoria = UtilitatsMatrius.generaMatriu(LONG, MINIMO, MAXIMO);
        for(int contador = 0; contador < LONG; contador++){
            System.out.print("[ ");
            for(int contador2 = 0; contador2 < LONG; contador2++){
                System.out.print(matrizAleatoria[contador][contador2] + " ");
            }
            System.out.println("]");
        }
    }  
}