package com.mycompany.arrayaleatorio;
public class ArrayAleatorio {
    public static void main(String[] args) {
        final int MIN = 100, MAX = 200;
        int[] array = new int [10];
        System.out.println("El programa mostrará los valores de un array de 10 elementos.");
        for(int contador = 0; contador < array.length; contador++){
            array[contador] = MIN + (int) (Math.random() * ((MAX - MIN) + 1)); 
            System.out.println(array[contador]);
        }
    }
}