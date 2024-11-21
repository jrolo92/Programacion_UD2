
package programacion.ud2;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner (System.in);
                
        System.out.println("Introduzca un número");
        
        int n = sc.nextInt ();
        
        /*Para invocar el v absoluto hay que poner el Math.abs
        Se podría tb crear una variable para el Valor Absoluto y darle el valor de Maths.abs:
        int valorAbsoluto = Maths.abs (n) y luego en el pritn solo poner el nombre de la variable (valorAbsoluto)
        */
       System.out.println ("El valor absoluto de n es: " + Math.abs(n));
        
       //calculo manual usando operador ternario
       
       //valorAbsoluto= n > 0 ? n : (-1) * n
        
    }
}
