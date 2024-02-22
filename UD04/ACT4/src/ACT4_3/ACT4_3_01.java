package ACT4_3;
import ACT4_1.UtilitatsArrays;
public class ACT4_3_01 {
    public static void main(String[] args) {
        int[] notas = new int[UtilitatsConsola.llegirSencer("¿Cuántas asignaturas tiene el alumno? ")];
        for(int contador = 0; contador < notas.length; contador++){
            notas[contador] = UtilitatsConsola.llegirSencer("Escriba la nota del alumno: ");
        }
        System.out.print("Sus notas son: ");
        UtilitatsArrays.mostraArray(notas);
        System.out.println("La media de sus notas es: " + UtilitatsArrays.mitjana(notas));
    }
}