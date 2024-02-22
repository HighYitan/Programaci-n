package com.mycompany.vocalconsonante;
public class VocalConsonante {
    public static void main(String[] args) {
        System.out.println("Se mostrará el abedecedario entero y se clasificará en vocales o consonantes.");
        for(char caracter = 'A'; caracter <= 'Z'; caracter++){
            if(caracter == 'A'){
                System.out.println("La letra " + caracter + " es una vocal.");
            }
            else if(caracter == 'E'){
                System.out.println("La letra " + caracter + " es una vocal.");
            }
            else if(caracter == 'I'){
                System.out.println("La letra " + caracter + " es una vocal.");
            }
            else if(caracter == 'O'){
                System.out.println("La letra " + caracter + " es una vocal.");
            }
            else if(caracter == 'U'){
                System.out.println("La letra " + caracter + " es una vocal.");
            }
            else{
                System.out.println("La letra " + caracter + " es una consonante.");
            }
        }
    }
}