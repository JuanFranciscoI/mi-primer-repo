package Resol_IngaramoJ;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe una oración: ");
        String texto = scanner.nextLine();

        //fuera espacios innecesarios
        texto = texto.trim();

        //reemplazo de comas, puntos y otros signos por espacios
        texto = texto.replaceAll("[.,;:!?]", " ");

        //divido el texto en palabras, separando por uno o más espacios
        String[] palabras = texto.split("\\s+");

        // cuento cuántas palabras quedaron después de separar
        int cantidad = palabras.length;

        // muestro el resultado
        System.out.println("Cantidad de palabras: " + cantidad);

    }
}