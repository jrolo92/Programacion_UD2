package programacion.ud2;
import java.util.Scanner;

public class Ejercicio23 {
    
    public static void main (String [] args){
        
        Scanner sc = new Scanner (System.in);
        
        //Pedimos un número al usuario
        System.out.println ("Introduzca un número entero:");

        /*Establecemos cuales van a ser los valores del rango por arriba y por 
        debajo, en nuestro caso queremos que sea un numero aleatorio y además 
        queremos que sea entero para que sea mas simple para el usuario. Vamos a
        establecer los números aleatorios y luego vamos a hacerles un casting
        para convertirlos en enteros.*/
        double a = Math.random()*100+1;
        double b = Math.random()*100+1;
        int rangoAbajo = (int) a;
        int rangoArriba =(int) b;
        
        /* Esto lo he hecho como comprobador del rango para ver si salía bien o no.
        System.out.println(rangoArriba);
        System.out.println(rangoAbajo);*/
        
        int n = sc.nextInt();
        
        /*Si n esta entre el rango entonces nos va a mostrar cual era el rango.
        Si n está fuera del rango no hará nada pero se mostrará n al final.*/
        
        if (n<rangoArriba && n>rangoAbajo){
            System.out.println("El rango es: (" + rangoAbajo + "," +
                    rangoArriba+")");
        }else {
        }
        System.out.println("El número introducido es:" + n);
    }
}
