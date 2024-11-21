
package programacion.ud2;

import java.util.Scanner;

public class media2Numeros {
    public static void main (String[] args) {
        int a;
        int b;
        System.out.println ("Introduzca dos notas para calcular su media aritmética");
        
        
        Scanner sc = new Scanner (System.in);
        a = sc.nextInt ();
        b = sc.nextInt ();
     
        //Hay que decirle que el 2 es tambien float con f o poniendo 2.0
       float media = (a+b)/2f;
       
       
        System.out.println ("La nota media es " + media);
        
    }
}
