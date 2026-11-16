package ud4;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {12, 5, 8, 21, 4, 16, 9};

        System.out.print("Introduce el numero que quieres buscar: ");
        int buscado = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                System.out.println("El numero se encuentra en la posición " + i + ".");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("El numero no existe en el array.");
        }

    }
}
