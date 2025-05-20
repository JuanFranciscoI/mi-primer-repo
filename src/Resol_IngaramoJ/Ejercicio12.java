package Resol_IngaramoJ;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Primero pido al usuario que ingrese 5 números
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();  // leo el número y lo guardo en la posición i
        }

        // Muestro lo que ingresó el usuario para confirmar
        System.out.println("Tus números son: " + Arrays.toString(numeros));

        // Ahora creo una copia del arreglo para no tocar el original
        int[] ordenado = Arrays.copyOf(numeros, numeros.length);

    for (int i = 0; i < ordenado.length - 1; i++) {
        for (int j = i + 1; j < ordenado.length; j++) {
            int aux = ordenado[i];
            if (ordenado[i] < ordenado[j]) {
            ordenado[i] = ordenado[j];
            ordenado[j] = aux;
            }
        }
    }
        System.out.println("Ordenado de mayor a menor: " + Arrays.toString(ordenado));
    }
}
