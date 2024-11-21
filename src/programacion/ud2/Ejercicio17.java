
package programacion.ud2;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca dos números:");
        
        int n1 = sc.nextInt();
        int n2 =sc.nextInt();
        
        if (n1==n2) {
            System.out.println ("Ambos números son iguales");
        } else {
            if (n1>n2) {
                System.out.println ("El número " + n1 + " es mayor que " + n2);
            } else {
                System.out.println ("El número " + n2 + " es mayor que " + n1);
            }
        }
    }
}
