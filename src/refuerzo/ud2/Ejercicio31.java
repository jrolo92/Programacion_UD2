package refuerzo.ud2;
import java.util.Scanner;
/**
 *
 * @author coleg
 */
public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int nTotal=0;
        double media;
        int i;
        
        for (i=0;i<10;i++){
            System.out.println("Introduzca un numero entero");
            n=sc.nextInt();
            nTotal=n+nTotal;
            
        }
        
        media=nTotal/i;
        System.out.println(media);
    }
}
