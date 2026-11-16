package ud4;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio6 {

    public static void main(String[] args) {

        // Crear el array
        int[] numeros = {12, 5, 8, 20, 3, 15};

        // 1. Mostrar los números utilizando un for
        System.out.println("Recorrido con for:");   

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // 2. Mostrar los números utilizando un for-each
        System.out.println("\nRecorrido con for-each:");

        for (int numero : numeros) {
            System.out.println(numero);
        }

        // 3. Mostrar únicamente los números mayores que 10
        System.out.println("\nNumeros mayores que 10:");

        for (int numero : numeros) {
            if (numero > 10) {
                System.out.println(numero);
            }
        }
    }

}
