package ACT4_3;
import ACT4_1.UtilitatsArrays;
import ACT4_2.UtilitatsMatrius;
public class ACT4_3_02 {
    public static void main(String[] args) {
        String mensaje = "Escriba el nombre del alumno: ";
        final int NUMERO_ALUMNES = 5, MIN = 0, MAX = 10;
        String[] alumnes = new String[NUMERO_ALUMNES];
        int[][] notes = UtilitatsMatrius.generaMatriu(NUMERO_ALUMNES, MIN, MAX);
        for(int contador = 0; contador < notes.length; contador++){
            alumnes[contador] = UtilitatsConsola.llegirCadena(mensaje);
            System.out.print("Las notas de " + alumnes[contador] + " son: ");
            UtilitatsArrays.mostraArray(notes[contador]);
            System.out.println("La media de las notas de " + alumnes[contador] + " es: " + UtilitatsArrays.mitjana(notes[contador]));
        }        
    }
}