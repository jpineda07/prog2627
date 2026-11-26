package examenud4;

import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase, palabra1, palabra2, frase2;
        System.out.println("Introduzca la frase:");
        frase = sc.nextLine();
        System.out.println("Longitud de la frase: " + frase.length());
        System.out.println("Primer carater: " + frase.charAt(0));
        System.out.println("Ultimo caracter: " + frase.charAt(frase.length()-1));
        System.out.println("Frase en minusculas: " + frase.toLowerCase());
        System.out.println("Frase en mayusculas: " + frase.toUpperCase());
        System.out.println("Introduzca una palabra: ");
        palabra1 = sc.next();
        System.out.println("La frase contiene la palabra?: " + frase.contains(palabra1));
        System.out.println("Introduzca otra palabra: ");
        palabra2 = sc.next();
        System.out.println("La frase empiza por la palabra?: " + frase.startsWith(palabra2));
        Scanner comparar = new Scanner(System.in);
        System.out.println("Introduza otra frase para comparar: ");
        frase2 = comparar.nextLine();
        System.out.println("Son iguales las dos frases?: " + frase.equals(frase2));
    }
}
