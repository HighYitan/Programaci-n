package ACT4_5;
public class UtilitatsRecOrdCerca {
    public static int calculaPotencia(int base, int exponent) {
        if (exponent == 0){
            return 1;
        }
        else{
            return base * calculaPotencia(base, exponent - 1);
        }
    }
    public static int calculaFactorial(int base) {
        if (base == 1)
            return 1;
        else
            return base * calculaFactorial(base - 1);   
    }
    public static int calculaSuma(int base) {
        if (base == 1)
            return 1;
        else
            return base + calculaSuma(base - 1);   
    }
    public static int calculaMCD(int primero, int segundo){
        if (segundo == 0){
            return primero;
        }
        else{
            return calculaMCD(segundo, primero % segundo); //Si no es divisible porque el segundo numero es demasiado grande, el primer resto es el primer número entero. Ej: 8%50 = 8
        }
    }
    public static int calculaFibonacci(int fibonacci){
        if(fibonacci <= 1){
            return fibonacci;
        }
        else{
            return calculaFibonacci(fibonacci - 1) + calculaFibonacci(fibonacci - 2);
        }
    }
    public static boolean ordenaArray3(int[] array){
        boolean tres = array.length == 3;
        int aux;
        if(tres){
            if(array[0] > array[1]){
                aux = array[0];
                array[0] = array[1];
                array[1] = aux;
            }
            if(array[0] > array[2]){
                aux = array[0];
                array[0] = array[2];
                array[2] = aux;
            }
            if(array[1] > array[2]){
                aux = array[1];
                array[1] = array[2];
                array[2] = aux;
            }
            return tres;
        }
        return tres;
    }
    public static int[] ordenaArrayBimbolla(int[] array){
        int aux;
        for(int contador = 1; contador < array.length; contador++){
            for(int contador2 = 0; contador2 < array.length - contador; contador2++){
                if(array[contador2] > array[contador2+1]){
                    aux = array[contador2];
                    array[contador2] = array[contador2+1];
                    array[contador2+1] = aux;
                }
            }
        }
        return array;
    }
    public static int cercaArray(int[] array, int numero){
        int min = 0, max = array.length-1;
        int media;
        while(min <= max){
            media = (min + max)/2;
            if(array[media] < numero){
                min = media+1;
            }
            else if(array[media] > numero){
                max = media-1;
            }
            else{
                return media;
            }
        }
        return -1;
    }
    public static int cercaArrayRecursiu(int[] array, int numero, int min, int max){
        int media = (min + max)/2;
        if(min > max){
            return -1;
        }
        if(array[media] < numero){ //Descarta la mitad izquierda si ocurre.
            return cercaArrayRecursiu(array, numero, media+1, max);
        }
        else if(array[media] > numero){
            return cercaArrayRecursiu(array, numero, min, media-1); 
        }
        else{
            return media;
        }
    }
}