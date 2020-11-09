
import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {

    public static void main(String[] args) {
        ContaBancaria a = new ContaBancaria(100.0);
        ContaBancaria b = new ContaBancaria(0.0);

        try {
         ContaBancaria c = null;
         c.toString();
            
           
        } catch (NullPointerException e){
            System.out.println("Objeto e nulo.");
        }

    }

}
