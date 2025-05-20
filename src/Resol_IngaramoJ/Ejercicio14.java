package Resol_IngaramoJ;

import java.util.Arrays;

public class Ejercicio14 {
    public static void main(String[] args) {
        // matriz inicial
        int[][] matriz = {
                {1, 2, 0, 3, 0, 7},
                {0, 0, 0, 0},
                {0, 6, 9, 8, 0, 9, 6},
                {0, 0, 0, 0, 7, 9, 0, 0},
                {0, 0, 0, 0, 0},
                {8, 7, 0, 8, 9, 0, 8}
        };

        // mostrar la matriz original
        System.out.println("Matriz Original:");
        mostrar(matriz);

        // quitar ceros de cada fila de la matriz
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = quitarCeros(matriz[i]);
        }

        // mostrar la matriz sin ceros
        System.out.println("\nMatriz sin ceros:");
        mostrar(matriz);
    }

    // metodo para quitar los ceros de una fila
    public static int[] quitarCeros(int[] fila) {
        int contador = 0;

        // contamos cuántos elementos no son ceros
        for (int i = 0; i < fila.length; i++) {
            if (fila[i] != 0) {
                contador++;
            }
        }

        // creamos una nueva fila sin ceros
        int[] sinCeros = new int[contador];
        int index = 0;
        for (int i = 0; i < fila.length; i++) {
            if (fila[i] != 0) {
                sinCeros[index++] = fila[i];
            }
        }

        return sinCeros;
    }

    // metodo para mostrar la matriz corregida
    public static void mostrar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
