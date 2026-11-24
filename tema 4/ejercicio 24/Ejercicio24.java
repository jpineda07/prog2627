
package ud4;

import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la primera palabra: ");
        String primeraPalabra = sc.nextLine();
        System.out.println("Introduce la segunda palabra: ");
        String segundaPalabra = sc.nextLine();
        
        System.out.println("Son iguales?: "+primeraPalabra.equals(segundaPalabra));
        System.out.println("Son iguales ignorando mayusculas?: "+primeraPalabra.equalsIgnoreCase(segundaPalabra));
        System.out.println("Tienen la misma longitud?: " + (primeraPalabra.length() == segundaPalabra.length()));
        System.out.println("Empiezan por el mismo caracter?: " + (primeraPalabra.charAt(0) == segundaPalabra.charAt(0)));
        
    }
}
