
public class SaldoInsuException extends Exception{
    
    
    private double valor;
    private double saldo;
    
    
    public SaldoInsuException(double valor, double saldo){
        System.out.println("Saldo insuficiente.");
        this.valor = valor;
        this.saldo = saldo;
    }
    
    public double getValor(){
        return valor;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    
}
