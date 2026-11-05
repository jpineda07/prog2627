
import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = 0, num2 = 0, num3 = 0;

        System.out.println("===================MENU===================\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Raiz Cuadrada\n6.Potencia\nSelecciona la opcion: ");
        int menu = sc.nextInt();
        if (menu == 1 || menu == 2 || menu == 3 || menu == 4 || menu == 6) {
            System.out.println("Introduzca los dos numeros que desees operar: ");
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();
        } else if (menu == 5) {
            System.out.println("Introduzca un numero: ");
            num1 = sc.nextDouble();
        }
        switch (menu) {
            case 1:
                double sumar = suma(num1, num2);
                System.out.println("La suma da: " + sumar);
                break;
            case 2:
                double restar = resta(num1, num2);
                System.out.println("La resta da: " + restar);
                break;
            case 3:
                System.out.println("1.Operar con 2 numeros decimales\n2.Operar con 3 numeros enteros\n3.Operar con 2 numeros enteros");
                int menuMultiplicacion = sc.nextInt();
                switch (menuMultiplicacion) {
                    case 1:
                        double multiplicacion = multiplicar(num1, num2);
                        System.out.println("La multiplicacion da: " + multiplicacion);
                        break;
                    case 2:
                        System.out.println("Añade el tercer numero: ");
                        num3 = sc.nextInt();
                        int multiplicacionInt = (int) multiplicar((int) num1, (int) num2, (int) num3);
                        System.out.println("La multiplicacion da: " + multiplicacionInt);
                        break;
                    case 3:
                        System.out.println("La multiplicacion da: " + multiplicar((int) num1, (int) num2));
                        break;
                }
                break;
            case 4:
                if (num2 == 0 || num1 == 0) {
                    System.out.println("No es posible dividir entre 0");
                    break;
                } else {
                    System.out.println("La division da: " + dividir(num1, num2));
                }
                break;
            case 5:
                System.out.println("la raiz es: " + raiz(num1));
                break;
            case 6:
                System.out.println("La potencia es: " + potencia(num1, num2));
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

    public static double multiplicar(int numero1, int numero2) {
        return (numero1 * numero2);
    }

    public static double multiplicar(int numero1, int numero2, int numero3) {
        return (numero1 * numero2 * numero3);
    }

    public static double multiplicar(double numero1, double numero2) {
        return (numero1 * numero2);
    }

    public static double dividir(double numero1, double numero2) {
        return (numero1 / numero2);

    }

    public static double raiz(double numero1) {
        return (Math.sqrt(numero1));
    }

    public static double potencia(double numero1, double numero2) {
        return (Math.pow(numero2, numero2));
    }

}
