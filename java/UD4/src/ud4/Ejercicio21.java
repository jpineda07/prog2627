package ud4;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio21 {

    public static double calcularMediaAlumno(double[][] notas, int alumno) {
        double suma = 0;

        for (int i = 0; i < notas[alumno].length; i++) {
            suma += notas[alumno][i];
        }

        return suma / notas[alumno].length;
    }

    public static void main(String[] args) {

        double[][] notas = {
            {7.0, 8.0, 6.0},
            {4.0, 5.0, 6.0},
            {9.0, 8.5, 10.0},
            {5.0, 6.0, 7.0}
        };

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Alumno " + (i + 1) + ", Evaluacion " + (j + 1) + ": " + notas[i][j]);
            }
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Media del alumno " + (i + 1) + ": " + calcularMediaAlumno(notas, i));
        }

        for (int j = 0; j < notas[0].length; j++) {
            double suma = 0;

            for (int i = 0; i < notas.length; i++) {
                suma += notas[i][j];
            }

            System.out.println("Media de la evaluacion " + (j + 1) + ": " + suma / notas.length);
        }

        double maxima = notas[0][0];

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] > maxima) {
                    maxima = notas[i][j];
                }
            }
        }

        System.out.println("Nota mas alta: " + maxima);
    }
}
