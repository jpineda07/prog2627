import java.util.Scanner;
/**
 *
 * @author 09_1DAW
 */
public class Ejercicio28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota del primer trimestre: ");
        int nota1 = sc.nextInt();
        System.out.println("Nota del segundo trimestre: ");
        int nota2 = sc.nextInt();
        System.out.println("Nota del tercer trimestre: ");
        int nota3 = sc.nextInt();
        
        int nota= (nota1 + nota2 + nota3)/3;
        double notas= (nota1 + nota2 + nota3)/3.0;
        
        System.out.println("Nota media del curso: "+nota+" ("+notas+")");
        
    }
}
