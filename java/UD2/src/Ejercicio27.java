
import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int numero = sc.nextInt();

        boolean primo = true;

        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                }
            }
        }

        if (primo) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("No es primo");
        }
    }

}
