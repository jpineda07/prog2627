
import java.util.Scanner;

/**Este ejercicio trata de un robot que empieza con un 10% y al llegar al 100 debe detenerse , el programa pide al usuario que inyecte energia entre 1 y 30 , si la enegia es mayor o menor que estos valores pondra que el valor introduccido no es valido y al final debe mostrar los ciclos de carga necesarios.
 *
 * @author Jose Antonio Pineda David
 */
public class ejercicio3examen {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        //declaramos variables
        int bateria=10;
        int ciclosCarga=0;
        int enegiaInyectada;
        
        do{//ejecuta el codigo al menos una vez
            System.out.println("Cuantos puntos de energia desea inyectar (entre 1 y 30): ");
            enegiaInyectada = sc.nextInt();//guarda la energia inyectada por el usuario
            
            if(enegiaInyectada>30 || enegiaInyectada<1){//evita valores erroneos en la energia inyectada y no los cuenta si son introduccidos
            System.out.println("Entrada invalida");
            continue;
        }
            bateria+=enegiaInyectada;
            ciclosCarga++;//suma un ciclo de carga
            System.out.println("Bateria Actual: "+bateria+"%");//muestra la bateria actual
        }while(bateria<100);{//detiene el programa cuando la bateria llega a 100
            
        }
        System.out.println("Ciclos de carga necesarios: "+ciclosCarga);//muestra los ciclos de carga
    }
    
}
