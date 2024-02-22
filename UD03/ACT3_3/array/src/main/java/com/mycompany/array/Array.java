package com.mycompany.array;
public class Array {
    public static void main(String[] args) {
        int[] array = new int [10];
        System.out.println("El programa mostrará los valores de un array de 10 elementos.");
        for(int contador = 0; contador < array.length; contador++){
            array[contador] = contador+1;
            //System.out.println(array[contador]);
        }
        for(int numeros : array){ // el nom de la variable 'array2' no és correcte, realment no és un array, és un 'int', millor posa 'i', 'n' ... però no 'array2'
            System.out.println(numeros);
        }
    }
}