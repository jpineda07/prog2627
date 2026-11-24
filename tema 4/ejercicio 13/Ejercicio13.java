
package ud4;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        // Creamos un Scanner para leer datos introducidos por teclado
        Scanner sc = new Scanner(System.in);

        // Creamos un array de números enteros
        int[] numeros = {12, 5, 8, 21, 4, 16, 9};

        // Pedimos al usuario el número que quiere buscar
        System.out.println("Que numero quieres buscar?:");
        int buscado = sc.nextInt();

        // Variable que indica si hemos encontrado el número
        // Al principio su valor es false porque todavía no lo hemos encontrado
        boolean encontrado = false;

        // Recorremos todas las posiciones del array
        for (int i = 0; i < numeros.length; i++) {

            // Comprobamos si el número de la posición actual es igual al buscado
            if (numeros[i] == buscado) {

                // Mostramos la posición donde se encuentra el número
                System.out.println("El numero se encuentra en la posicion " + i);

                // Indicamos que hemos encontrado el número
                encontrado = true;
            }
        }

        // Si encontrado sigue siendo false, significa que el número no está en el array
        if (!encontrado) {
            System.out.println("El numero no existe en el array.");
        }
    }
}
