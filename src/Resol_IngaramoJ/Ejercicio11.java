package Resol_IngaramoJ;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese cuántos términos de Fibonacci desea ver: ");
        int n = scanner.nextInt();

        System.out.println("Serie de Fibonacci:");
        // Bucle para imprimir los términos desde 1 hasta n
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    //Metodo recursivo que calcula el término n de la serie de Fibonacci
    static int fibonacci(int n) {
        // Caso base: los dos primeros términos son 1
        if (n == 1 || n == 2) return 1;

        // Llamada recursiva: suma los dos términos anteriores
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}