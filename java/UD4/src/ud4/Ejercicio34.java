package ud4;

import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio34 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Texto: ");
        String texto = sc.nextLine();

        System.out.print("Carácter: ");
        char caracter = sc.next().charAt(0);

        int contador = 0;
        int primera = -1;
        int ultima = -1;

        System.out.print("Posiciones: ");

        for (int i = 0; i < texto.length(); i++) {

            if (texto.charAt(i) == caracter) {

                contador++;

                if (primera == -1) {
                    primera = i;
                }

                ultima = i;

                System.out.print(i + " ");
            }
        }

        System.out.println();

        if (contador > 0) {
            System.out.println("Aparece: true");
        } else {
            System.out.println("Aparece: false");
        }

        System.out.println("Número de apariciones: " + contador);
        System.out.println("Primera posición: " + primera);
        System.out.println("Última posición: " + ultima);

    }
}

