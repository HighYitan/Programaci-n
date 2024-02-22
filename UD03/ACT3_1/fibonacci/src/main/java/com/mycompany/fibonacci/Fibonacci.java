package com.mycompany.fibonacci;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fib, numero1 = 0, numero2 = 1, resultado;
        System.out.println("Se ejecutará la serie de Fibonacci hasta el número elegido de veces a ejecutar.");
        System.out.print("Elija cuantas veces se ejecutará la secuencia de fibonacci: ");
        fib = scanner.nextInt();
        for(int contador = 1; contador <= fib; contador++){
            resultado = numero1+numero2;
            System.out.println(numero1 + " + " + numero2 + " = " + resultado);
            numero1 = numero2;
            numero2 = resultado;
        }
        scanner.close();
    }
}