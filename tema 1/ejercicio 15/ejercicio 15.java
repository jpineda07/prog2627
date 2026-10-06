
public class GestionInventario {
    public static void main(String[] args) {
        
        int pociones = 0;
        double precio_pociones = 10;
        boolean mochila = false;
        double oro = 100 - (precio_pociones * pociones);
        
        System.out.println("Se va a realizar la compra de 3 pociones, el precio sera de 10 de oro por unidad , le queda un total de "+ oro + " oro , Mochila llena: "+mochila);
    
        
        pociones = 3;
        mochila = pociones >= 3;
        oro = 100 - (precio_pociones * pociones);
       
        System.out.println("Se ha realizado la compra de " + pociones + " pociones, el precio ha sido de "+ pociones * precio_pociones + " de oro , le queda un total de "+ oro + " oro , Mochila llena: "+mochila);
    }
    
}
