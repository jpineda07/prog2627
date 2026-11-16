package ud4;
public class Ejercicio16 {
    public static void main(String[] args) {
        int[] numeros = {3, 5, 2, 3, 7, 5, 9, 1};

        System.out.println("Elementos que aparecen una sola vez:");

        for (int i = 0; i < numeros.length; i++) {
            int contador = 0;

            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    contador++;
                }
            }

            if (contador == 1) {
                System.out.println(numeros[i]);
            }
        }
    }
}
