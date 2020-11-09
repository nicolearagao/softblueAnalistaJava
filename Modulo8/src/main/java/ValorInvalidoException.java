
public class ValorInvalidoException extends Exception {
    
    private double valor;
  
    
    
    public ValorInvalidoException(double valor){
        System.out.println("Valor invalido: " +getValor());
        this.valor = valor;
        
    }
    
    
    public double getValor(){
        return valor;
    }
    
   
}
