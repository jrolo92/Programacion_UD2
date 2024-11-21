
package programacion.ud2;


public class Ejercicio13 {
    public static void main (String[] args){
        
        /*En la siguiente expresión se nos está proponiendo que:
        20>20 ya que primero va la * y luego la + Y 4 es 4
        la primera condición no se cumple así que su valor será False
        */
        System.out.println (10+5*2>20&& 4==4);
        
        /*La siguiente expresión será verdadera si:
        No se cumple que 10 sea mayor que 10 O 6 es igual a 6
        Ambas condiciones son correctas por tanto su valor es True
        */
        System.out.println (!(7+3>10)||3*2<=6);
        
        /*La siguiente expresión nos dice que
        5+15=20 es igual que 19 Y verdadero
        No se cumple la primera condición así que dará False
        */
        System.out.println (10/2+3*5==19&&true);
        
        /*
        Será true ya que 3*2=6 y x+ tambien es 6 x=5+1
        */
        int x=5;
        x+=3*2;
        
        /*
        Sera verdadero ya que no se cumple la primera condición falso no es verdadero
        se cumple la segunda condicion que es que 7mod2 es igual a 1
        */
        boolean b= false;
        b=!b ||7%2==1;
    }
}
