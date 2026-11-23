package ud4;

import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre completo: ");
        String nombreCompleto = sc.nextLine();
        
        System.out.println("Salida: "+nombreCompleto.trim().toLowerCase().toUpperCase().replace(' ','-'));
        
    }

}
