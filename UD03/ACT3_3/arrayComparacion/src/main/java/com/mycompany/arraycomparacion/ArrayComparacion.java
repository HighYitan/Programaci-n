package com.mycompany.arraycomparacion;
import java.util.Arrays;
public class ArrayComparacion {
    public static void main(String[] args) {
        int[] array = new int [10];
        int[] array2 = new int [10];
        boolean comparacion = true;
        System.out.println("El programa mostrará los valores de un array de 10 elementos y los comparará para ver si son iguales en longitud y contenido.");
        for(int contador = 0; contador < array.length; contador++){
            array[contador] = contador+1;
            array2[contador] = contador+1;
            System.out.println(array[contador]);
            System.out.println(array2[contador]);
        }
        if(array == array2){ //Compara los lugares que ocupa en la memoria, no los contenidos o longitud, siempre serán diferentes por este motivo.
            System.out.println("Los arrays son iguales...");
        }
        if(array.length == array2.length){ //Compara longitud y los contenidos de cada posición.
            for(int indice = 0; indice < array.length; indice++){
                if(array[indice] != array2[indice]){
                    comparacion = false;
                }
            }
        }
        else{
            comparacion = false;
        }
        if (comparacion){ //Comparación manual
            System.out.println("Los arrays son iguales.");
        }
        else{
            System.out.println("Los arrays no son iguales.");
        }
        if(Arrays.equals (array, array2)){ //Compara sin necesidad de nada más con Arrays.equals()
            System.out.println("¡Los arrays son iguales!");
        }
        else{
            System.out.println("¡Los arrays no son iguales!");
        }
    }
}