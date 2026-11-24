package ud4;

import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del archivo:");
        String archivo = sc.nextLine().toLowerCase();

        if (archivo.endsWith(".pdf")) {
            System.out.println("Archivo PDF");
        } else if (archivo.endsWith(".jpg")) {
            System.out.println("Archivo JPG");
        } else if (archivo.endsWith(".png")) {
            System.out.println("Archivo PNG");
        } else if (archivo.endsWith(".txt")) {
            System.out.println("Archivo TXT");
        } else {
            System.out.println("Extension no permitida");
        }
    }
}
