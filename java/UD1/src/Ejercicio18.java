import java.util.Scanner;


public class Ejercicio18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su fecha de nacimiento: ");
        int FechaN = sc.nextInt();
        System.out.println("introduzca el anio actual: ");
        int año = sc.nextInt();
        
        año=año-FechaN;
        System.out.println("tienes "+año+" anios");
    }
}
