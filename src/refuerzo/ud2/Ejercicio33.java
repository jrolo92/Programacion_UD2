package refuerzo.ud2;
import java.util.Scanner;
/**
 *
 * @author coleg
 */
public class Ejercicio33 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero entre 1 y 10");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int result;
        
        if (n>=0 && n<=10){
            for (int i=1;i<=10;i++){
                result = n*i;
                System.out.println(n+ "x" + i + "=" +result);
            }
        } else {
            System.out.println("Error");
        }
        
    }
}
