/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicole
 */
public class ContaBancaria {
    
    private double saldo;
    
    public ContaBancaria (double saldo){
        this.saldo = saldo;
    }
    
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void sacar(double dinheiro) throws ValorInvalidoException, SaldoInsuException{
        if (dinheiro <= 0){
            throw new ValorInvalidoException(dinheiro);
        }
        if(dinheiro > saldo){
            throw new SaldoInsuException(dinheiro, saldo);
        }
        
        this.saldo = this.saldo - dinheiro;
    }
    
    public void depositar(double dinheiro)throws ValorInvalidoException, SaldoInsuException{
        if (dinheiro <= 0){
            throw new ValorInvalidoException(dinheiro);
        }
      
        
        this.saldo = this.saldo + dinheiro;
    }
    
    public void transferir (double dinheiro, ContaBancaria c) throws ValorInvalidoException, SaldoInsuException{
        if (dinheiro <= 0){
            throw new ValorInvalidoException(dinheiro);
        }
        
        if(dinheiro > this.saldo){
            throw new SaldoInsuException(dinheiro, saldo);
        }
        this.saldo = this.saldo - dinheiro;
        c.saldo = c.saldo + dinheiro;
    }
    
    
}
