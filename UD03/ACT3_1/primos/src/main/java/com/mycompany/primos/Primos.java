package com.mycompany.primos;
import java.util.Scanner;
public class Primos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2;
        boolean primo;
        System.out.println("Se mostrarán los números primos entre el primer y el segundo número, incluyéndolos.");
        System.out.print("Introduzca el número de menos valor: ");
        numero1 = scanner.nextInt();
        System.out.print("Introduzca el número de mayor valor: ");
        numero2 = scanner.nextInt();
        for(int numeral = numero1; numeral <= numero2; numeral++){
            primo = true;
            for(int contador = 2; contador < numeral; contador++){
                if(numeral % contador == 0){
                    primo = false;
                }
            }
            if(numeral < 2){
                primo = false;
            }
            if(primo){
                System.out.println(numeral);
            }
            else{
                System.out.println("No es primo");
            }
        }
        scanner.close();
    }
}