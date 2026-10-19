
import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class ejercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer numero: ");
        int n1 = sc.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        int n2 = sc.nextInt();
        System.out.println("====================================================\nCALCULADORA\n====================================================\n1.Suma\n2.Resta\n3.Multiplicacion\n4.Division\nIntroduza el numero de la operacion que quiera realizar: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                break;

            case 2:
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                break;
            case 3:
                System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                break;
            case 4:
                System.out.println(n1 + " / " + n2 + " = " + (n1 / n2) + " ,con resto = " + (n1 % n2));
                break;
            default:
                System.out.println("No es valido el valor introducido");
        }

    }
}
