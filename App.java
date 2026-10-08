
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int contador=0;

        for (int i = 1; i <=5; i++) {
            System.out.println(" ingrese la temperatura " + i + ":");
            double temperatura=leer.nextDouble();
            
            if (temperatura > 35.0) {
                contador++;
                
            }

        }

        System.out.println("temperaturas mayores a 35 son " + contador);


    }

}
