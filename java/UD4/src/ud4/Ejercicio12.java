package ud4;

import java.util.Scanner;


public class Ejercicio12 {
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = {12,5,8,21,4,16,9};
        System.out.println("Que numero quieres buscar?:");
        int buscado = sc.nextInt();
        for(int i= 0; i<numeros.length;i++){
            if (numeros[i]==buscado){
                buscado = i;
                break;
            }
               
        }
             System.out.println("El numero buscado esta en la posicion: "+buscado);
    }
    
}
