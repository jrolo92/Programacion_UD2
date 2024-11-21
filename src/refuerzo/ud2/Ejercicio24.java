package refuerzo.ud2;
import java.util.Scanner;
/**
 *
 * @author coleg
 */
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero");
        int n =sc.nextInt();
        if (n>=0){
            System.out.println("True");
        } else
            System.out.println("False");
    }
}
