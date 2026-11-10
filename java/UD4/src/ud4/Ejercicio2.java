package ud4;

import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza las 5 temperaturas: ");
        double[] temperaturas= new double[5];

        for (int i = 0; i <= temperaturas.length - 1; i++) {
            System.out.println("Dia " + (i + 1) + " - " + temperaturas[i]);

            temperaturas[i] = sc.nextDouble();
        }
        System.out.println(temperaturas[1]);
    }

}
