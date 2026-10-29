

/**
 *
 * @author 09_1DAW
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        /*1. se repite la declaracion de variables base altura y area por lo que
         se podria ahorra añadiendo una funcion*/
        // Cálculo 1: Salón
        int base1 = 5;
        int altura1 = 4;
        int area1 = calcularAreaRectangulo(base1,altura1);
        System.out.println("--- Salón ---");
        System.out.println("Base: " + base1);
        System.out.println("Altura: " + altura1);
        System.out.println("El área es: " + area1 + " m²");

        // Cálculo 2: Cocina
        int base2 = 3;
        int altura2 = 3;
        int area2 = calcularAreaRectangulo(base2,altura2);
        System.out.println("--- Cocina ---");
        System.out.println("Base: " + base2);
        System.out.println("Altura: " + altura2);
        System.out.println("El área es: " + area2 + " m²");

        // Cálculo 3: Jardín
        int base3 = 10;
        int altura3 = 6;
        int area3 = calcularAreaRectangulo(base3,altura3);
        System.out.println("--- Jardín ---");
        System.out.println("Base: " + base3);
        System.out.println("Altura: " + altura3);
        System.out.println("El área es: " + area3 + " m²");
    }
    public static int calcularAreaRectangulo(int base,int altura){
        return(base * altura);
    }
}
