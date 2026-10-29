
import java.util.Scanner;


/**
 *
 * @author 09_1DAW
 */
public class Ejercicio3 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el precio del producto: ");
        double producto = sc.nextDouble();
        System.out.println("El producto vale: "+producto);
        double descuento=descuento(producto);
        System.out.println("El descuento seria de: "+descuento);
        producto = descuentoFijo(producto);
        System.out.println("Por tanto el precio seria de: "+producto);
        producto = IVA(producto);
        System.out.println("Con el IVA aplicado: "+producto);
    }
    public static double descuentoFijo(double precio){
        return (precio - (precio* 0.2));
    }
    public static double descuento(double precio){
        return (precio* 0.2);
    }
    public static double IVA(double precio){
        return (precio + (precio* 0.21));
    }
}
