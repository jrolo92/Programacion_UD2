
package programacion.ud2;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main (String[] args){
        System.out.println ("Introduzca un número decimal:");
        
        Scanner sc= new Scanner (System.in);
        double n = sc.nextDouble ();
        
        double redondeado = Math.round (n);
        
        System.out.println ("El número redondeado es : " + redondeado);
    }
}
