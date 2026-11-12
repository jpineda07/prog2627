package ud4;

import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] invertidos = new int[6];

        System.out.println("Introduza los 6 valores: ");

        for (int i = 0; i < invertidos.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            invertidos[i] = sc.nextInt();
        }
        for (int i = 0; i < invertidos.length; i++) {
            System.out.println("Valor " + (i + 1) + " - " + invertidos[i]);
        }
        System.out.println("\nOrden invertido");
        for (int i = invertidos.length - 1; i >= 0; i--) {
            System.out.println("Valor " + (i + 1) + " - " + invertidos[i]);
        }
    }
}
