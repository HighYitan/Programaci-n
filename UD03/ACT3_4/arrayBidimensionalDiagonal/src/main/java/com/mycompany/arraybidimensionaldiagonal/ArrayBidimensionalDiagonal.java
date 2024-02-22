package com.mycompany.arraybidimensionaldiagonal;
public class ArrayBidimensionalDiagonal {
    public static void main(String[] args) {
        final int LONGITUD = 4;
        int[][] array = new int [LONGITUD][LONGITUD];
        int suma = 0;
        System.out.println("El programa declarará e instanciará un array de 4 filas x 4 columnas, luego las inicializará con la suma de sus coordenadas y las mostrará en dos diagonales opuestas.");
        for(int contador = 0; contador < array.length; contador++){
            for(int contador2 = 0; contador2 < array[contador].length; contador2++){
                suma = contador + contador2;
                array[contador][contador2] = suma;
                System.out.print(array[contador][contador2] + " ");
            }
            System.out.println(); 
        }
        System.out.println("--------"); 
        for(int index = 0; index < array.length; index++){ //Diagonal
            System.out.print(array[index][index] + " ");
        }
        System.out.println(); 
        for(int index = array.length-1, jindex = 0; jindex < array.length; index--, jindex++){ //Diagonal Inversa
            System.out.print(array[index][jindex] + " ");
        }
    }
}