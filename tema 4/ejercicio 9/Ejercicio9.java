package ud4;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];

        int suspensos = 0;
        int aprobados = 0;
        int notables = 0;
        int sobresalientes = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Introduce la nota del alumno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();

            if (notas[i] < 5) {
                suspensos++;
            } else if (notas[i] < 7) {
                aprobados++;
            } else if (notas[i] < 9) {
                notables++;
            } else {
                sobresalientes++;
            }
        }

        int totalAprobados = aprobados + notables + sobresalientes;
        double porcentaje = totalAprobados * 100.0 / notas.length;

        System.out.println("\nSuspensos: " + suspensos);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Notables: " + notables);
        System.out.println("Sobresalientes: " + sobresalientes);
        System.out.printf("Porcentaje de aprobados: "+ porcentaje+" %");

        int totalCategorias = suspensos + aprobados + notables + sobresalientes;
        System.out.println("La suma de las categorías coincide con el número de alumnos: "
                + (totalCategorias == notas.length));
    }
}
