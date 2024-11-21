
package refuerzo.ud2;
import java.util.Scanner;
/**
 *
 * @author coleg
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 2 numeros:");
        int x= sc.nextInt();
        int z=sc.nextInt();
        String resultado = " es mayor que ";
        
        if (x<=z){
            System.out.println(z + resultado + x);
        } else {
            System.out.println(x + resultado + z);
        }
            
    }
}
