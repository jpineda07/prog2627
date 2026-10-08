import java.util.Scanner;


public class Ejercicio20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el primer numero: ");
        int n1 = sc.nextInt();
        System.out.println("introduzca el segundo numero: ");
        int n2 = sc.nextInt();
        
        double media = (double)(n1+n2)/2;
        
        System.out.println("La media de los dos numeros es: "+media);
        
    }
    
}
