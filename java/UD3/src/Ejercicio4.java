      
import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1,num2;
        System.out.println("Introduzca los dos numeros que desees operar: ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        System.out.println("===================MENU===================\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\nSelecciona la opcion: ");
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                double sumar = suma(num1,num2);
                System.out.println("La suma da: " + sumar);
                break;
            case 2:
                double restar = resta(num1,num2);
                System.out.println("La resta da: " + restar);
                break;
            case 3:
                double multiplicacion = multiplicar(num1, num2);
                System.out.println("La multiplicacion da: " + multiplicacion);
                break;
            case 4:
                double division = dividir(num1,num2);
                if (num2 == 0 || num1==0) {
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


