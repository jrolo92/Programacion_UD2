package refuerzo.ud2;
import java.util.Scanner;
/**
 *
 * @author coleg
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro numero:");
        int numero=sc.nextInt();
        
        if (numero>=10 && numero<=20){
            System.out.println("El número está entre 10 y 20");
        } if (numero>15){
            System.out.println("Además es mayor que 15");
        }
    }
}
