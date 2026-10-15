
import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class ejercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer lado del triangulo(cm): ");
        double n1 = sc.nextDouble();
        System.out.println("Introduzca el segundo lado del triangulo(cm): ");
        double n2 = sc.nextDouble();
        System.out.println("Introduzca el tercer lado del triangulo(cm): ");
        double n3 = sc.nextDouble();

        if ((n1 + n2 > n3) && (n2 + n3 > n1) && (n1 + n3 > n2)) {
            System.out.println("Forma triangulo");
            if (n1 == n2 && n2 == n3) {
                System.out.println("El triangulo es Equilatero (todos los lados iguales).");
            } else if (n1 == n2 || n2 == n3 || n1 == n3) {
                System.out.println("El triangulo es Isosceles (dos lados iguales).");
            } else {
                System.out.println("El triangulo es Escaleno (todos los lados diferentes)");
            }
        } else {
            System.out.println("No forma triangulo");
        }
    }
}
