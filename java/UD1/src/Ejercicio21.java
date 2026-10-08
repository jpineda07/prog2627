import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        final double PI = 3.14159265359;
        
        System.out.println("Introduzca el radio de la circunferencia: ");
        double radio = sc.nextDouble();
        double longitud = (2*PI)*radio;
        double area = PI*(radio*radio);
        
        System.out.println("La longitud : "+longitud+"\nEl area: "+area);
                
        
    }
    
    
}
