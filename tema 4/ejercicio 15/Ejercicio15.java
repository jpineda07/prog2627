package ud4;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notas = {4, 7, 3, 8, 5, 2, 9, 6, 4, 7};

        int aprobados = 0;
        int suspensos = 0;
        boolean hayDiez = false;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }

            if (notas[i] == 10) {
                hayDiez = true;
            }
        }

        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos suspensos: " + suspensos);
        System.out.println("¿Hay algun alumno con un 10?: " + (hayDiez ? "Sí" : "No"));

        System.out.print("Introduce una nota para contar sus apariciones: ");
        int buscada = sc.nextInt();

        int apariciones = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == buscada) {
                apariciones++;
            }
        }
        System.out.println("La nota " + buscada + " aparece " + apariciones + " veces.");

        int notaMasAlta = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > notaMasAlta) {
                notaMasAlta = notas[i];
            }
        }

        int primeraPosicion = -1;
        int ultimaPosicion = -1;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == notaMasAlta) {
                if (primeraPosicion == -1) {
                    primeraPosicion = i;
                }
                ultimaPosicion = i;
            }
        }

        System.out.println("Nota mas alta: " + notaMasAlta);
        System.out.println("Primera posicion de la nota mas alta: " + primeraPosicion);
        System.out.println("Ultima posicion de la nota más alta: " + ultimaPosicion);

    }
}
