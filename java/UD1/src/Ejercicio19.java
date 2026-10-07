
public class Ejercicio19 {

    static void main(String[] args) {

        int a = 32767;

        System.out.println("El valor es :" + a);

        a = (short) (a + 1);

        System.out.println("El valor siguiente es: " + a);

        boolean minimo = (a == -32768);

        System.out.println("Pasa al valor minimo?: " + minimo);

    }

}
