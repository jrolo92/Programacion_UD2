package programacion.ud2;
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner (System.in);
        System.out.println("Introduzca un número para calcular su factorial:");
        int n = sc.nextInt();
        int fact=1;
        
        for (int i=n;i>=1;i--){
            //en fact se acumula el valor del factorial
            fact =i*fact;
        }
        
        System.out.println(n +"!: "+fact);
    }
}
