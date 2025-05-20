package Resol_IngaramoJ;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Escribe una nueva contraseña: ");
            String contra = scanner.nextLine();

            if (contra.length() < 8) {
                System.out.println("Contraseña no segura, menos de 8 caracteres");
                continue;
            }
            int mayusculas = 0, minusculas = 0, numeros = 0;

            for (int i = 0; i < contra.length(); i++) {
                char c = contra.charAt(i);
                if (Character.isUpperCase(c)) {
                    mayusculas++;
                }
                if (Character.isLowerCase(c)) {
                    minusculas++;
                }
                if (Character.isDigit(c)) {
                    numeros++;
                }

            }
            if (mayusculas >= 2 && minusculas >= 3 && numeros >= 2) {
                System.out.println("Contraseña segura. Aceptada.");
                break;
            } else {
                if (mayusculas < 2) {
                    System.out.println("Contraseña insegura. Mayúsculas insuficientes.");
                }
                if (minusculas < 3) {
                    System.out.println("Contraseña insegura. Minúsculas insuficientes.");
                }
                if (numeros < 2) {
                    System.out.println("Contraseña insegura. Números insuficientes.");
                }
            }
        }
    }
}