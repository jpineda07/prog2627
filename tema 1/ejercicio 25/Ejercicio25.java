
import java.util.Scanner;

/**
 * Programa para calcular los beneficios anuales de peras y manzanas
 *
 * @author Jose Antonio pineda
 */
public class Ejercicio25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca las ventas del primer semestre de manzanas(kg): ");
        double manzanas1 = sc.nextDouble();
        System.out.println("Introduzca las ventas del segundo semestre de manzanas(kg): ");
        double manzanas2 = sc.nextDouble();
        System.out.println("Introduzca las ventas del primer semestre de peras(kg): ");
        double peras1 = sc.nextDouble();
        System.out.println("Introduzca las ventas del segundo semestre de peras(kg): ");
        double peras2 = sc.nextDouble();

        double beneficios_manzanas = (manzanas1 + manzanas2) * 2.35;
        double beneficios_peras = (peras1 + peras2) * 1.95;
        double beneficios = beneficios_peras + beneficios_manzanas;

        System.out.println("\nEl beneficio de las manzanas en el anio completo : " + beneficios_manzanas + " euros\nEl beneficio de las peras en el anio completo : " + beneficios_peras + " euros\nbeneficio total: " + beneficios+" euros");
    }

}
