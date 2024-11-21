package refuerzo.ud2;
import java.util.Scanner;
/**
 *
 * @author coleg
 */
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        int edadAcumulada=0;
        int numAlumno=0;
        int mayoresEdad=0;
        int media;
        
        System.out.println("Introduzca las edades de los alumnos");
        System.out.println("Añada un numero negativo para terminar");
        
        do {
            edad =sc.nextInt();
            System.out.println("Introduzca siguiente edad");
               if (edad>=0){
                   edadAcumulada = edadAcumulada + edad;
                   numAlumno++;
                   if (edad>=18){
                       mayoresEdad++;
                   }
               }
        } while (edad>=0);
        
        media=edadAcumulada/numAlumno;
        
        System.out.println("La suma de todas las edades es: "+edadAcumulada);
        System.out.println("La media de edades es: "+media);
        System.out.println("El número total de alumnos es: "+numAlumno);
        System.out.println("La cantidad de alumnos mayores de edad es: "
                +mayoresEdad);
    }
}
