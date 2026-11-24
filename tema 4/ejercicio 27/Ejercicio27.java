
package ud4;

import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la frase: ");
        String frase = sc.nextLine();
        System.out.println("Que palabra quieres buscar?: ");
        String palabra = sc.nextLine();
        
        frase = frase.toLowerCase();
        palabra = palabra.toLowerCase();
        
        System.out.println("Contiene la palabra?: "+frase.contains(palabra));
        System.out.println("Esta en la posicion: " + frase.indexOf(palabra));
        System.out.println("Comienza por ella?: "+ frase.startsWith(palabra));
        System.out.println("Termina por ella?: "+ frase.endsWith(palabra));
    }
    
}
