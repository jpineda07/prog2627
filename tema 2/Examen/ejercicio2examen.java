
/**Este ejercicio consiste en una radio que emite frecuencias , debemos hacer que el programa muestre todas las frecuencias desde la 100 hasta la 150 , emitiendo las frecuencias divisibles entre 5 con un continue y detenerse al encontrar la frecuencia salvadora que es la 137.
 *            
 * @author Jose Antonio Pineda David
 */
public class ejercicio2examen {
    public static void main(String[] args){
        //bucle que cuenta desde 100 a 150
        for(int i=100;i<=150;i++){
            if(i%5==0){
                continue;//salta las frecuencias divisibles entre 5
            }else if(i==137){//se para en la frecuencia de socorro que es la 137
                System.out.println("Frecuencia de socorro 137 hallada! Deteniendo el escaneo");
                break;
           }else{//cuenta todas las demas frecuencias
                System.out.println("Sintonizando frecuencia: "+i);
            }
        }
    }
    
}
