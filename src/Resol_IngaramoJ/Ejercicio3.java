package Resol_IngaramoJ;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número para conocer su tabla: ");

        int numero = scanner.nextInt();

        for (int i=1; i<=10; i++){
            int resultado = numero * i;
            System.out.print(resultado+"\n");
        // "\n" para que el resultado no se imprima seguido, si no con un salto de linea cada uno
        }
    }
}

