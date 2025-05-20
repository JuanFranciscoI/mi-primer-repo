package Resol_IngaramoJ;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la palabra a analizar: ");
        int contador = 0;
        // la convierto a minuscula tambien para evitar agregar en el if las vocales en mayusculas tambien
        String ingresePalabra = scanner.nextLine().toLowerCase();
        for (int i = 0; i < ingresePalabra.length(); i++) {
            // charAt(i) para recorrer cada letra ingresada para verificarla
            char letra = ingresePalabra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
                contador++;
        }
        System.out.println("Cantidad de vocales encontradas: " + contador);
    }
}
