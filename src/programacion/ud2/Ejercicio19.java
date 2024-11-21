
package programacion.ud2;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main (String[] args) {
        
        System.out.println ("Introduzca tres números:");
        
        Scanner sc =new Scanner (System.in);
        
        int a = sc.nextInt ();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (a>b && b>c){
            System.out.print ("El orden de mayor a menor de los número es: " + 
                    a + " , " + b + " , " + c );
    //El if anidado se suele escribir así:
        } else if (a>c && c>b) {
                System.out.print ("El orden de mayor a menor de los número es: " + 
                   a + " , " + c + " , " + b);
            } else if (b>a && a>c) {
                System.out.print ("El orden de mayor a menor de los número es: " + 
                    b + " , " + a + " , " + c);
            } else if (b>c && c>a) {
                System.out.print ("El orden de mayor a menor de los número es: " + 
                    b + " , " + c + " , " + a);
            } else if (c>a && a>b) {
                System.out.print ("El orden de mayor a menor de los número es: " + 
                    c + " , " + a + " , " + b);
            } else {
                System.out.print ("El orden de mayor a menor de los número es: " + 
                    c + " , " + b + " , " + a);
            }  
        }
}
