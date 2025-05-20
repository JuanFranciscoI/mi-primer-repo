package Resol_IngaramoJ;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige la operación a realizar");
        System.out.println("Presione 1 para suma");
        System.out.println("Presione 2 para multiplicar");
        System.out.println("Presione 3 para resta");
        System.out.println("Presione 4 para división");

        int opcion = scanner.nextInt();

        System.out.print("Elige el número a: ");
        double a = scanner.nextDouble();
        System.out.print("Elige el número b: ");
        double b = scanner.nextDouble();

        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = a + b;
                System.out.println("Resultado = " + resultado);
                break;
            case 2:
                resultado = a * b;
                System.out.println("Resultado = " + resultado);
                break;

            case 3:
                resultado = a - b;
                System.out.println("Resultado = " + resultado);
                break;

            case 4:
                resultado = a / b;
                System.out.println("Resultado = " + resultado);
                break;
            default:
                System.out.println("Opción inválida.");

        }
    }
}