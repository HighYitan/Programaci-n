package ACT4_2;
import ACT4_1.UtilitatsArrays;
public class ACT4_2_03 {
    public static void main(String[] args) {
        final int MINIMO = 10, MAXIMO = 100, LONG = 10;
        int[][] matrizAleatoria = UtilitatsMatrius.generaMatriu(LONG, MINIMO, MAXIMO);
        UtilitatsMatrius.mostraMatriu(matrizAleatoria);
        System.out.println();
        UtilitatsArrays.mostraArray(UtilitatsMatrius.generaDiagonalPrincipal(matrizAleatoria));
    }
}