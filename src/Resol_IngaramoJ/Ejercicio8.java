package Resol_IngaramoJ;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige la conversión a realizar");
        System.out.println("Presione 1 para Fahrenheit a Celsius");
        System.out.println("Presione 2 para Celsius a Fahrenheit");

        int opcion = scanner.nextInt();

        System.out.print("Elige el número a convertir: ");
        double a = scanner.nextDouble();

        double resultado = 0;

        if (opcion == 1) {
            resultado = (a - 32) * 5 / 9;
            System.out.println("Resultado = " + resultado);
        } else if (opcion == 2) {
            resultado = (a * 9 / 5) + 32;
            System.out.println("Resultado = " + resultado);


        }
    }
}
