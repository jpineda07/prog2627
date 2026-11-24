package ud4;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio19 {

    public static void mostrarNotas(double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }

    public static double calcularMedia(double[] notas) {
        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }

        return suma / notas.length;
    }

    public static int contarAprobados(double[] notas) {
        int contador = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                contador++;
            }
        }

        return contador;
    }

    public static double notaMaxima(double[] notas) {
        double max = notas[0];

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > max) {
                max = notas[i];
            }
        }

        return max;
    }

    public static boolean buscarNota(double[] notas, double buscada) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == buscada) {
                return true;
            }
        }

        return false;
    }

    public static double[] notasAprobadas(double[] notas) {
        int contador = contarAprobados(notas);
        double[] aprobadas = new double[contador];
        int posicion = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprobadas[posicion] = notas[i];
                posicion++;
            }
        }

        return aprobadas;
    }

    public static void main(String[] args) {
        double[] notas = {4.5, 7.0, 8.5, 3.0, 6.5, 9.0};

        mostrarNotas(notas);

        System.out.println("Media: " + calcularMedia(notas));
        System.out.println("Aprobados: " + contarAprobados(notas));
        System.out.println("Nota maxima: " + notaMaxima(notas));
        System.out.println("¿Existe el 7.0?: " + buscarNota(notas, 7.0));

        double[] aprobadas = notasAprobadas(notas);

        System.out.println("Notas aprobadas:");
        mostrarNotas(aprobadas);
    }
}
