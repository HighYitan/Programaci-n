package ACT4_2;
import ACT4_1.UtilitatsArrays;
public class UtilitatsMatrius {
    public static int[][] generaMatriu(final int CANTIDAD_VALORES, final int MINIMO, final int MAXIMO){
        int[][] matrizAleatoria = new int[CANTIDAD_VALORES][CANTIDAD_VALORES];
        for(int contador = 0; contador < matrizAleatoria.length; contador++){
            for(int contador2 = 0; contador2 < matrizAleatoria[contador].length; contador2++){
                matrizAleatoria[contador][contador2] = MINIMO + (int) (Math.random() * (MAXIMO - MINIMO + 1));
            }
        }
        return matrizAleatoria;
    }
    public static void mostraMatriu(int[][] matriz){
        for(int contador = 0; contador < matriz.length; contador++){
            UtilitatsArrays.mostraArray(matriz[contador]);
        }
    }
    public static int[] generaDiagonalPrincipal(int[][] matriz){
        int[] diagonalPrincipal = new int[matriz.length];
        for(int contador = 0; contador < matriz.length; contador++){
            diagonalPrincipal[contador] = matriz[contador][contador];
        }
        return diagonalPrincipal;
    }
    public static int[] generaDiagonalSecundaria(int[][] matriz){
        int[] diagonalSecundaria = new int[matriz.length];
        for(int contador = 0, contador2 = matriz.length-1; contador < matriz.length; contador++, contador2--){
            diagonalSecundaria[contador] = matriz[contador][contador2];
        }
        return diagonalSecundaria;
    }
}