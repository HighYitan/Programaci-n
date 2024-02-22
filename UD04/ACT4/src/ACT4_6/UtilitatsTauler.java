package ACT4_6;
import ACT4_1.UtilitatsArrays;
import static ACT4_6.ACT4_6_03.simbolCuc;
import static ACT4_6.ACT4_6_04.simbolCuc2;
import static ACT4_6.ACT4_6_04.SIMBOL_CAPCUC;
import java.util.ArrayList;
public class UtilitatsTauler {
    public static int[][] emplenaTauler(int[][] tauler, int[] cuc){
        final int SIMBOL_CUC = 1;
        /*for (int contador = 0; contador < tauler.length; contador++){
            for (int contador2 = 0; contador2 < tauler[contador].length; contador2++){
                if (contador == cuc[0] && contador2 == cuc[1]){
                    tauler[contador][contador2] = SIMBOL_CUC;
                }
                else{
                    tauler[contador][contador2] = SIMBOL_BUIT;
                }
            }          
        }*/
        tauler[cuc[0]][cuc[1]] = SIMBOL_CUC;
        return tauler;
    }
    public static int[][] cambiaPosicio(int[][] tauler, int[] cuc, int accio){
        /*if (accio == 2){
            cuc[0]++;
        }
        else if (accio == 4){
            cuc[1]--;
        }
        else if (accio == 6){
            cuc[1]++;
        }
        else if (accio == 8){
            cuc[0]--;
        }
        if(cuc[0] > tauler.length-1){
            cuc[0] = 0;
        }
        else if(cuc[0] < 0){
            cuc[0] = tauler.length-1;
        }
        else if(cuc[1] > tauler.length-1){
            cuc[1] = 0;
        }
        else if(cuc[1] < 0){
            cuc[1] = tauler.length-1;
        }*/
        final int SIMBOL_BUIT = 0;
        tauler[cuc[0]][cuc[1]] = SIMBOL_BUIT;
        switch(accio){
            case 2 ->
                cuc[0] = (cuc[0] == tauler.length-1 ? 0 : cuc[0]+1);
            case 4 ->
                cuc[1] = (cuc[1] == 0 ? tauler.length-1 : cuc[1]-1);
            case 6 ->
                cuc[1] = (cuc[1] == tauler.length-1 ? 0 : cuc[1]+1);
            case 8 ->
                cuc[0] = (cuc[0] == 0 ? tauler.length-1 : cuc[0]-1);
        }
        emplenaTauler(tauler, cuc);
        return tauler;
    }
    //Exercici 2
    public static void emplenaTauler2(int[][] tauler, int[] cuc, int NFULLES){
        final int SIMBOL_CUC = 1;
        for(int contador = 0; contador < NFULLES; contador++){
            generaFulla(tauler);
        }
        tauler[cuc[0]][cuc[1]] = SIMBOL_CUC;
    }
    public static void cambiaPosicio2(int[][] tauler, int[] cuc, int accio){
        final int SIMBOL_BUIT = 0, SIMBOL_CUC = 1, SIMBOL_FULLA = 9;
        tauler[cuc[0]][cuc[1]] = SIMBOL_BUIT;
        switch(accio){
            case 2 ->
                cuc[0] = (cuc[0] == tauler.length-1 ? 0 : cuc[0]+1);
            case 4 ->
                cuc[1] = (cuc[1] == 0 ? tauler.length-1 : cuc[1]-1);
            case 6 ->
                cuc[1] = (cuc[1] == tauler.length-1 ? 0 : cuc[1]+1);
            case 8 ->
                cuc[0] = (cuc[0] == 0 ? tauler.length-1 : cuc[0]-1);
        }
        if(tauler[cuc[0]][cuc[1]] == SIMBOL_FULLA){
            tauler[cuc[0]][cuc[1]] = SIMBOL_CUC;
            generaFulla(tauler);
        }
    }
    public static void generaFulla(int[][] tauler){
        int[] fulla;
        final int SIMBOL_BUIT = 0, SIMBOL_FULLA = 9;
        boolean afegida = false;
        while (!afegida){
            fulla = UtilitatsArrays.generaArray(2, 0, tauler.length-1);
            if(tauler[fulla[0]][fulla[1]] == SIMBOL_BUIT){
                tauler[fulla[0]][fulla[1]] = SIMBOL_FULLA;
                afegida = true;
            }            
        }
    }
    //Exercici3
    public static void emplenaTauler3(int[][] tauler, int[] cuc, int NFULLES){
        final int SIMBOL_CUC = 1;
        for(int contador = 0; contador < NFULLES; contador++){
            generaFulla3(tauler);
        }
        tauler[cuc[0]][cuc[1]] = SIMBOL_CUC;
    }
    public static void cambiaPosicio3(int[][] tauler, int[] cuc, int accio){
        final int SIMBOL_BUIT = 0, SIMBOL_FULLA = 99;
        tauler[cuc[0]][cuc[1]] = simbolCuc;
        switch(accio){
            case 2 ->
                cuc[0] = (cuc[0] == tauler.length-1 ? 0 : cuc[0]+1);
            case 4 ->
                cuc[1] = (cuc[1] == 0 ? tauler.length-1 : cuc[1]-1);
            case 6 ->
                cuc[1] = (cuc[1] == tauler.length-1 ? 0 : cuc[1]+1);
            case 8 ->
                cuc[0] = (cuc[0] == 0 ? tauler.length-1 : cuc[0]-1);
        }
        if(tauler[cuc[0]][cuc[1]] == SIMBOL_FULLA){ //No se borra nada porque el cuc aumenta de tamaño en 1 por tanto su cola es más grande.
            simbolCuc++;
            tauler[cuc[0]][cuc[1]] = simbolCuc;
            generaFulla3(tauler);
        }
        else if(tauler[cuc[0]][cuc[1]] == SIMBOL_BUIT){ //Movimiento al borrar el rastro y restar -1 a la cola y a si mismo en la posición anterior, el cuc tiene el valor original en su nueva posición 1 2 3 4 etc.
            for(int contador = 0; contador < tauler.length; contador++){
                for(int contador2 = 0; contador2 < tauler.length; contador2++){
                    if(tauler[contador][contador2] > SIMBOL_BUIT && tauler[contador][contador2] < SIMBOL_FULLA){
                        tauler[contador][contador2] = tauler[contador][contador2] - 1;
                    }
                }
            }
            tauler[cuc[0]][cuc[1]] = simbolCuc;
        }
        else{ //Morderse a si mismo es una muerte asegurada.
            simbolCuc = SIMBOL_BUIT;
            System.out.println("Perdiste.");
        }
    }
    public static void generaFulla3(int[][] tauler){
        int[] fulla;
        final int SIMBOL_BUIT = 0, SIMBOL_FULLA = 99;
        boolean afegida = false;
        while (!afegida){
            fulla = UtilitatsArrays.generaArray(2, 0, tauler.length-1);
            if(tauler[fulla[0]][fulla[1]] == SIMBOL_BUIT){
                tauler[fulla[0]][fulla[1]] = SIMBOL_FULLA;
                afegida = true;
            }            
        }
    }
    //Exercici 4
    public static void emplenaTauler4(int[][] tauler, ArrayList<int[]> cuc, int NFULLES){
        int[] posicion = UtilitatsArrays.generaArray(2, 0, tauler.length-1);
        cuc.add(posicion);
        tauler[posicion[0]][posicion[1]] = SIMBOL_CAPCUC;
        for(int contador = 0; contador < NFULLES; contador++){
            generaFulla4(tauler);
        }
    }
    public static void cambiaPosicio4(int[][] tauler, ArrayList<int[]> cuc, int accio){
        final int SIMBOL_BUIT = 0, SIMBOL_FULLA = 99;
        int[] posicionCap = { cuc.get(cuc.size()-1)[0], cuc.get(cuc.size()-1)[1] };
        int[] posicionCua = {cuc.get(0)[0], cuc.get(0)[1]};
        tauler[posicionCap[0]][posicionCap[1]] = simbolCuc2;
        switch(accio){
            case 2 ->
                posicionCap[0] = (posicionCap[0] == tauler.length-1 ? 0 : posicionCap[0]+1);
            case 4 ->
                posicionCap[1] = (posicionCap[1] == 0 ? tauler.length-1 : posicionCap[1]-1);
            case 6 ->
                posicionCap[1] = (posicionCap[1] == tauler.length-1 ? 0 : posicionCap[1]+1);
            case 8 ->
                posicionCap[0] = (posicionCap[0] == 0 ? tauler.length-1 : posicionCap[0]-1);
        }
        if(tauler[posicionCap[0]][posicionCap[1]] == SIMBOL_FULLA){ //No se borra nada porque el cuc aumenta de tamaño en 1 por tanto su cola es más grande.
            //simbolCuc++;
            cuc.add(posicionCap); //Nueva posición guardada como array en el ArrayList.
            tauler[posicionCap[0]][posicionCap[1]] = SIMBOL_CAPCUC;
            generaFulla4(tauler);
        }
        else if((tauler[posicionCap[0]][posicionCap[1]]) == SIMBOL_BUIT){ //Movimiento al borrar el rastro
            /*
            for(int contador = 0; contador < tauler.length; contador++){
                for(int contador2 = 0; contador2 < tauler.length; contador2++){
                    if(tauler[contador][contador2] > SIMBOL_BUIT && tauler[contador][contador2] < SIMBOL_FULLA){
                        tauler[contador][contador2] = tauler[contador][contador2] - 1;
                    }
                }
            }
            */
            cuc.add(posicionCap);
            tauler[posicionCap[0]][posicionCap[1]] = SIMBOL_CAPCUC;
            cuc.remove(0); //Debe eliminarse la cola para hacer sensación de movimiento mientras avanza la cabeza.
            tauler[posicionCua[0]][posicionCua[1]] = SIMBOL_BUIT;
        }
        else{ //Morderse a si mismo es una muerte asegurada.
            simbolCuc2 = SIMBOL_BUIT;
            System.out.println("Perdiste.");
        }
    }
    public static void generaFulla4(int[][] tauler){
        int[] fulla;
        final int SIMBOL_BUIT = 0, SIMBOL_FULLA = 99;
        boolean afegida = false;
        while (!afegida){
            fulla = UtilitatsArrays.generaArray(2, 0, tauler.length-1);
            if(tauler[fulla[0]][fulla[1]] == SIMBOL_BUIT){
                tauler[fulla[0]][fulla[1]] = SIMBOL_FULLA;
                afegida = true;
            }
        }
    }
}