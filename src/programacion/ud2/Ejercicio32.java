package programacion.ud2;
import java.util.Scanner;

public class Ejercicio32 {
    public static void main (String[]args){
        Scanner sc =new Scanner (System.in);
        
        System.out.println("Introduzca dos números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("El número mas alto es: " + maximoNumero(a,b));
    }
    
    public static int maximoNumero (int a, int b){
        //Usamos un operador ternario en lugar de un if
        return a>b? a:b;
    }
}
