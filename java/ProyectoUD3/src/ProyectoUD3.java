
/** Este proyecto trata sobre una biblioteca de utilidades en ella incluiremos los métodos que pensemos puedan sernos útiles de entre los que hemos ido desarrollando.
 *
 * @author Jose Antonio Pineda David y Hugo Valderrama Barrera
 */
public class ProyectoUD3 {

    // Método que recibe tres números y devuelve su multiplicación
    public static double multiplicarTresNumeros(double n1, double n2, double n3) {
        // Multiplicamos los tres números y devolvemos el resultado 
        return (n1 * n2 * n3);
    }

    // Método que calcula el factorial de un número
    public static double factorial(double n1) {
        // Comprobamos que el número no sea negativo
        if (n1 < 0) {
            return -1;
        }
        // Inicializamos el resultado a 1
        int resultado = 1;
        // Multiplicamos todos los números desde 1 hasta n
        for (int i = 1; i <= n1; i++) {
            resultado *= i;
        }
        // Devolvemos el factorial calculado
        return resultado;
    }

    // Método que comprueba si un número es primo
    public static boolean esPrimo(int n) {
        // Los números menores que 2 no son primos
        if (n < 2) {
            return false;
        }
        // Comprobamos si el número tiene algún divisor
        for (int i = 2; i <= n / i; i++) {
            // Si el resto es 0, significa que tiene un divisor
            if (n % i == 0) {
                return false;
            }
        }
        // Si no tiene divisores, es primo
        return true;
    }

    // Método que suma dos números enteros
    public static int sumar(int a, int b) {
        // Sumamos los dos números y devolvemos el resultado
        return a + b;
    }

    // Método que devuelve el mayor de dos números
    public static int mayor(int a, int b) {
        // Comprobamos si el primer número es mayor que el segundo
        if (a > b) {
            // Si se cumple, devolvemos el primer número
            return a;
        } else {
            // Si no se cumple, devolvemos el segundo número
            return b;
        }

    }

    // Método que comprueba si un número es par o impar
    public static void comprobarPar(int n1) {
        // Comprobamos si el resto de dividir entre 2 es 0
        if (n1 % 2 == 0) {
            // Si el resto es 0, el número es par
            System.out.println("El número es par");
        } else {
            // Si el resto no es 0, el número es impar
            System.out.println("El número es impar");
        }

    }

    // Método que calcula la potencia de un número
    public static double potencia(double base, double exponente) {
        // Calculamos la potencia y devolvemos el resultado
        return (Math.pow(base, exponente));
    }
}
