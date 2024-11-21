
package refuerzo.ud2;

import java.util.Scanner;

/**
 *
 * @author coleg
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca ºC y los convierto a ºF");
        int  celsius = sc.nextInt();
        
        int farenheit = (celsius*9/5) +32;
        
        System.out.println("Los ºF correspondientes son: "+ farenheit);
    }
}
