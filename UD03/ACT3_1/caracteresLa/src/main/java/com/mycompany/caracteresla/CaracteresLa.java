package com.mycompany.caracteresla;
import java.util.Scanner;
public class CaracteresLa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letra = ' ', letraAnterior = ' ';
        int la = 0;
        System.out.print("Escriba X para salir del programa, se analizará el carácter que se introduzca y se contara las veces que aparece la partícula LA en la cadena de carácteres al terminar, por favor, escriba letras en MAYÚSCULAS de una en una: ");
        letra = scanner.next().charAt(0);
        while(letra != 'X'){
            System.out.println(letraAnterior + "" + letra);
            if(letraAnterior == 'L' && letra == 'A'){
                la = la+1;
            }
            letraAnterior = letra;
            System.out.print("Escriba otra letra en MAYÚSCULAS o una X para salir y ver cuantas veces se repite LA: ");
            letra = scanner.next().charAt(0);
        }
        System.out.print("La partícula LA se repite " + la + " vez/veces.");
        scanner.close();
    }
}