
import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza el anio: ");
        int año = sc.nextInt();

        if (año % 4 == 0) {
            System.out.println("El anio es bisiesto");
        } else if (año % 100 == 0) {
            System.out.println("El anio no es bisiesto");
            
        }   if  (año % 100 == 0) {
                    if (año % 400 == 0)
                System.out.println("El anio es bisiesto");
        }else {
            System.out.println("No es bisiesto");
        }
        
    }
    }

