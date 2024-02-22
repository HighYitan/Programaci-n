package ACT4_4;
import ACT4_1.UtilitatsArrays;
import java.util.ArrayList;
public class ACT4_4_03 {
    public static void main(String[] args) {
        final int LONGITUD = 10, MIN = 0, MAX = 2;
        int[] array = UtilitatsArrays.generaArray(LONGITUD, MIN, MAX);
        ArrayList<Integer> desiguales = new ArrayList<Integer>();
        UtilitatsArrays.mostraArray(array);
        desiguales = UtilitatsClasses.mostrarDiferentsMillorat(array);
        UtilitatsClasses.mostrarArrayList(desiguales);
    } 
}