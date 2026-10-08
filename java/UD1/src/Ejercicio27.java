import java.util.Scanner;
/**
 *
 * @author 09_1DAW
 */
public class Ejercicio27 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        int edad = sc.nextInt();
        double precio = edad<12 ? 5 : 8;
        System.out.println("Precio: "+precio);
        

    }
    
}
