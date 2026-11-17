package ud4;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio17 {

    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Numeros del array:");
        mostrar(numeros);

        System.out.println("La suma es: " + suma(numeros));

        System.out.println("La media es: " + calcularMedia(numeros));

        System.out.println("El numero maximo es: " + obtenerMaximo(numeros));

        System.out.println("Cantidad de numeros pares: " + contarPares(numeros));
    }

    public static void mostrar(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static int suma(int[] numeros) {
        int resultado = 0;

        for (int i = 0; i < numeros.length; i++) {
            resultado = resultado + numeros[i];
        }

        return resultado;
    }

    public static double calcularMedia(int[] numeros) {
        return (double) suma(numeros) / numeros.length;
    }

    public static int obtenerMaximo(int[] numeros) {
        int maximo = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        return maximo;
    }

    public static int contarPares(int[] numeros) {
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contador++;
            }
        }

        return contador;
    }
}