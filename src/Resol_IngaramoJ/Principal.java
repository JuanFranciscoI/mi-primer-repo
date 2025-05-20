package Resol_IngaramoJ;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el número de ejercicio:");
    int opcion = scanner.nextInt();

    switch (opcion) {
        case 1:
            Ejercicio1.main(null); //llamando al main
            break;

        case 2:
            Ejercicio2.main(null);
            break;

        case 3:
            Ejercicio3.main(null);
            break;

        case 4:
            Ejercicio4.main(null);
            break;

        case 5:
            Ejercicio5.main(null);
            break;

        case 6:
            Ejercicio6.main(null);
            break;

        case 7:
            Ejercicio7.main(null);
            break;

        case 8:
            Ejercicio8.main(null);
            break;

        case 9:
            Ejercicio9.main(null);
            break;

        case 10:
            Ejercicio10.main(null);
            break;

        case 11:
            Ejercicio11.main(null);
            break;

        case 12:
            Ejercicio12.main(null);
            break;

        case 13:
            Ejercicio13.main(null);
            break;
        case 14:
            Ejercicio14.main(null);
            break;
        default:
            System.out.print("Ejercicio inexistente");
    }

    }
}
