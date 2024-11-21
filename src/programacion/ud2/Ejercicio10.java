
package programacion.ud2;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner (System.in);
        /*Como son fijos vamos a meter los precios como constantes
        se pone f al final y el nombre en mayusculas y separado por _ */
        final float PRECIO_MAN = 2.35f;
        final float PRECIO_PER = 1.95f;
        
        System.out.println ("Introduzca la cantidad de manzanas vendidas el primer semestre (kg):");
        float man1 = sc.nextFloat ();
        
        System.out.println ("Introduzca la cantidad de peras vendidas el primer semestre (kg):");
        float per1 = sc.nextFloat ();
        
        man1 *= PRECIO_MAN;
        per1 *= PRECIO_PER;
        
        float ventasSemestre1= man1+per1;
        
        System.out.println ("El importe total del primer semestre ha sido: " + ventasSemestre1);
        
        System.out.println ("Introduzca la cantidad de manzanas vendidas el segundo semestre (kg):");
        float man2 = sc.nextFloat ();
        
        System.out.println ("Introduzca la cantidad de peras vendidas el segundo semestre (kg):");
        float per2 = sc.nextFloat ();
        
        man2 *= PRECIO_MAN;
        per2 *= PRECIO_PER;
        
        float ventasSemestre2 = man2+per2;
        
        System.out.println ("El importe total del segundo semestre ha sido: " + ventasSemestre2);
        
        float ventasAnuales = ventasSemestre1+ventasSemestre2;
        
        System.out.println("El importe anual de ventas ha sido: " + ventasAnuales);
    }
    
}
