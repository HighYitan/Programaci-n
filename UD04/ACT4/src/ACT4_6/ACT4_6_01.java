package ACT4_6;
import ACT4_1.UtilitatsArrays;
import ACT4_2.UtilitatsMatrius;
import ACT4_3.UtilitatsConsola;
public class ACT4_6_01 {
    public static void main(String[] args) {
        int[][] tauler;
        int[] cuc;
        final int NTAULER;
        int accio;
        System.out.println("Bienvenido al juego del gusano comehojas, para ganar debes comer todas las hojas posibles pero con cuidado de comerte a ti mismo o perderás, pulsa 0 en cualquier momento para salir del juego.");
        System.out.println();
        NTAULER = UtilitatsConsola.llegirSencer("¿Cuán grande debe ser el tablero de juego? ");
        System.out.println();
        tauler = UtilitatsMatrius.generaMatriu(NTAULER, 0, 0);
        cuc = UtilitatsArrays.generaArray(2, 0, tauler.length-1);
        UtilitatsTauler.emplenaTauler(tauler, cuc);
        do{
            UtilitatsMatrius.mostraMatriu(tauler);
            accio = UtilitatsConsola.llegirSencer("2 = Abajo | 4 = Izquierda | 6 = Derecha | 8 = Arriba | 0 = Salir del juego -> ");
            System.out.println();
            UtilitatsTauler.cambiaPosicio(tauler, cuc, accio);
        }
        while(accio != 0);
    }
}