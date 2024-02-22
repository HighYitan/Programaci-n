package ACT4_5;
import ACT4_1.UtilitatsArrays;
public class ACT4_5_06 {
    public static void main(String[] args) {
        int[] array3 = UtilitatsArrays.generaArray(3, 0, 10);
        UtilitatsArrays.mostraArray(array3);
        if(UtilitatsRecOrdCerca.ordenaArray3(array3)){
            UtilitatsArrays.mostraArray(array3);
        }
        else{
            System.out.println("El array no tiene 3 posiciones y no se puede ordenar con este algoritmo.");
        }
    }
}