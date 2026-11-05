
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        // Introducir las notas
        double nota1 = leerNota();

        double nota2 = leerNota();

        double nota3 = leerNota();

        // Calcular la media
        double media = calcularMedia(nota1, nota2, nota3);

        // Obtener la nota máxima
        double maxima = obtenerNotaMaxima(nota1, nota2, nota3);

        // Comprobar si está aprobado
        boolean aprobado = estaAprobado(media);

        // Mostrar resultados
        mostrarResultados(maxima, media, aprobado);

    }

    public static double leerNota() {
        System.out.println("Introduce la nota: ");
        Scanner sc = new Scanner(System.in);
        return (sc.nextDouble());
    }

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return ((nota1 + nota2 + nota3) / 3);
    }

    public static double obtenerNotaMaxima(double nota1, double nota2, double nota3) {
        if (nota1 > nota2 && nota1 > nota3) {
            return (nota1);
        } else if (nota2 > nota1 && nota2 > nota3) {
            return (nota2);
        } else {
            return (nota3);
        }

    }

    public static boolean estaAprobado(double media) {
        if (media >= 5) {
            return (true);
        } else {
            return (false);
        }
    }

    public static void mostrarResultados(double maxima, double media, boolean aprobado) {
        System.out.println("\n--- INFORME ACADEMICO ---\nMedia: " + media + "\nNota maxima: " + maxima + "\nAprobado?: " + aprobado);

    }
}
