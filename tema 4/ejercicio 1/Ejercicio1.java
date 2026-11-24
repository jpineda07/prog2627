package ud4;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        for (int i = 0; i <= numeros.length - 1; i++) {
            System.out.println("Numero " + (i + 1) + " - " + numeros[i]);
        }
        numeros[2] = 10;

        for (int i = 0; i <= numeros.length - 1; i++) {
            System.out.println("Numero " + (i + 1) + " - " + numeros[i]);
        }
    }

}
