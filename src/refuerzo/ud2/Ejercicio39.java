package refuerzo.ud2;
/**
 *
 * @author coleg
 */
public class Ejercicio39 {
    public static void main(String[] args) {

        char v = 'C';
        esVocal(v);
    }
    
    public static boolean esVocal(char v){
        if (v=='A' || v=='E' || v=='I' || v=='O' || v=='U'){
            return true;
        }return false;
    }
}
