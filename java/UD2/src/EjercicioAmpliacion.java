
import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class EjercicioAmpliacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intentos = 3;
        while (intentos >= 0) {
            System.out.println("Introduce el PIN: ");
            int pinIntroducido = sc.nextInt();
            int pinCorrecto = 2580;
            System.out.println("intentos restantes: " + intentos);
            intentos = intentos - 1;

        if (pinIntroducido == pinCorrecto){
            System.out.println("Acceso concedido."); 
       }else if (intentos < 0){
           System.out.println("Acceso bloqueado.");
       }
                
        }
    }

}
