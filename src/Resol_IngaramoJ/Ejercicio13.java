package Resol_IngaramoJ;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[3];
        double[][] notas = new double[3][3];

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingresa el nombre del alumno " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa las notas del alumno " + (i + 1) + ": ");    //i representa el estudiante.

            for (int j = 0; j < 3; j++) {
                System.out.println("Nota " + (j + 1) + ": "); // j representa la nota del estudiante i.
                notas[i][j] = scanner.nextDouble();
            }
        }
        for (int i = 0; i < 3; i++) {
            double suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += notas[i][j];    // acumulamos las notas de cada uno
            }
            double promedio = suma / 3; //calculamos promedio
            System.out.println("Alumno: " + nombres[i] + " - Promedio: " + promedio);
        }

    }
}
