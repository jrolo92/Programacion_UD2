package refuerzo.ud2;
import java.util.Scanner;
/**
 *
 * @author coleg
 */
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int alturaMax=0;
        int etiquetaArbolMayor=1;
        int etiqueta=1;
        System.out.println("Introduce altura:");
        int altura=sc.nextInt();
        
        do{         
            if (alturaMax<altura){
                alturaMax=altura;
                etiquetaArbolMayor=etiqueta;
            }
            System.out.println("Introduce siguiente altura:");
            altura=sc.nextInt();
            etiqueta++;
            
        } while (altura!=-1);
        
        System.out.println("El arbol mas alto es el número: "+ etiquetaArbolMayor+
                " con una altura de "+ alturaMax);
    }
}
