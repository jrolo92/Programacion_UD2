package programacion.ud2;
import java.util.Scanner;

public class Ejercicio31 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        //Le podemos dar un valor a n o pedirselo al usuario (como en este caso).
        int n=sc.nextInt();

        //Invocamos el metodo de los saludos
        variosSaludos(n);
        /*Invocamos el metodo de la suma.Tb se puede definir una vv con la función e imprimir la vv 
        PE: s=suma(2,3) --> System.out.println(s);*/
       System.out.println (suma(2,3));
       
       /*Se podría usar como parámetro de una función el resultado de otra.PE:
        variosSaludos(suma(2,3));*/
    }
    
    public static void variosSaludos (int n){
                for (int i=0;i<n;i++){
                    System.out.println("Hola");
                }
    }
    
    public static int suma (int x, int y){
        int resultado;
        resultado= x + y;
        return(resultado);
    }
}
