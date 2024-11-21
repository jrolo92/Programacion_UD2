package ampliacion.ud2;
import java.util.Scanner;

public class Ejercicio52 {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        System.out.println("Introduzca un número:");
        int n= sc.nextInt();
        System.out.println(esPrimo(n));
        
    }
    
    public static boolean esPrimo(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
            return false;
            }
        }return true;
    }
}
