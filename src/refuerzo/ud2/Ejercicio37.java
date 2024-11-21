package refuerzo.ud2;
import java.util.Scanner;
/**
 *
 * @author coleg
 */
public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce dos números");
        int a= sc.nextInt();
        int b= sc.nextInt();
        rango(a,b);
    }
    
    public static int rango(int a, int b){
        int i;
        for (i=a;i<=b;i++){
            System.out.print(i);
        } return i;
    }
}
