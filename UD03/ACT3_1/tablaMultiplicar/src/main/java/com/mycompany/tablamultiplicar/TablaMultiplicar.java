package com.mycompany.tablamultiplicar;
import java.util.Scanner;
public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.print("Debe introducirse un número y se le mostrará su tabla de multiplicar hasta el 10, por favor, introduzca el número que desee: ");
        numero = scanner.nextInt();
        for(int contador = 1; contador <= 10; contador++){
            System.out.println(numero + " X " + contador + " es igual a " + numero*contador);
        }
        scanner.close();
    }
}