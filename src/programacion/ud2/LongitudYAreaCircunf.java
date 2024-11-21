
package programacion.ud2;

import java.util.Scanner;


public class LongitudYAreaCircunf {
    public static void main (String[] args){
        double radio;
        //La siguiente línea es una constante, lo cuál se especifica con FINAL y con el nombre en MAYUSCULA
        final double PI = 3.141592;
        double longitud;
        double area;
        
        /* Se podría invocar a pi con Math.PI sin necesidad de invocar ningun 
        paquete ya que esta en java.lang poniendo directamente Math.PI en la 
        fórmula del área y longitud */
        System.out.println ("Introduzca el radio de la circunferencia:");
        Scanner sc = new Scanner (System.in);
        radio = sc.nextDouble();
        
        /*Tambien se puede invocar la funcion de potencia con Math.pow (radio,2)
        elevando el radio a 2 */
        longitud = 2 * PI * radio;
        area = PI * (radio * radio);
        
        System.out.println("La longitud de la circunferencia es: " + longitud );
        System.out.println("El área de la circunferencia es: " + area );
        
    }
}
