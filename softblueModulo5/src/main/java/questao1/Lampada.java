package questao1;
public class Lampada {
    
    private boolean ligadaOuDesligada;
    
    public Lampada(boolean ligadaDesligada){
        this.ligadaOuDesligada = ligadaDesligada;
    }
    
    public void ligar(){
        this.ligadaOuDesligada = true;
    }
    
    public void desligar(){
        this.ligadaOuDesligada = false;
    }
    
    public void imprimir(){
        if(this.ligadaOuDesligada == true){
            System.out.println("Lampada ligada");
        }else{
            System.out.println("Lampada desligada");
        }
    }
    
}
