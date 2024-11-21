package refuerzo.ud2;
import java.util.Scanner;
/**
 *
 * @author coleg
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca su edad");
        int edad = sc.nextInt();
        String estado;
        
        estado=edad>18?"Es mayor de edad":"Es menor de edad";
        System.out.println(estado);
    }
}
