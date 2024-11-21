
package programacion.ud2;
import java.util.Scanner;

public class Ejercicio21 {
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Introduzca el número del mes: ");
        int numMes = sc.nextInt();
        
        switch (numMes) {
            case 1, 3, 5, 7, 8, 10, 12: System.out.println ("Tiene 31 días");
            break;
            case 2: System.out.print ("Tiene 28 días");                
            break;
            case 4, 6, 9, 11: System.out.println ("Abril tiene 30 días");
            break;
            default: System.out.println ("No existe ese mes");
        }
    }
}
