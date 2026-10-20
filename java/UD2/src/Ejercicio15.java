
import java.util.Scanner;

/**
 *
 *
 *
 * @author 09_1DAW
 */

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int n1 = sc.nextInt();
        int n2 = n1;
        do {
            System.out.println("Numero: " + n2);
            n2--;
        } while (n2 >= 0);
        System.out.println("Fin del programa");
    }
}
