
import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero: ");
        int n2 = sc.nextInt();
        int factorial = 1;
        int n1 = n2;

        while (n1 > 1) {
            factorial *= n1;
            n1--;

        }
        System.out.println(n2 + "!: " + factorial);
    }
}
