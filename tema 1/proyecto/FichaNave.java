import java.util.Scanner;
/** Programa para calcular la ficha tecnica de una mision espacial en la que se calcula los gastos de combustible y la cantidad de años luz recorrida.
 *
 * @author Jose Amtonio Pineda David y Daniel Jimenez Carrasco
 */
public class FichaNave {
    public static void main(String[] args){
        
        //Pedimos que el usuario introduzca manualmente los datos de la ficha del piloto
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca el nombre del piloto: ");
        String nombrePiloto = sc.next();
        System.out.println("Introduzca el rango del piloto: ");
        char rangoPiloto = sc.next().charAt(0);
        System.out.println("Introduzca el nivel de experiencia del piloto: ");
        int nivelExperiencia = sc.nextInt();
        System.out.println("Introduce el combustible actual: ");
        double combustibleActual = sc.nextDouble();
        System.out.println("Sistemas listos?: ");
        boolean sistemas = sc.nextBoolean();
        
        //Fijamos las constantes
        
        final double CAPACIDAD_MAXIMA_LITROS = 2000.0;
        final double CONSUMO_POR_AÑO_LUZ = 180.5;
        
        //Hacemos los calculos
        
        nivelExperiencia ++;    
        double añosLuz = combustibleActual * CONSUMO_POR_AÑO_LUZ;
        double porcentaje = (combustibleActual/CAPACIDAD_MAXIMA_LITROS)*100;
        
        //Reto extra
        
        double combustibleSobrante = combustibleActual % CONSUMO_POR_AÑO_LUZ;
        
        //Hacemos el casting a numeros enteros
        
        int combustibleActualEntero = (int) combustibleActual;
        int añosLuzEntero = (int) añosLuz;
        int porcentajeEntero = (int) porcentaje;
        int combustibleSobranteEntero = (int) combustibleSobrante;
        
        //Imprimimos la informacion en pantalla
        
        System.out.println("================================================================================\nPROYECTO GRUPAL UD1: SIMULADOR DE ASTRONAVE \"ASTRA-9\"\n================================================================================");
        System.out.println("Nombre del piloto: "+ nombrePiloto);
        System.out.println("Rango del piloto: "+ rangoPiloto);
        System.out.println("Experiencia del piloto: "+ nivelExperiencia+"(mas un nivel adquirido)");
        System.out.println("Combustible actual: "+ combustibleActual+" Litros");
        System.out.println("Sistemas Listos?: "+ sistemas);
        System.out.println("================================================================================");
        System.out.println("Capacidad maxima de combustible: "+ CAPACIDAD_MAXIMA_LITROS+" Litros");
        System.out.println("Consumo de combustible por año luz: "+ CONSUMO_POR_AÑO_LUZ+" Litros");
        System.out.println("Combustible sobrante: "+ combustibleSobrante+" Litros");
        System.out.println("================================================================================\nFICHA OFICIAL\n================================================================================");
        System.out.println("Combustible actual: " +combustibleActualEntero +" Litros");
        System.out.println("Años luz: " +añosLuzEntero );
        System.out.println("Porcentaje de combustible: " +porcentajeEntero +"%" );
        System.out.println("Combustible sobrante: " +combustibleSobranteEntero+" Litros" );
        

    }
}
