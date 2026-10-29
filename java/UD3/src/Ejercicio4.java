
import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================MENU===================\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\nSelecciona la opcion: ");
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Introduzca los numeros para la suma: ");
                double sumar = suma(sc.nextDouble(), sc.nextDouble());
                System.out.println("La suma da: " + sumar);
                break;
            case 2:
                System.out.println("Introduzca los numeros para la resta: ");
                double restar = resta(sc.nextDouble(), sc.nextDouble());
                System.out.println("La resta da: " + restar);
                break;
            case 3:
                System.out.println("Introduzca los numeros para la multiplicacion: ");
                double multiplicacion = multiplicar(sc.nextDouble(), sc.nextDouble());
                System.out.println("La multiplicacion da: " + multiplicacion);
                break;
            case 4:
                System.out.println("Introduzca los numeros para la division: ");
                double division = dividir(sc.nextDouble(), sc.nextDouble());
                if (sc.nextDouble() == 0) {
                    System.out.println("No es posible dividir entre 0");
                    break;
                } else {
                    System.out.println("La division da: " + division);
                }
                break;
            default:
                System.out.println("Opcion no encontrada");

        }
    }

    public static double suma(double numero1, double numero2) {
        return (numero1 + numero2);
    }

    public static double resta(double numero1, double numero2) {
        return (numero1 - numero2);
    }

    public static double multiplicar(double numero1, double numero2) {
        return (numero1 * numero2);
    }

    public static double dividir(double numero1, double numero2) {
        return (numero1 / numero2);

    }

}
