package questao2;
public class Automovel extends Veiculo {
    
   
    @Override
    public void ligar(){
        super.ligar();
        System.out.println("Esse veiculo esta ligado");
    }
    
    @Override
    public void desligar(){
        super.desligar();
        System.out.println("Esse veiculo esta desligado");
    }
}
