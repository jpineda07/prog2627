
import java.util.Scanner;

/** Este ejercicio consiste en una nave que se aproxima a una central espacial , el programa debe identificar que tipo de nave es a traves de un numero introducido por el usuario usando un switch
 * y en caso de que sea la opcion 2 añadir un if/else en el que se pidala carga de la nave y el programa determine si necesita una inspeccion o puede pasar.
 *
 * @author Jose Antonio Pineda David
 */
public class ejercicio1examen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //mostramos el menu del programa
        System.out.println("1.Nave Alidada\n2.Nave Comercial\n3.Nave Desconocida\n4.Nave Hostil\nIntroduzca el tipo de nave que viene: ");
                //declaramos las variables necesarias
        int nave = sc.nextInt();
        int carga;
        
        switch (nave) {
            case 1:
                System.out.println("Acceso concedido: Sector Central");
                break;
            case 2://para este caso añadimos el if/else para determinar el peso de la carga y ver si puede pasar o necesita inspeccion
                System.out.println("Acceso concedido: Hangar de Carga\nIntroduce el tonelaje de carga: ");
                carga = sc.nextInt();
                if (carga > 500) {
                    System.out.println("Requiere inspeccion aduanera");
                } else {
                    System.out.println("Peso permitido , puedes pasar");
                }
                break;
            case 3:
                System.out.println("Acceso restringido: Enviar escolta");
                break;
            case 4:
                System.out.println("ALERTA! Iniciar protocolos de defensa");
                break;
            default://en caso de que el valor introducido no este en el menu mostramos codigo no valido
                System.out.println("Codigo no valido");
                break;
        }
    }

}
