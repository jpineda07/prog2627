
package ud4;

import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce el primer apellido: ");
        String apellido1 = sc.nextLine();
        System.out.println("Introduce el segundo apellido: ");
        String apellido2 = sc.nextLine();
        System.out.println(nombre+" "+apellido1+" "+apellido2);
        
        String numeroCaracteres = nombre + " " + apellido1 + " " + apellido2;
        int contador = 0;
        
        for (int i = 0; i < numeroCaracteres.length(); i++) {
            contador++; 
        }  
        
        System.out.println("Tiene " + contador + " caracteres");
        String mayusculas=numeroCaracteres.toUpperCase();
        System.out.println("En mayusculas: "+mayusculas);
        String minusculas=numeroCaracteres.toLowerCase();
        System.out.println("En minusculas: "+minusculas);
    }
}
