package programacion.ud2;
import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        System.out.println("Introduzca tres números: ");
        Scanner sc = new Scanner (System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println("El número mas alto es: " + maximoNumero(a,b));
        System.out.println("El número mas alto es: " + maximoNumero(a,b,c));
    }
    
        public static int maximoNumero (int a, int b){
        //Usamos un operador ternario en lugar de un if
        return a>b ? a:b;
    }
        
        public static int maximoNumero (int a, int b, int c){
        //comprobamos cual es mayor de los tres con un par de if
        if (a > b && a>c) {
            return a;
        } else if (b> a && b>c) {
            return b;
        }else {
            return c;
        }
        /*tb se podría hacer usando la funcion1 y otro op ternario: 
        int mayorxy = maximoNumero(a,b)
        return mayorxy > c ? mayorxy : c;    
        */
       
        
    }
}
