
package examenud4;

import java.util.Scanner;

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temperaturas =[11] ;
        int[] dias = {1,2,3,4};
        String[] localidades = {"Valencia", "Madrid" , "Barcelona"};
        
        System.out.println("Introduzca las temperaturas del dia 1 en Valencia: ");
        temperaturas[0] = sc.nextDouble();
        System.out.println("Introduzca las temperaturas del dia 2 en Valencia: ");
        temperaturas[1] = sc.nextDouble();
        System.out.println("Introduzca las temperaturas del dia 3 en Valencia: ");
        temperaturas[2] = sc.nextDouble();
        System.out.println("Introduzca las temperaturas del dia 4 en Valencia: ");
        temperaturas[3] = sc.nextDouble();
        System.out.println("Introduzca las temperaturas del dia 1 en Madrid: ");
        temperaturas[4] = sc.nextDouble();
        System.out.println("Introduzca las temperaturas del dia 2 en Madrid: ");
        temperaturas[5] = sc.nextDouble();
        System.out.println("Introduzca las temperaturas del dia 3 en Madrid: ");
        temperaturas[6] = sc.nextDouble();
        System.out.println("Introduzca las temperaturas del dia 4 en Madrid: ");
        temperaturas[7] = sc.nextDouble();
        System.out.println("Introduzca las temperaturas del dia 1 en Barcelona: ");
        temperaturas[8] = sc.nextDouble();
        System.out.println("Introduzca las temperaturas del dia 2 en Barcelona: ");
        temperaturas[9] = sc.nextDouble();
        System.out.println("Introduzca las temperaturas del dia 3 en Barcelona: ");
        temperaturas[10] = sc.nextDouble();
        System.out.println("Introduzca las temperaturas del dia 4 en Barcelona: ");
        temperaturas[11] = sc.nextDouble();
        
        
        for(int i=0;i<localidades.length;i++){
            for(int j=0;j<dias.length;j++){
                for(int k=0; k<temperaturas.length;k++)
                System.out.println(localidades[j]+dias[i]+temperaturas[k]);
            }
        }
    }
}
