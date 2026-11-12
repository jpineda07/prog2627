package ud4;

import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza los 5 productos: ");
        double[] productos = new double[5];

        for (int i = 0; i < productos.length; i++) {
            System.out.print("Producto " + (i + 1) + ": ");
            productos[i] = sc.nextDouble();

        }
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto " + (i + 1) + " - " + productos[i] + " euros");
        }
        System.out.println("\nQue producto quieres modificar?: ");
        int opcion = sc.nextInt();
        if (opcion >= 1 && opcion <= 5) {
            System.out.print("Introduzca el nuevo precio: ");
            productos[opcion - 1] = sc.nextDouble();

            System.out.println("\nLista actualizada:");
            for (int i = 0; i < productos.length; i++) {
                System.out.println("Producto " + (i + 1) + " - " + productos[i] + " euros");
            }
        } else {
            System.out.println("Opción no válida. Debe ser un número entre 1 y 5.");
        }
    }
}
