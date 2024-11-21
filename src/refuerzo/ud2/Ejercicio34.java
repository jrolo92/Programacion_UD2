package refuerzo.ud2;
import java.util.Scanner;
/**
 *
 * @author coleg
 */
public class Ejercicio34 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una calificacion");
        int nota;
        
        for (int i=1;i<=5;i++){
            nota=sc.nextInt();
            if (nota<5){
                System.out.println("Suspenso");         
            }
            System.out.println("Introduce la siguiente calificacion");
        }
    }
}
