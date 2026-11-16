package ud4;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {2, 5, 2, 8, 2, 9, 5};

        System.out.print("Introduce el número que quieres contar: ");
        int buscado = sc.nextInt();

        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                contador++;
            }
        }

        System.out.println("El numero " + buscado + " aparece " + contador + " veces.");

        int[] valores = {2, 5, 8, 9};
        System.out.println("\nAmpliación:");
        for (int i = 0; i < valores.length; i++) {
            int apariciones = 0;

            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] == valores[i]) {
                    apariciones++;
                }
            }

            System.out.println("El numero " + valores[i] + " aparece " + apariciones + " veces.");
        }

    }
}
