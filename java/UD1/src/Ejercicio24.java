/**Algoritmo para salir a la calle 
 @author Jose antonio pineda
 **/


import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
             
        System.out.println("Esta lloviendo?: ");
        boolean lluvia  = sc.nextBoolean();
        System.out.println("Has terminado las tareas?: ");
        boolean tareas  = sc.nextBoolean();
        System.out.println("Necesitas ir a la biblioteca?: ");
        boolean biblioteca  = sc.nextBoolean();
        
        boolean salir = (!lluvia && tareas) || biblioteca;
        
        System.out.println("\nPuedes salir?: "+salir);
    }
    
}

        