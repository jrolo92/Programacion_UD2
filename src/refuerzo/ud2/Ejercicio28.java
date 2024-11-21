package refuerzo.ud2;
import java.util.Scanner;
/**
 *
 * @author coleg
 */
public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        int b = 50;
        System.out.println("Introduce un número");
        
        do{
            a =sc.nextInt();
            if (a==b){
                System.out.println("Has acertado");
                break;
            }else if (a<b){
                System.out.println("Menor");
            }else {
                System.out.println("Mayor");
            }
        } while (a!=-1);
    }
    
}
