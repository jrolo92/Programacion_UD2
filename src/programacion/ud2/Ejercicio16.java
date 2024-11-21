
package programacion.ud2;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main (String [] args){
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Introduzca un número entero:");
        int n = sc.nextInt();
        
        if (n%2==0){
            System.out.println ("El número es par");
        }
        
        if (n%2!=0){
            System.out.println ("El número es impar");
        }
    }
}
