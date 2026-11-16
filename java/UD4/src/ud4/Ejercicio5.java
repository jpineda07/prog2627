package ud4;

import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicitar el tamaño del array
        System.out.print("Introduce el tamaño del array: ");
        int tamaño = sc.nextInt();

        // Crear el array
        int[] numeros = new int[tamaño];

        // Introducir los elementos
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el elemento " + i + ": ");
            numeros[i] = sc.nextInt();
        }

        // Solicitar una posición
        System.out.print("Introduce la posicion que quieres consultar: ");
        int posicion = sc.nextInt();

        // Comprobar si la posición es válida
        if (posicion >= 0 && posicion < numeros.length) {
            System.out.println("El valor almacenado en la posicion "
                    + posicion + " es: " + numeros[posicion]);
        } else {
            System.out.println("Error: la posicion no es valida.");
            System.out.println("Las posiciones válidas van de 0 a "
                    + (numeros.length - 1));
        }

    }
}
