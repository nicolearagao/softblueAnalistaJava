/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicole
 */

package questao1;
public class Matematica {
    
    
    public static Double converterAngulo(Double angulo, TipoAngulo tipo){
        if(tipo == TipoAngulo.GRAUS){
            return angulo = Math.toRadians(angulo);
        }
        

            return angulo = Math.toDegrees(angulo);
        
    }
    
    public static Integer somar(Integer n1, Integer n2, Integer n3){
        return n1 + n2 + n3;
    }
    
    public static Integer converterBinarioParaDecimal(String numBinario){
       int num = Integer.parseInt(numBinario,2);
       Integer num2 = num;
       
       return num2;
       
    }
}
