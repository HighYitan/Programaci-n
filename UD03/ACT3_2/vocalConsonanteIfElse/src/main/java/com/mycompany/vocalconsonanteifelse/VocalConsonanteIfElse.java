package com.mycompany.vocalconsonanteifelse;
public class VocalConsonanteIfElse {
    public static void main(String[] args) {
        System.out.println("Se mostrará el abedecedario entero y se clasificará en vocales o consonantes.");
        for(char caracter = 'A'; caracter <= 'Z'; caracter++){
            if(caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U'){
                System.out.println("La letra " + caracter + " es una vocal.");
            }
            else{
                System.out.println("La letra " + caracter + " es una consonante.");
            }
        }
    }
}