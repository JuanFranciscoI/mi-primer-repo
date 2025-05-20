package Resol_IngaramoJ;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la palabra a revertir: ");
        String palabra = scanner.nextLine();
        String palabraInvertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida += palabra.charAt(i);
        }
        if (palabra.equals(palabraInvertida)) {
            System.out.print("La palabra es palíndroma!");
        } else {
            System.out.print("La palabra no es palíndroma.");

        }
    }
}