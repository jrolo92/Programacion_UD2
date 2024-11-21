package programacion.ud2;
import java.util.Scanner;

public class Ejercicio22 {
    public static void main (String[]args){
        Scanner sc=new Scanner (System.in);
       
        //Le preguntamos la primera vez fuera del bucle
        System.out.println("Introduzca un número o pulse 0 para salir:");
        int  n = sc.nextInt();
        
        while (n!=0) {
           
           //Calculos si es par
           if (n % 2 == 0) {
               System.out.println ("El número es par");
           } else {
               System.out.println ("El número es impar");
           }
            //Calculos si es positivo o negativo
           if (n>0){
               System.out.println ("El número es positivo");             
           } else {
               System.out.println ("El número es negativo");
           }         
           //Calculo del cuadrado
           System.out.println ("Su cuadrado es : " + Math.pow(n, 2));  
           
           //Antes de acabar el bucle le volvemos a preguntar y a pedir otro número
           System.out.println("Introduzca otro número o pulse 0 para salir:");
           n = sc.nextInt();
        }
                
    }

}
