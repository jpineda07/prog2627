package ud4;
public class Ejercicio11 {
    public static void main(String[] args) {
        int[] numeros = {2, 5, 3, 2, 8, 5, 9};

        System.out.print("Valores que aparecen una sola vez: ");

        for (int i = 0; i < numeros.length; i++) {
            int contador = 0;

            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    contador++;
                }
            }

            if (contador == 1) {
                System.out.print(numeros[i] + " ");
            }
        }
        System.out.println();
    }
}
