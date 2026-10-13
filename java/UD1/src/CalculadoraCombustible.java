
/**Este programa consiste en una calculadora de combustible para una mision espacial llamada "ARTEMIS-X" , la funcion del programa es calcular los litros de combustible y costes de los mismos que va a necesitar la mision para completarse con exito , y al final mostrar una un informe con todo lo necesario.
 *
 * @author Jose Antonio Pineda David
 */
public class CalculadoraCombustible {
    public static void main(String[] args){
        
        //Declaramos las constantes del consumo por km y de la reserva de seguridad 
        
        final double CONSUMO_POR_KM = 14.75;
        final int RESERVA_SEGURIDAD = 500;
        
        //Declaramos e inicializamos las variables de la distancia y del precio por litro de combustible
        
        int distanciaKm = 4800;
        double precioLitro = 2.35;
        
        //Realizamos las operaciones necesarias para conseguir los litros exactos necesarios y el coste total necesario
        
        double litrosOficialesExactos = (distanciaKm * CONSUMO_POR_KM)+RESERVA_SEGURIDAD;
        double costeTotalExacto = (litrosOficialesExactos * precioLitro);
        
        //Hacemos la conversion a tipo entero de los litros y coste necesario
        
        int litrosOficialesComprar = (int) litrosOficialesExactos;
        int costePresupuestado = (int) costeTotalExacto;
        
        //Mostramos el informe por pantalla 
        System.out.println("\n================================================================================\nSISTEMA DE CALCULO DE COMBUSTIBLE \"MISION ARTEMIS-X\"\n================================================================================\nConsumo por kilometro :"+CONSUMO_POR_KM+" Litros\nCombustible de reserva: "+RESERVA_SEGURIDAD+" Litros\nDistancia por recorrer: "+distanciaKm+" Kilometros\nPrecio del combustible: "+precioLitro+" euro/litro\n"+"Combustible exacto necesario: "+litrosOficialesExactos+" Litros\nCoste total exacto: "+costeTotalExacto+" Euros\nCantidad de combustible necesaria para comprar: "+litrosOficialesComprar+" Litros\nPresupuesto entero para el departamento de contabilidad: "+costePresupuestado+" Euros\n");
        
        
    }
}
