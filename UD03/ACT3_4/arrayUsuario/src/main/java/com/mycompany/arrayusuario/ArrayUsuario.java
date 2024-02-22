package com.mycompany.arrayusuario;
import java.util.Scanner;
public class ArrayUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadValores = 0, minimo = 0, maximo = 0, suma = 0;
        int[] array;
        double media;
        System.out.print("Introduzca la cantidad de valores que desea guardar en la lista: ");
        cantidadValores = scanner.nextInt();
        array = new int[cantidadValores];
        for(int contador = 0; contador < array.length; contador++){
            System.out.print("Introduzca los valores que contendrá cada espacio en la lista: ");
            array[contador] = scanner.nextInt();
        }
        System.out.println();
        minimo = array[0];
        maximo = array[0];
        for(int valor : array){
            suma = suma + valor;
            System.out.print(valor + " ");
            if(valor < minimo){
                minimo = valor;
            }
            if(valor > maximo){
                maximo = valor;
            }
        }
        System.out.println();
        media = (double) suma/cantidadValores;
        System.out.println("El valor más pequeño entre todos los valores es: " + minimo);
        System.out.println("El valor más grande entre todos los valores es: " + maximo);
        System.out.println("La media de todos los valores es: " + media);
        scanner.close();
    }
}