
package programacion.ud2;
import java.util.Scanner;

public class Ejercicio18 {
    public static void main (String[] args) {
        //Al introducir el numero decimal tiene que ser con , y  no con .
        System.out.println ("Introduzca un número con decimales:  ");
        
        Scanner sc = new Scanner (System.in);
        double n = sc.nextDouble() ;
        
        if (n>=-0.1 && n<=0.1 && n!=0) {
            System.out.println ("El número es casi-cero");
        } else {
                System.out.println ("El número no es casi-cero");
            }
     }
}