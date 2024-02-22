package ACT4_5;
import ACT4_1.UtilitatsArrays;
public class ACT4_5_07 {
    public static void main(String[] args) {
        int[] array = UtilitatsArrays.generaArray(10, 0, 1488);
        UtilitatsArrays.mostraArray(array);
        UtilitatsRecOrdCerca.ordenaArrayBimbolla(array);
        UtilitatsArrays.mostraArray(array);
    }
}