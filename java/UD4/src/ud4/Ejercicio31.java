package ud4;

import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una direccion de correo:");
        String correo = sc.nextLine().trim().toLowerCase();

        boolean contieneArroba = correo.contains("@");
        boolean puntoDespuesArroba = false;
        boolean noContieneEspacios = !correo.contains(" ");

        int posicionArroba = correo.indexOf("@");

        if (posicionArroba != -1) {
            puntoDespuesArroba = correo.indexOf(".", posicionArroba) != -1;
        }

        System.out.println("Contiene @: " + contieneArroba);
        System.out.println("Contiene un punto despues de @: " + puntoDespuesArroba);
        System.out.println("No contiene espacios: " + noContieneEspacios);

        if (contieneArroba && puntoDespuesArroba && noContieneEspacios) {
            System.out.println("Correo valido");

            String usuario = correo.substring(0, posicionArroba);
            String dominio = correo.substring(posicionArroba + 1);

            System.out.println("Usuario: " + usuario);
            System.out.println("Dominio: " + dominio);
        } else {
            System.out.println("Correo no valido");
        }
    }
}
