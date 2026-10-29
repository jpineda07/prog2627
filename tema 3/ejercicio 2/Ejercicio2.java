
import java.util.Scanner;

/**
 *Escribir dos declaraciones rellenando lo que falta
 * @author 09_1DAW
 */
public class Ejercicio2 {
    public static void main(String[] args){
        
        System.out.println("Introduzca un numero");
        Scanner sc = new Scanner (System.in);
        int doble =calcularDoble(sc.nextInt());
        System.out.println(doble);

    }
    public static int calcularDoble(int numero){
        return numero * 2;
    }
    public static void mostrarMensaje(){
        System.out.println("Hola"); 
   }
}
