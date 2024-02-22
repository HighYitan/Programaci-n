package com.mycompany.arraybidimensional;
public class ArrayBidimensional {
    public static void main(String[] args) {
        int[][] array = new int [4][4];
        int valores = 1, suma = 0;
        System.out.println("Se mostrarán los valores del 1 al 16 en una array bidimensional de 4 filas x 4 columnas.");
        for(int contador = 0; contador < array.length; contador++){
            for(int contador2 = 0; contador2 < array[contador].length; contador2++){
                array[contador][contador2] = valores;
                //System.out.println(array[contador][contador2]); 
                valores++;
            }
        }
        System.out.println();
        for(int[] filas : array){
            System.out.print("[ ");
            for(int columnas : filas){
                System.out.print(columnas + " ");
                suma = suma + columnas;
            }
            System.out.println("]");
        }
        System.out.println();
        System.out.println("El suma total es: " + suma);
    }
}