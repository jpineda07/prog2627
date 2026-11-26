
package examenud4;

import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra1,palabra2,palabra3,palabra4,palabra5;
        System.out.println("Introduce la primera palabra: ");
        palabra1 = sc.next();
        System.out.println("Patron: "+palabra1.matches("{a-z}{3-8}"));
        System.out.println("Introduce la segunda palabra: ");
        palabra2 = sc.next();
        System.out.println("Patron: "+palabra2.matches("{a-z}{3-8}"));
        System.out.println("Introduce la tercera palabra: ");
        palabra3 = sc.next();
        System.out.println("Patron: "+palabra3.matches("{a-z}{3-8}"));
        System.out.println("Introduce la cuarta palabra: ");
        palabra4 = sc.next();
        System.out.println("Patron: "+palabra4.matches("{a-z}{3-8}"));
        System.out.println("Introduce la quinta palabra: ");
        palabra5 = sc.next();
        System.out.println("Patron: "+palabra5.matches("{a-z}{3-8}"));

        
    }
}
