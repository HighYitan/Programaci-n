package ACT4_4;
import ACT4_1.UtilitatsArrays;
import ACT4_2.UtilitatsMatrius;
import ACT4_3.UtilitatsConsola;
import java.util.ArrayList;
public class ACT4_4_04 {
    public static void main(String[] args) {
        /*String mensaje = "Escriba el nombre del alumno: ";
        final int NUMERO_ALUMNES = 5, MIN = 0, MAX = 10;
        String[] alumnes = new String[NUMERO_ALUMNES];
        int[][] notes = UtilitatsMatrius.generaMatriu(NUMERO_ALUMNES, MIN, MAX);
        for(int contador = 0; contador < notes.length; contador++){
            alumnes[contador] = UtilitatsConsola.llegirCadena(mensaje);
            System.out.print("Las notas de " + alumnes[contador] + " son: ");
            UtilitatsArrays.mostraArray(notes[contador]);
            System.out.println("La media de las notas de " + alumnes[contador] + " es: " + UtilitatsArrays.mitjana(notes[contador]));
        }*/
        String alumne;
        ArrayList<Integer> nota = new ArrayList<Integer>();
        ArrayList<String> alumnes = new ArrayList<>();
        ArrayList<ArrayList<Integer>> notes = new ArrayList<>();
        do{
            alumne = UtilitatsConsola.llegirCadena("Escriba el nombre del alumno, si quiere salir escriba sortir: ");
            if(!alumne.equalsIgnoreCase("sortir")){
                alumnes.add(alumne);
            }
        }
        while(!alumne.equalsIgnoreCase("sortir"));
        for(int contador = 0; contador < alumnes.size(); contador++){
            System.out.println(alumnes.get(contador));
            ArrayList<Integer> nota2 = new ArrayList<Integer>();
            do{
                nota2.add(UtilitatsConsola.llegirSencer("Escriba la nota del alumno, si quiere salir escriba -1: "));
            }//while(!nota.get(nota.size()-1).equals(-1));
            while(nota2.get(nota2.size()-1) != -1);
            if(nota2.get(nota2.size()-1) == -1){
                nota2.remove(nota2.size()-1);
            }
            System.out.println(contador);
            notes.add(nota2);
            System.out.println(notes.get(contador));
        }
        for(int contador2 = 0; contador2 < notes.size(); contador2++){
            float mediana;
            nota = notes.get(contador2);
            int[] notaMediana = new int[nota.size()];
            System.out.println();
            System.out.print("Las notas de " + alumnes.get(contador2) + " son: ");
            for(int contador3 = 0; contador3 < nota.size(); contador3++){
                //System.out.print(notes.get(contador2).get(contador3));
                System.out.print(nota.get(contador3) + " ");
                notaMediana[contador3] = nota.get(contador3);
            }
            System.out.println();
            //mediana = UtilitatsArrays.mitjana(notaMediana);
            System.out.println("La mediana de sus notas es: " + UtilitatsArrays.mitjana(notaMediana));
        }
    }
}