package refuerzo.ud2;
import java.util.Scanner;
/**
 *
 * @author coleg
 */
public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nota de un alumno");
        int nota;
        int alumnosAprobado=0;
        int alumnosCondi=0;
        int alumnosSuspenso=0;
        
        for (int i=1;i<=6;i++){
            nota=sc.nextInt();
            System.out.println("Introduce nota de otro alumno");
            if (nota>=5){
                alumnosAprobado++;
            }
            if (nota==4){
                alumnosCondi++;
            }
            if (nota<=3){
                alumnosSuspenso++;
            }
        }
        

        System.out.println("Alumnos aprobados: "+alumnosAprobado);
        System.out.println("Alumnos condicionados: "+ alumnosCondi);
        System.out.println("Alumnos suspensos: "+ alumnosSuspenso);
    }
}
