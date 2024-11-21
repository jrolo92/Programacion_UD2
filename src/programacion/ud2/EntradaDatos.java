
package programacion.ud2;

import java.util.Scanner;

public class EntradaDatos {
    public static void main (String[] args) {
        
        //Esto es para escribir en pantalla
        System.out.println("Introduzca un número");
        //Esto es para leer del usuario
        Scanner sc = new Scanner(System.in);
        //Definimos la variable num como entero
        int num = sc.nextInt();
        System.out.println ("El número es: " + num);
    }
}
