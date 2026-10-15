import java.util.Scanner;
/**
 *
 * @author 09_1DAW
 */
public class ejercicio6 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza un numero: ");
        int n1= sc.nextInt();
        
        if ((n1% 2) == 0 ){
            System.out.println(n1 +" es par");
        } else{
            System.out.println(n1+" es impar");
        }
        System.out.println("Fin");
    }
    
}

