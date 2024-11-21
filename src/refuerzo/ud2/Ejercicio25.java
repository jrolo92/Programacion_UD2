package refuerzo.ud2;
import java.util.Scanner;
/**
 *
 * @author coleg
 */
public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if (x!=y || x==0 || y==0){
            System.out.println("True");
        } else 
            System.out.println("False");
    }
}
