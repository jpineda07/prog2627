package ud4;
public class Ejercicio10 {
    public static void main(String[] args) {
        int[] numeros = {3, 8, 5, 2, 9};
        int[] invertido = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            invertido[i] = numeros[numeros.length - 1 - i];
        }

        System.out.print("Original: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.print("\nInvertido: ");
        for (int i = 0; i < invertido.length; i++) {
            System.out.print(invertido[i] + " ");
        }
        System.out.println();
    }
}
