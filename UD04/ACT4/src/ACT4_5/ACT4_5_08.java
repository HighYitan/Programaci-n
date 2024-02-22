package ACT4_5;
import ACT4_1.UtilitatsArrays;
import ACT4_3.UtilitatsConsola;
public class ACT4_5_08 {
    public static void main(String[] args) {
        int[] array = UtilitatsArrays.generaArray(10, 0, 1488);
        int numero, posicion;
        UtilitatsRecOrdCerca.ordenaArrayBimbolla(array);
        UtilitatsArrays.mostraArray(array);
        numero = UtilitatsConsola.llegirSencer("¿Qué número desea buscar en el array? ");
        posicion = UtilitatsRecOrdCerca.cercaArray(array, numero);
        if(posicion == -1){
            System.out.println("El valor no se encuentra dentro del array.");
        }
        else{
            System.out.println("La posición del valor que buscas en el array es: " + posicion);
        }
    }
}