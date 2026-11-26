package examenud4;

import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduce el nombre y la edad del primer participante: ");
        String nombre1 = sc.nextLine();
        int edad1 = sc.nextInt();
        System.out.println("Introduce el nombre y la edad del segundo participante: ");
        String nombre2 = sc2.nextLine();
        int edad2 = sc2.nextInt();

        nombreEdad(nombre1,edad1);
        nombreEdad(nombre2,edad2);
    }
    public static void nombreEdad(String nombre,int edad){
        if(edad >= 18){
            System.out.println(nombre+" es mayor de edad.");
        }
    }

}
