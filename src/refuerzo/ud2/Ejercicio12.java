package refuerzo.ud2;
import java.util.Scanner;
/**
 *
 * @author coleg
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int n =sc.nextInt();
        int resto = n%=3;
        System.out.println(resto);
        
    }
}
