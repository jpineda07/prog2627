
import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero positivo: ");
        int n = sc.nextInt();
        int n1 = 1;

        if (n < 1) {
            System.out.println("Error , el numero debe ser positivo");
        } else {

            while (n1 <= n) {
                System.out.print(n1 + ", ");
                n1++;
            }
        }

    }

}
