package com.mycompany.potencias;
import java.util.Scanner;
public class Potencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, potencia, resultado = 1;
        System.out.println("Este programa calcula la potencia de un número base entero.");
        System.out.print("Introduzca un número base, por favor: ");
        base = scanner.nextInt();
        System.out.print("Introduzca la potencia a la que quiere elevar el número base: ");
        potencia = scanner.nextInt();
        for(int contador = 1; contador <= potencia; contador++){
            resultado = base*resultado;
        }
        System.out.println(base + " elevado a " + potencia + " es igual a " + resultado);
        scanner.close();
    }
}