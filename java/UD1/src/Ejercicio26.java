import java.util.Scanner;
/**
 *
 * @author Jose antono pineda david
 */
public class Ejercicio26 {
    public static void main(String[] args){
        boolean e1 = 10 + 5 * 2 > 20 && 4 == 4; // la mayor preferencia la tiene la multiplicacion , luego la suma , despues el mayor que , despues la comparacion y por ultimo el &&
        boolean e2 = !(7 + 3 > 10) || 3 * 2 <=6;//la mayor preferencia la tienen las operaciones de dentro del parentesis , luego la multiplicacion , luego el mauor igual , luego la exclamacion y por ultimo el ||
        boolean e3 = 10/2 +3 *5 == 19 && true; //la mayor preferencia la tiene la multiplicacion y la diivision , luego la suma y despues la comparacion y por ultimo el &&
        int x = 5;
        int e4 = x += 3*2;// la mayor preferncia la tiene la multiplicacion y despues el +=
        boolean b = false;
        boolean e5 = b= !b || 7%2 == 1 ;//la mayor preferencia la tiene el modulo , luego la comparacion , luuego el ! y luego el ||
        
        
       System.out.println("expresion 1:(10 + 5 * 2 > 20 && 4 == 4) "+e1+"\nexpresion 2:(!(7 + 3 > 10) || 3 * 2 <=6) "+e2+"\nexpresion 3 :(10/2 +3 *5 == 19 && true) "+e3+"\nexpresion 4: (int x = 5); (x+= 3*2) "+e4+"\nexpresion 5: (boolean b =false ; b= !b || 7%2 == 1) "+e5);
    }
    
}
 