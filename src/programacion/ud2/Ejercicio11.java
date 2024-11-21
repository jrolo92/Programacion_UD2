
package programacion.ud2;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main (String[] args) {
        
       Scanner sc = new Scanner (System.in);
       
       int menorOMayor;
       
       System.out.println("Introduzca dos números:");
       int n1 = sc.nextInt ();
       int n2 = sc.nextInt ();
       
       
       menorOMayor = n1<n2 ? n2 : n1;
        System.out.println("El numero mayor es: " + menorOMayor);
    }
}
