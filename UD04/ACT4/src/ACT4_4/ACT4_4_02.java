package ACT4_4;
import java.util.ArrayList;
import ACT4_1.UtilitatsArrays;
public class ACT4_4_02 {
    public static void main(String[] args) {
        final int LONGITUD = 10, MIN = 0, MAX = 2;
        int[] array = UtilitatsArrays.generaArray(LONGITUD, MIN, MAX);
        ArrayList<Integer> desiguales = new ArrayList<>();
        UtilitatsArrays.mostraArray(array);
        System.out.println("Números diferentes en el array pasado a ArrayList:");
        desiguales = UtilitatsClasses.mostrarDiferents(array);
        UtilitatsClasses.mostrarArrayList(desiguales);
    } 
}