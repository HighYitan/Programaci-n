package ACT4_5;
import ACT4_3.UtilitatsConsola;
public class ACT4_5_05 {
    public static void main(String[] args) {
        int fibonacci = UtilitatsConsola.llegirSencer("Introduieixi el número de la serie de Fibonacci: ");
        for(int contador = 0; contador < fibonacci; contador++){
            System.out.println(UtilitatsRecOrdCerca.calculaFibonacci(contador));
        }
    }  
}