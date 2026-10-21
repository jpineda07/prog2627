
/**
 *
 * @author 09_1DAW
 */
public class Ejercicio18 {
    public static void main(String[] args){
        double[] precios = {10.5, -5.0, 20.0, -1.2, 5.5};
        double total=0;
        for (int i = 0; i < precios.length; i++) {
            if( precios[i] <= 0 ){
                continue;
            }   
                total = total + precios[i];
            
        }
        System.out.println("El total de los precios positivos es: " + total);
    }
}
