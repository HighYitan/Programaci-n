package com.mycompany.parimpar;
import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Verificación de pares e impares, el programa indicará si el número introducido es par o impar.");
        System.out.print("Introduzca el número a verificar, por favor: ");
        numero = scanner.nextInt();
        if (numero%2 == 0){
            System.out.print("El número " + numero + " es par.");
        }
        else {
            System.out.print("El número " + numero + " es impar.");
        }
        scanner.close();
    }
}