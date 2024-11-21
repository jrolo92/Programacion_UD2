
package programacion.ud2;
import java.util.Scanner;


public class Ejercicio20 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        

        
        /* Primero vamos a hacer el según como sentencia
        en cada case se pone el valor que se le da a la vv n.
        Después de cada case se pone un break para que cuando se cumpla ese 
        caso se acabe el switch 
        
        System.out.println ("Introduzca su nota de 0 a 10: ");
        int n = sc.nextInt();
        
        switch (n){
            case 0, 1, 2, 3, 4:
            System.out.println ("Insuficiente");
            break;
            case 5:
            System.out.println ("Suficiente");
            break;
            case 6:
            System.out.println ("Bien");
            break;
            case 7, 8:
            System.out.println ("Notable");
            break;
            case 9, 10:
            System.out.println ("Sobresaliente");
            break;
            default:
            System.out.println ("Su nota no es valida");
        }
        */
        
        /*Ahora lo vamos a hacer como una expresión en la que le damos valor a n
        La principal diferencia es que se usa -> en lugar de : y que al final 
        tras cerrar la llave hay que poner un ; y se imprime después.
        */
        
        int notaNum = 9;
        String n = switch (notaNum) {
            case 0, 1, 2, 3, 4 -> "Insuficiente"; 
            case 5-> "Suficiente";
            case 6 -> "Bien"; 
            case 7, 8 -> "Notable";
            case 9,10 -> "Sobresaliente";
            default -> "Error";
                
        };
        System.out.println ("Su nota es:" + n);
    }
    
}
