package ud4;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio20 {

    public static void main(String[] args) {

        int[][] numeros = {
            {2, 4, 6, 8},
            {1, 3, 5, 7},
            {10, 20, 30, 40}
        };

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Filas: " + numeros.length);
        System.out.println("Columnas: " + numeros[0].length);

        System.out.println("Segunda fila y tercera columna: " + numeros[1][2]);

        numeros[0][0] = 100;

        System.out.println("Matriz modificada:");

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                suma += numeros[i][j];
            }
        }

        System.out.println("Suma total: " + suma);

        for (int i = 0; i < numeros.length; i++) {
            int sumaFila = 0;

            for (int j = 0; j < numeros[i].length; j++) {
                sumaFila += numeros[i][j];
            }

            System.out.println("Suma de la fila " + (i + 1) + ": " + sumaFila);
        }
    }
}
