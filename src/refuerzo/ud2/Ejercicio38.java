package refuerzo.ud2;
import java.util.Scanner;



ESTE EJERCICIO CREO QUE NO ESTA BIEN
/**
 *
 * @author coleg
 */
public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        double PI=3.141592;
        System.out.println("Introduzca radio");
        double radio=sc.nextDouble();
        System.out.println("Introduzca altura");
        double altura=sc.nextDouble();
        areaOVolumen(PI,radio,altura);
    }
    
    public static double areaOVolumen (double PI, double radio, double altura){
        Scanner sc = new Scanner(System.in);
        System.out.println("Si quieres calcular el área pulsa 1");
        System.out.println("Si quieres calcular el volumen pulsa 1");
        int opcion= sc.nextInt();
        switch (opcion){
            case 1: 
                double area= 2*PI*radio*(altura+radio);
                System.out.println(area);
                break;
            case 2:
                double volumen=PI*(radio*radio)*altura;
                System.out.println(volumen);
                break;
            default: System.out.println("Error");                
        } return opcion;
    } 
}
