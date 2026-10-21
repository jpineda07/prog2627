import java.util.Scanner;

/**
 * @author 09_1DAW
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0;
        int parar;

        do {
            n1 += 10;
            System.out.println("suma: " + n1);
            System.out.println("Tecla 1 para continuar . Tecla 0 para parar: ");
            parar = sc.nextInt();

            if (parar == 0) {
                System.out.println("Terminando programa");
            } else {
                System.out.println("Continuando suma");
            }
            
        }while (parar !=0);

    }
}