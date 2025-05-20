package Resol_IngaramoJ;

import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca su nombre: ");
        String saludarNombre = scanner.nextLine();
        System.out.println("Hola como estas señor " + saludarNombre);

    }
}
