
package programacion.ud2;
import java.util.Scanner;

public class Ejercicio24 {
    public static void main (String []args){
        // Declaración de vv
        Scanner sc =new Scanner (System.in);
        System.out.println("Introduzca la primera edad del grupo:");
        
        int edad = sc.nextInt();
        int max= edad;
        int min= edad;

        //Introducir edades hasta que se introduzca -1
        while (edad !=-1){
  
        //Calcular edad máxima
            if (max<edad){
                max=edad;
            } 
       
        //Calcular edad mínima
            if (min>edad){
                min=edad;
            }
            System.out.println("Introduzca la siguiente edad:");
            edad =sc.nextInt();
        }
        //Imprimir edad máxima y minima
        System.out.println("La edad máxima del grupo es: " + max + 
                " y la edad mímima del grupo es: " + min);    
        
    }
}
