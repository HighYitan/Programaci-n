package ACT4_2;
public class ACT4_2_02 {
    public static void main(String[] args) {
        final int MINIMO = 10, MAXIMO = 100, LONG = 10;
        int[][] matrizAleatoria = UtilitatsMatrius.generaMatriu(LONG, MINIMO, MAXIMO);
        UtilitatsMatrius.mostraMatriu(matrizAleatoria);
    }
}