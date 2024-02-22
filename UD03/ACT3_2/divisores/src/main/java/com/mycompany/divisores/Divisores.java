package com.mycompany.divisores;
import java.util.Scanner;
public class Divisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Muestra todos los divisores del número entero seleccionado.");
        System.out.print("Introduzca un número, por favor: ");
        numero = scanner.nextInt();
        for(int contador = 1; numero >= contador; contador++){
            if(numero % contador == 0){
                System.out.println(numero + " Es divisible por " + contador);
            }
        }
        scanner.close();
    }
}