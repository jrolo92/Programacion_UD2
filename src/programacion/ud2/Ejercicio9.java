
package programacion.ud2;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
                
        Scanner sc = new Scanner (System.in);
        /**Pido al usuario las 3 preguntas: si esta lloviendo, si ha terminado la tarea y si tiene que ir a la biblio.
         * Se obtienen las 3 respuestas en formato lógico: V/F.*/
        
        System.out.println("Está lloviendo?");
        boolean esLloviendo = sc.nextBoolean();
        
        System.out.println("Has terminado la tarea?");
        boolean esTareaFin = sc.nextBoolean();
        
        System.out.println ("Tienes que ir a la biblioteca?");
        boolean esBiblioteca = sc.nextBoolean ();
        
        /* Una vez tenemos las 3 respuestas creo otra vv booleana que tenga en cuenta
        que si no esta lloviendo y tengo la tarea terminada o tengo que ir a la biblio
        puedo salir a la calle*/
        boolean esSalir = !esLloviendo && esTareaFin || esBiblioteca;
        System.out.println ("Puedo salir a la calle: " + esSalir);
    }
}
