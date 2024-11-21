package programacion.ud2;
import java.util.Scanner;

public class Ejercicio25 {
    public static void main (String[]args){
        
        int numAciertos=0;
        int sumaUsuario;
        int sumando1;
        int sumando2;
        
        /*Tambien se podría hacer directamente el casting al definir las vv 
        */
       
        do {
            Scanner sc = new Scanner (System.in);
            System.out.println("Responde correctamente el resultado.");
            
           /* double x = Math.random()*100;
            double y = Math.random()*100;
            //hacemos una conversion explicita mediante un casting
            int sumando1 = (int)x;
            int sumando2 = (int)y;
            */
            sumando1=(int)(Math.random()*100+1);
            sumando2=(int)(Math.random()*100+1);
            System.out.println("Operación: " + sumando1 + " + " + sumando2);
            sumaUsuario = sc.nextInt();
            
            //ahora vamos a ir acumulando los aciertos para poder mostrar el total al final.
            numAciertos++;
            
        } while (sumando1 + sumando2 == sumaUsuario);
        System.out.println ("Has fallado. Número de aciertos: " + numAciertos);
        
    }
}
