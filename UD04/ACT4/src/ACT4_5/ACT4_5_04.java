package ACT4_5;
import ACT4_3.UtilitatsConsola;
public class ACT4_5_04 {
    public static void main(String[] args) {
        int primero = UtilitatsConsola.llegirSencer("Introdueixi el primer número: ");
        int segundo = UtilitatsConsola.llegirSencer("Introduieixi el segon número: ");
        System.out.println(UtilitatsRecOrdCerca.calculaMCD(primero, segundo));
    }  
}