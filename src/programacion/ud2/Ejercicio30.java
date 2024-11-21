
package programacion.ud2;
import java.util.Scanner;

public class Ejercicio30 {
    public static void main (String[]args){
        
        Scanner sc =new Scanner (System.in);
        System.out.println("Introduzca un número");
        int n = sc.nextInt();
        /*
        La i van a ser las filas (horizontal) y la j las columnas (vertical)
        Desde i=1 hasta n aumentando en 1 la i cada paso
        Desde j=1 hasta i aumentando en 1 la j en cada paso
        */
        //for (int i=1;i<=n;i++){
            
          //  for (int j = 1;j<=i;j++){
                
           //   System.out.println("*");  
           // }
       // }
       for (int i = n; i>=1;i--){
           for (int j=1;j<=i;j++){
               //Este print nos imprime el asterisco
               System.out.print("*");
           }
           //Este print nos permite solo saltar de linea cada vez que se acabe la fila
           System.out.println();
       }
    }
}
