import java.util.Scanner;

public class Ejercicio17_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero de segundos: ");
        int segundos = sc.nextInt();
        
        int horas = segundos / 3600 ;
        int minutos = (segundos % 3600)/60;
        segundos = segundos%60;
        
        System.out.println("Horas: "+horas+"\nMinutos: "+minutos+"\nsegundos: "+segundos);
        
                
    }
    
}
