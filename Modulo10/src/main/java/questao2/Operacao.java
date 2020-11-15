/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicole
 */
package questao2;
public enum Operacao {
    
    SOMA('+'),
    SUBTRACAO('-'),
    MULTIPLICACAO('*'),
    DIVISAO('/');
    
    private char symbol;
    
    private Operacao(char symbol){
       this.symbol = symbol; 
    }
    
    public char getSymbol(){
        return symbol;
    }
    
    public double calcular(double x, double y){
       if(this == SOMA){
           return x + y;
       } 
       if(this == SUBTRACAO){
           return x - y;
       }
       
       if (this == MULTIPLICACAO){
           return x * y;
       }
       
       if(this == DIVISAO){
           return x / y;
       }
       
       else{
           throw new UnsupportedOperationException("This calculus cant be done");
       }
    }
    
    public String toString(){
        return String.valueOf(symbol);
    }
}
