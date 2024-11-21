package programacion.ud2;
import java.util.Scanner;

public class Ejercicio26 {
    public static void main (String[]args){
        System.out.println("Introduzca un número:");
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt( );
        
        /*
        Dentro del for estamos creando una vv (con función de contador) a la que le damos un valor de 1 (tb le podríamos dar un valor de cero)
        Luego le pedimos que hasta que esa variable tenga le mismo valor que 
        la vv que le pedimos al usuario se muestre echo sumandole 1 en cada paso a la vv a.
        */
        for (int a=1; a <= num; a++){
            System.out.println("Echo");
        }
    }
    
}
