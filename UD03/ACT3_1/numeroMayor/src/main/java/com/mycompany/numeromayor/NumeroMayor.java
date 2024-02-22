package com.mycompany.numeromayor;
import java.util.Scanner;
public class NumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("El programa leera los 2 números que introduzcas y analizará cual de ellos es mayor.");
        System.out.print("Introduzca el primer número, por favor: ");
        numero1 = scanner.nextInt();
        System.out.print("Introduzca el segundo número, por favor: ");
        numero2 = scanner.nextInt();
        if (numero1 > numero2){
            System.out.print("El número " + numero1 + " es mayor que " + numero2);
        }
        else if (numero1 < numero2){
            System.out.print("El número " + numero2 + " es mayor que " + numero1);
        }
        else{
            System.out.print(numero1 + " y " + numero2 + " son iguales en valor.");
        }
        scanner.close();
    }
}