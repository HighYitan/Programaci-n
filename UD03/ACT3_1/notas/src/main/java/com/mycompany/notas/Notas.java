package com.mycompany.notas;
import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        System.out.println("Se le notificará si la nota introducida es aprobada o suspesa.");
        System.out.print("Introduzla la nota del estudiante: ");
        nota = scanner.nextDouble();
        if (nota >= 5){
            System.out.println("El estudiante ha aprobado, enhorabuena.");
        }
        else{
            System.out.println("El estudiante ha suspendido, que estudie más la próxima vez.");
        }
        scanner.close();
    }
}