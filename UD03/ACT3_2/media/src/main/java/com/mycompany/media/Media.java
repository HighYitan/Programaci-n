package com.mycompany.media;
import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0, suma = 0, total = 0;
        System.out.println("El programa dirá la media de los números introducidos cuando el usuario decida salir del programa (Escribiendo -1)");
        while(numero != -1){
            System.out.print("Introduzca un número, por favor: ");
            numero = scanner.nextInt();
            if(numero == -1){
                break;
            }
            suma = numero+suma;
            total++;
        }
        System.out.println("La media de los " + total + " numeros los cuales dan un total de " + suma + " es igual a " + (suma/total));
        scanner.close();
    }
}