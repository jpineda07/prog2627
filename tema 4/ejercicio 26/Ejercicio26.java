package ud4;

import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre:");
        String nombre = sc.nextLine().trim();

        System.out.println("Introduce el primer apellido:");
        String apellido1 = sc.nextLine().trim();

        System.out.println("Introduce el segundo apellido:");
        String apellido2 = sc.nextLine().trim();

        String iniciales = nombre.substring(0, 1).toUpperCase()
                + apellido1.substring(0, 1).toUpperCase()
                + apellido2.substring(0, 1).toUpperCase();

        System.out.println("Iniciales: " + iniciales);
    }
}
