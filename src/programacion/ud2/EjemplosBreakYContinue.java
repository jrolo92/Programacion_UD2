
package programacion.ud2;


public class EjemplosBreakYContinue {
    public static void main (String []args){
        
        //break: acaba el bucle, se sale, termina.
        int a=1;
        while (a<=10){
            System.out.println("la a vale " + a);
            if (a==2){
                break;
            }
            a++;
        }
        //continue: Detiene la iteracion actual pero no se acaba el bucle sino que sigue con la siguiente iteración
        int b =0;
        while (b<10) {
            b++;
            if (b%2==0){
                continue;
            }
            System.out.println("la b vale " + b);
        }
    }
}


