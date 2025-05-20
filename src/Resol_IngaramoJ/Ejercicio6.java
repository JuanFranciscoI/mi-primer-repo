package Resol_IngaramoJ;

import java.util.Random;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        int aleatorio = (int) (Math.random() * 99) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el número a adivinar: ");

        int intento = scanner.nextInt();

        while (intento != aleatorio) {

        if (intento < aleatorio) {
            System.out.println("El intento es más bajo que el número aleatorio");
        }     else {
                System.out.println("El intento es más alto que el número aleatorio");
            }
            intento = scanner.nextInt();

        }
        System.out.print("Adivinaste!");

    }

}