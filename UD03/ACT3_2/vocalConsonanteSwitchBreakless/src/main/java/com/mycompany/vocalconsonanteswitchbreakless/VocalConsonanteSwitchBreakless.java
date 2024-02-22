package com.mycompany.vocalconsonanteswitchbreakless;
public class VocalConsonanteSwitchBreakless {
    public static void main(String[] args) {
        System.out.println("Se mostrará el abedecedario entero y se clasificará en vocales o consonantes.");
        for(char caracter = 'A'; caracter <= 'Z'; caracter++){
            switch (caracter){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
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