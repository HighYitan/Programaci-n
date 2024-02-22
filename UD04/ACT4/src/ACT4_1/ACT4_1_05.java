package ACT4_1;
public class ACT4_1_05 {
    public static void main(String[] args) {
        int[] array1 = {14, 88, 18, 7, 77, 777}, array2 = {14, 88, 18, 7, 77, 777};
        UtilitatsArrays.mostraArray(array1);
        UtilitatsArrays.mostraArray(array2);
        if(UtilitatsArrays.comparaArrays(array1, array2)){
            System.out.println("Son iguales.");
        }
        else{
            System.out.println("Son diferentes.");
        }
    }
}