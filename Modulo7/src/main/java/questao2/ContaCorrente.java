
package questao2;

/**
 *
 * @author nicole
 */
public class ContaCorrente extends ContaBancaria {

   

    
    
    
    @Override
    public void calcularSaldo() {
        this.saldo = this.saldo - ((this.saldo/100) * 10);
        }
    
}
