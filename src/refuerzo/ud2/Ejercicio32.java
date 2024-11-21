package refuerzo.ud2;

/**
 *
 * @author coleg
 */
public class Ejercicio32 {
    public static void main(String[] args) {
        
        int sumaImpar=0;
        
        for (int i=1;i<=10;i++){
            if(i%2!=0){
                sumaImpar=i+sumaImpar;
            }
        }
        System.out.println(sumaImpar);
    }
}
