
package ud4;
import java.util.Scanner;
/**
 *
 * @author 09_1DAW
 */



public class Ejercicio33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un texto: ");
        String texto = sc.nextLine();

        int letras = 0;
        int digitos = 0;
        int espacios = 0;
        int otros = 0;
        int mayusculas = 0;
        int minusculas = 0;

        for (int i = 0; i < texto.length(); i++) {

            char caracter = texto.charAt(i);

            if (Character.isLetter(caracter)) {
                letras++;

                if (Character.isUpperCase(caracter)) {
                    mayusculas++;
                } else if (Character.isLowerCase(caracter)) {
                    minusculas++;
                }

            } else if (Character.isDigit(caracter)) {
                digitos++;

            } else if (Character.isWhitespace(caracter)) {
                espacios++;

            } else {
                otros++;
            }
        }

        System.out.println();
        System.out.println("Letras: " + letras);
        System.out.println("Dígitos: " + digitos);
        System.out.println("Espacios: " + espacios);
        System.out.println("Otros caracteres: " + otros);

        System.out.println("Mayúsculas: " + mayusculas);
        System.out.println("Minúsculas: " + minusculas);

    }
}

