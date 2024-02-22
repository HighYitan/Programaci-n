package com.mycompany.factorial;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factor, resultado = 1;
        System.out.print("Se calculará el factorial del número que ingrese, introduzca un número: ");
        factor = scanner.nextInt();
        for(int contador = 2; contador <= factor; contador++){
            resultado = resultado*contador;
        }
        System.out.println("El factorial de " + factor + " es igual a " + resultado);
        scanner.close();
    }
}