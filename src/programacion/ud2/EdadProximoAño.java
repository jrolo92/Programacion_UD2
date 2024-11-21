
package programacion.ud2;
import java.util.Scanner;

public class EdadProximoAño {
    
    public static void main (String[] args) {
        System.out.println("Introduzca su edad");
        int entrada;
        Scanner sc = new Scanner (System.in);
        entrada = sc.nextInt();
        /*Tb se podría poner ++entrada o entrada++ directamente y luego en el print concatenar entrada en vez de edad
        */ 
        int edad = entrada + 1;
        /* o tb se podría poner un ++edad en el print o (edad+1)
        System.out.println("El año que viene tendrás " + ++edad + " años.");
        System.out.println("El año que viene tendrás " + (edad+1) + " años.");
        */
        System.out.println("El año que viene tendrás " + edad + " años.");
    }
   
        
}
