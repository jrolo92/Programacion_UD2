
package programacion.ud2;
import java.util.Scanner;

public class CalcularEdad {
    public static void main (String[] args) {
        
        System.out.println("Introduzca el año actual y su fecha de nacimiento");
        /*
        Lo suyo es primero definir vv y luego decirle que me las lea que se haria:
        int annoActual;
        int fechaNac;
        Invocamos el escaner:
        Scanner sc = new Scanner (System.in);
        Y le digo que me lea las variables:
        annoActual= sc.nextInt ();
        fechaNacimiento = sc.nextInt ();
        */
        Scanner sc = new Scanner (System.in);
        int annoActual = sc.nextInt ();
        int fechaNacimiento  = sc.nextInt ();
        /*
        Y aqui igual podriamos haber definido primero la vv edad como entero
        y luego solo declararla:
        edad = annoActual - fechaNacimiento
        */
        int edad = annoActual - fechaNacimiento;
        /*
        Tb podríamos decirle el valor de edad directamente en el print:
        System.out.println ("Su edad es " + (annoActual - fechaNAcimiento))
        */
        System.out.println ("Su edad es " + edad);
                
    }
}
