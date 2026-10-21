import java.util.Scanner;
/**
 *
 * @author 09_1DAW
 */
public class Ejercicio17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("1.Mostrar Saldo \n2.Retirar Saldo \n3.Salir\nElije una opcion :");
        int opcion = sc.nextInt();
            if (opcion == 3){
                System.out.println("Gracias por usar el cajero. Adios!");
                break;
            }else if (opcion == 2) {
                System.out.println("\nRetirando dinero...");
                
            }else if (opcion == 1){
                System.out.println("\nMostrando saldo...");
            }else{
                System.out.println("\nLa opcion introducida no es valida , prueba de nuevo: ");
            }
            
        }
        
    }
    
}
