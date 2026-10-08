import java.util.Scanner;
/**
 *
 * @author 09_1DAW
 */
public class Ejercicio27_1 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        int edad = sc.nextInt();
        double precio = edad<12 ? 5 : edad>64? 6: 8;
        System.out.println("Precio: "+precio);
        

    }
    
}
