/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

/**
 *
 * @author nicole
 */
public class ContaInvestimento extends ContaBancaria {

    @Override
    public void calcularSaldo() {
        this.saldo = this.saldo + ((this.saldo/100) * 5);
    }
    
}
