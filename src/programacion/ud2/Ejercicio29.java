
package programacion.ud2;


public class Ejercicio29 {
    public static void main (String[]args){
        for (int i=1;i<11;i++){
            System.out.println(" ");
            System.out.println("Tabla del " + i);
            
            for(int j=0;j<11;j++){
                System.out.println(i +"x"+ j +"="+ i*j);
            }
        }
    }
}