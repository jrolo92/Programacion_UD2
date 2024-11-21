
package programacion.ud2;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main (String[] args){
        
        System.out.println("Introduzca las notas del 1, 2 y 3 trimestre: ");
        Scanner sc = new Scanner (System.in);
        int primerTri = sc.nextInt();
        int segundoTri = sc.nextInt();
        int tercerTri = sc.nextInt();
        
        /*Cuidado con la siguiente linea: Si ponemos solo un 3 el resultado te lo trunca y lo convierte a entero.
        Si le ponemos un 3f (float) o un 3.0 debería salir el resultado con decimales
        */
        double media = (primerTri + segundoTri + tercerTri)/3f;
        
        //Ahora vamos a convertir el decimal a entero con un casting
        int mediaEnt = (int)media;
        
        System.out.println("Su nota media es: " + mediaEnt);
        System.out.println("Su nota media con decimales es: " + media);
        
    }
}
