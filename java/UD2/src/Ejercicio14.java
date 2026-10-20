import java.util.Scanner;
/**
 * 
 *
 *
 * @author 09_1DAW
 */

public class Ejercicio14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int n1 = sc.nextInt();
        int n2 = 1;
        do{
            System.out.println("Numero: "+n2);
            n2++;
        }while (n2 <=n1);
        System.out.println("Fin del programa");
    }  
}
