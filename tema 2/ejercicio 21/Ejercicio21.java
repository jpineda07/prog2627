import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int n1 = sc.nextInt();
        
        for(int i = 1 ; i<=10;i++){
            System.out.println(n1+" x "+i+" : "+(n1*i));
        }
    }
}
