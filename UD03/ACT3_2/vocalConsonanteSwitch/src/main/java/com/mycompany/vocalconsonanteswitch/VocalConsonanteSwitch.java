package com.mycompany.vocalconsonanteswitch;
public class VocalConsonanteSwitch {
    public static void main(String[] args) {
        System.out.println("Se mostrará el abedecedario entero y se clasificará en vocales o consonantes.");
        for(char caracter = 'A'; caracter <= 'Z'; caracter++){
            switch (caracter){
                case 'A':{
                    System.out.println("La letra " + caracter + " es una vocal.");
                    break;
                }
                case 'E':{
                    System.out.println("La letra " + caracter + " es una vocal.");
                    break;
                }
                case 'I':{
                    System.out.println("La letra " + caracter + " es una vocal.");
                    break;
                }
                case 'O':{
                    System.out.println("La letra " + caracter + " es una vocal.");
                    break;
                }
                case 'U':{
                    System.out.println("La letra " + caracter + " es una vocal.");
                    break;
                }
                default:{
                    System.out.println("La letra " + caracter + " es una consonante.");
                }
            }
        }
    }
}