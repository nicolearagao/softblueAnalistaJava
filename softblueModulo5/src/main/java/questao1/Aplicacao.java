package questao1;
public class Aplicacao {
    public static void main(String[] args) {
        
        Lampada nova = new Lampada(true);
        
        nova.imprimir();
        
        nova.desligar();
        nova.imprimir();
    }
}
