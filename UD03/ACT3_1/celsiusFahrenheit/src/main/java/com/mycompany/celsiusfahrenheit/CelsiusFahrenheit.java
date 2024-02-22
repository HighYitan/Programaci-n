package com.mycompany.celsiusfahrenheit;
import java.util.Scanner;
public class CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char eleccion;
        double grados;
        System.out.print("Si utiliza Celsius escriba C, si utiliza Fahrenheit escriba F: ");
        eleccion = scanner.next().charAt(0);
        if (eleccion == 'C' || eleccion == 'c'){
            System.out.print("Escriba su temperatura en celsius, por favor: ");
            grados = scanner.nextDouble();
            System.out.println(grados + "º Celsius en grados Fahrenheit son " + ((grados*9/5)+32) + "º.");
        }
        else if (eleccion == 'F' || eleccion == 'f'){
            System.out.print("Escriba su temperatura en fahrenheit, por favor: ");
            grados = scanner.nextDouble();
            System.out.println(grados + "º Fahrenheit en grados Celsius son " + ((grados-32)*5/9) + "º.");
        }
        else{
            System.out.println("ERROR, pruebe de nuevo y escriba C o F."); 
        }
        scanner.close();
    }
}