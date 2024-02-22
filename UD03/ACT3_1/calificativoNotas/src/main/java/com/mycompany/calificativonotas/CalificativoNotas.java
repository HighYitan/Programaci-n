package com.mycompany.calificativonotas;
import java.util.Scanner;
public class CalificativoNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        System.out.println("Se evaluarán las notas según el calificativo correspondiente a ellas.");
        System.out.print("Introduzca la nota del alumno, por favor: ");
        nota = scanner.nextDouble();
        if(nota >= 9){
            System.out.println("Sobresaliente.");
        }
        else if(nota >= 7){
            System.out.println("Notable.");
        }
        else if(nota >= 6){
            System.out.println("Bien.");
        }
        else if(nota >= 5){
            System.out.println("Suficiente.");
        }
        else if(nota >= 3){
            System.out.println("Insuficiente.");
        }
        else{
            System.out.println("Muy deficiente.");
        }
        scanner.close();
    }
}