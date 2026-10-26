import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Introduce dos numeros mayores que 0: ");
        
        a = sc.nextInt();
        b = sc.nextInt();
        
        while (b != 0){
            if ( a > b){
                a -= b;
            }else{
                b -=a;
            }
        }
        System.out.println(a);
   }

}
