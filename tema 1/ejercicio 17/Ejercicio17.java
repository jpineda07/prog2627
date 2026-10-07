
import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        System.out.println("Parte 1");
        double armadura = 120;
        double descuento = 0.15;
        double precio_final = armadura - (armadura * descuento);
        System.out.println("El precio de la armadura es de " + armadura + " creditos , con el descuento tendria un precio final de " + precio_final + " creditos");

        System.out.println("Parte 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero de segundos: ");
        int segundos = sc.nextInt();

        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        segundos = segundos % 60;

        System.out.println("Horas: " + horas + "\nMinutos: " + minutos + "\nsegundos: " + segundos);

    }

}
