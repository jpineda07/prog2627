package ud4; 
public class Ejercicio8 {
    
    public static void main(String[] args) {
        double[] precios = {10.0, 15.5, 20.0, 8.5, 12.0};
        double suma = 0;
        int mayoresDe15 = 0;

        System.out.println("Precios originales:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println(precios[i] + " euros");
            precios[i] = precios[i] * 1.05;
        }

        System.out.println("\nPrecios actualizados:");
        for (int i = 0; i < precios.length; i++) {
            System.out.printf(precios[i]+" euros");
            suma = suma + precios[i];

            if (precios[i] > 15) {
                mayoresDe15++;
            }
        }

        double media = suma / precios.length;
        System.out.printf("Precio medio:"+ media+" euros");
        System.out.println("Productos que cuestan más de 15 euros: " + mayoresDe15);
    }
}
