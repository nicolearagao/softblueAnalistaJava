
package questao2;

/**
 *
 * @author nicole
 */
public class Application {
    
    
    
    public static void main(String[] args) {
        
        
        ContaCorrente b = new ContaCorrente();
        ContaInvestimento c = new ContaInvestimento();
        
        
       b.depositar(100);
       b.getSaldo();
       
       b.transferir(100, c);
       b.getSaldo();
       c.getSaldo();
       
       b.depositar(200);
       b.calcularSaldo();
       b.getSaldo();
       
       
       c.calcularSaldo();
       c.getSaldo();
    }
}
