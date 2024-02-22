package com.mycompany.sumapares;
public class SumaPares {
    public static void main(String[] args) {
        System.out.println("A continuación se mostrará la suma de todos los números pares de 1 a 100:");
        int suma = 0;
        for(int contador = 2; contador <= 100; contador++){
            if(contador % 2 == 0){
                suma = suma+contador;
                System.out.println("Sumando el par: " + contador + " quedaría: " + suma);
            }
            else{
                System.out.println("Es impar");
            }
        }
        System.out.println("La suma total de los pares del 1 al 100 es: " + suma);
    }
}