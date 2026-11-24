package ud4;

import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la frase: ");
        String frase = sc.nextLine();
        System.out.println("Dos posiciones");
        int inicio = sc.nextInt();
        int fin = sc.nextInt();

        if (inicio >= 0 && fin <= frase.length() && inicio <= fin) {
            System.out.println("Subcadena: " + frase.substring(inicio, fin));

        }else{
            System.out.println("Error");
        }
        int pos = frase.indexOf(" ");
        System.out.println("Primera palabra: "+ frase.substring(0));
               

    }

}
