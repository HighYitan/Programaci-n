package com.mycompany.arraynotas;
import java.util.Scanner;
public class ArrayNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUMERO_ALUMNES = 5, MINIM = 0, MAXIM = 10; 
        String[] alumnes = new String[NUMERO_ALUMNES];
        int[][] notes = new int[NUMERO_ALUMNES][MAXIM];
        System.out.println("Se mostrarán las notas de los alumnos especificados.");
        for(int contador = 0; contador < notes.length; contador++){
            System.out.print("Introduzca el nombre de un alumno: ");
            alumnes[contador] = scanner.nextLine();
            System.out.print(alumnes[contador] + ": ");
            for(int contador2 = 0; contador2 < notes[contador].length; contador2++){
                notes[contador][contador2] = MINIM + (int) (Math.random() * ((MAXIM - MINIM) + 1));
                System.out.print(notes[contador][contador2] + " ");
            } 
            System.out.println();
        } 
        scanner.close();
    }
}