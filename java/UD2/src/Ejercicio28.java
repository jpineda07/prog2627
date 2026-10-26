
import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int suma = 0;
        int contador = 0;
        do {
            System.out.println("introduce un numero (introduzca 0 para parar): ");
            n1 = sc.nextInt();
            if (n1 != 0) {
                suma += n1;
                contador++;
            }

        } while (n1 !=0);
        if (contador > 0){
            double media = (double)suma /contador;
            System.out.println("la media es: "+media);
        }else {
            System.out.println("No has introducido ningun numero.");
        }
    }
}
