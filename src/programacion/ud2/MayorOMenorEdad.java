
package programacion.ud2;

import java.util.Scanner;

public class MayorOMenorEdad {
    public static void main (String[] args) {
        
        int edad;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Introduzca su edad");
        edad = sc.nextInt ();
        //las vv booleanas tienen por defecto el valor False y su nombre suele empezar por es.
        boolean esMayorDeEdad = edad>=18;
        System.out.println (esMayorDeEdad);
        
    }
}
