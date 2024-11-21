
package programacion.ud2;


public class EjemploMetodo {
    public static void main (String[]args){
        int n=5;
        //Se invoca la funcion en el print en este caso
        System.out.println(calcularDoble(n));
    }
    
    /*
    Creamos una funcion que nos va a devolver el doble del numero que introduzcamos
    */
    public static int calcularDoble(int n){
        return n*2;
    }
}
