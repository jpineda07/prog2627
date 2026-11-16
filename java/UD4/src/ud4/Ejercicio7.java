
package ud4;
import java.util.Scanner;
/**
 *
 * @author 09_1DAW
 */
    
public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Crear un array para guardar las temperaturas
        double[] temperaturas = new double[7];

        // Pedir las temperaturas de los 7 días
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Introduce la temperatura del día " + (i + 1) + ": ");
            temperaturas[i] = sc.nextDouble();
        }

        // Mostrar todas las temperaturas
        System.out.println("\n--- TEMPERATURAS REGISTRADAS ---");

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Día " + (i + 1) + ": " + temperaturas[i] + " grados");
        }

        // Inicializar variables
        double suma = 0;
        double maxima = temperaturas[0];
        double minima = temperaturas[0];
        int contador = 0;

        // Calcular estadísticas
        for (int i = 0; i < temperaturas.length; i++) {

            suma = suma + temperaturas[i];

            if (temperaturas[i] > maxima) {
                maxima = temperaturas[i];
            }

            if (temperaturas[i] < minima) {
                minima = temperaturas[i];
            }

            if (temperaturas[i] > 25) {
                contador++;
            }
        }

        // Calcular la media
        double media = suma / temperaturas.length;

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Temperatura media: " + media + " grados");
        System.out.println("Temperatura máxima: " + maxima + " grados");
        System.out.println("Temperatura mínima: " + minima + " grados");
        System.out.println("Días con más de 25 grados: " + contador);

    }
}

    

