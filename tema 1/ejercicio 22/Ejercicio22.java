import java.util.Scanner;

public class Ejercicio22 {
    static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        int edad = sc.nextInt();
        boolean mayor = edad >= 18;
        
        System.out.println("Mayor de edad: "+mayor);
    }
}
