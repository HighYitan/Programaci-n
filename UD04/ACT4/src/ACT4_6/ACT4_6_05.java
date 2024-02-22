package ACT4_6;
import ACT4_1.UtilitatsArrays;
import ACT4_2.UtilitatsMatrius;
import ACT4_3.UtilitatsConsola;
import ACT4_4.UtilitatsClasses;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
public class ACT4_6_05 {
    static int NMINES;
    static final int SIMBOL_BUIT = 0, SIMBOL_MINA = 99;
    public static void main(String[] args) {
        int[][] tauler;
        ArrayList<int[]> mines = new ArrayList<>();
        boolean[][] taulerVisible;
        int[] posXY = new int[2];
        final int NTAULER;
        System.out.println("Bienvenido al buscaminas, debe despejar todas las casillas sin descubrir una mina para ganar, buena suerte, pulsa 0 para salir.");
        NTAULER = UtilitatsConsola.llegirSencer("¿Cuán grande debe ser el tablero de juego? ");
        System.out.println();
        tauler = UtilitatsMatrius.generaMatriu(NTAULER, SIMBOL_BUIT, SIMBOL_BUIT);
        NMINES = UtilitatsConsola.llegirSencer("¿Cuántas minas debería haber en el tablero? ");
        System.out.println();
        emplenaTauler(tauler, mines);
        do{
            UtilitatsMatrius.mostraMatriu(tauler);
            posXY[0] = UtilitatsConsola.llegirSencer("Elija fila que desactivar: ");
            posXY[1] = UtilitatsConsola.llegirSencer("Elija columna que desactivar: ");
        }
        while(posXY[0] == -1 && posXY[1] == -1);
    }
    public static int[][] emplenaTauler(int[][] tauler, ArrayList<int[]> mines){
        int[] posicionMina;
        for(int contador = 0; contador < NMINES; contador++){
            boolean minado = false;
            while (!minado){
                posicionMina = UtilitatsArrays.generaArray(2, 0, tauler.length-1);
                if(tauler[posicionMina[0]][posicionMina[1]] == SIMBOL_BUIT){
                    tauler[posicionMina[0]][posicionMina[1]] = SIMBOL_MINA;
                    mines.add(posicionMina);
                    for(int fila = Math.max(0, posicionMina[0]-1); fila <= Math.min(tauler.length-1, posicionMina[0]+1); fila++){
                        for(int columna = Math.max(0, posicionMina[1]-1); columna <= Math.min(tauler.length-1, posicionMina[1]+1); columna++){
                            if(tauler[fila][columna] != SIMBOL_MINA){
                                tauler[fila][columna]++;
                            }
                        }
                    }
                    minado = true;
                }
            }            
        }
        return tauler;
    }
}