import java.util.Scanner;
/**
 *
 * @author 09_1DAW
 */
public class ejercicio5 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza el primer numero: ");
        int n1= sc.nextInt();
        System.out.println("Introduza el segundo numero: ");
        int n2= sc.nextInt();
        
        if (n1 > n2 ){
            System.out.println(n1 +" es mayor que "+n2);

        } else if(n1<n2){
            System.out.println(n2+" es mayor que "+n1);
        } else{
            System.out.println(n1+" es igual que "+n2);
        }
        System.out.println("Fin");
    }
    
}

