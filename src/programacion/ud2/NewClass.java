package programacion.ud2;
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        double a = Math.random()*100+1;
        double b = Math.random()*100+1;
        int rangoAbajo = (int) a;
        int rangoArriba =(int) b;
        if (rangoAbajo>rangoArriba)
        System.out.println("[" + rangoArriba + " , " + rangoAbajo + "]");
    }
