package com.mycompany.calculadora;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero1, numero2;
        char operador;
        System.out.println("Deben introducirse dos números y se debe especificar qué tipo de operación debe realizarse (SUMA, RESTA, MULTIPLICACIÓN, DIVISIÓN)");
        System.out.print("Introduzca el primer número, por favor: ");
        numero1 = scanner.nextDouble();
        System.out.print("Introduzca el segundo número, por favor: ");
        numero2 = scanner.nextDouble();
        System.out.print("Introduzca el tipo de operación que desea hacer de la siguiente manera: +, -, *, /: ");
        operador = scanner.next().charAt(0);
        if(operador == '+'){
            System.out.println(numero1 + " + " + numero2 + " es igual a " + (numero1+numero2));
        }
        else if(operador == '-'){
            System.out.println(numero1 + " - " + numero2 + " es igual a " + (numero1-numero2));
        }
        else if(operador == '*'){
            System.out.println(numero1 + " X " + numero2 + " es igual a " + (numero1*numero2));
        }
        else if(operador == '/'){
            System.out.println(numero1 + " / " + numero2 + " es igual a " + (numero1/numero2));
        }
        else{
            System.out.println("ERROR, utilice un operador la próxima vez: +, -, *, /.");
        }
        scanner.close();
    }
}