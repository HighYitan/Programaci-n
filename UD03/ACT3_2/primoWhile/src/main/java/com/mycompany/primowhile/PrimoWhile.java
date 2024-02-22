package com.mycompany.primowhile;
import java.util.Scanner;
public class PrimoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, contador = 2;
        boolean primo = true;
        System.out.println("El programa comprobará si el número entero introducido es primo o no.");
        System.out.print("Introduzca un número: ");
        numero = scanner.nextInt();
        while (numero > contador){
            if(numero % contador == 0){
                primo = false;
                break;
            }
            contador++;
        }
        if(numero < 2){
            primo = false;
        }
        if (primo){
            System.out.print("El número " + numero + " es primo.");
        }
        else {
            System.out.print("El número " + numero + " no es primo.");
        }
        scanner.close();
    }
}