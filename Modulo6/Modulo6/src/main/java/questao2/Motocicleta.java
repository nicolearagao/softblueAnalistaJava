package questao2;
public class Motocicleta extends Veiculo{
    
    
    @Override
    public void ligar(){
        super.ligar();
        System.out.println("Essa moto esta ligada");
    }
    
    @Override
    public void desligar(){
        super.desligar();
        System.out.println("Essa moto esta desligada");
    }
}
