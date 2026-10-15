import java.util.Scanner;
/**
 *
 * @author 09_1DAW
 */
public class ejercicio4 {
    public static void main(String[] args){
        System.out.println("Introduza su nombre: ");
        String usuario= "Jose";
        final String USUARIO_CORRECTO = "Jose";
        
        if (usuario == USUARIO_CORRECTO){
            System.out.println("Bienvenido "+usuario);

        }
        else{
            System.out.println("Usuario incorrecto");
        }
        System.out.println("Fin");
    }
    
}