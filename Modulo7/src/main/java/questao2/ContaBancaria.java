package questao2;
public abstract class ContaBancaria {
    
    protected double saldo;
    
    
    public void getSaldo(){
        System.out.println("Saldo:" +this.saldo);
    }
    public void depositar(double dinheiro){
        this.saldo = this.saldo + dinheiro;
    }
    
    public void sacar(double dinheiro){
        this.saldo = this.saldo - dinheiro;
    }
    
    public void transferir(double dinheiro, ContaBancaria x){
        this.saldo = this.saldo - dinheiro;
        x.saldo = x.saldo + dinheiro;
    }
    
    public abstract void calcularSaldo();
}
